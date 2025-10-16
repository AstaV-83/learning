package astvzv.lt.learning;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class BggService {

    private final XmlMapper xmlMapper;
    private final UserMapper userMapper;
    private final WebClient webClient = WebClient.builder()
            .baseUrl("https://boardgamegeek.com")
            .build();

    public BggService(UserMapper userMapper) {

        this.xmlMapper = new XmlMapper();
        this.userMapper = userMapper;
    }

    public User getUser(String username) {

        try {
            String xml = webClient.get()
                    .uri(uriBuilder -> uriBuilder.path("/xmlapi2/user")
                            .queryParam("name", username)
                            .build())
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();

            XmlUser xmlUser = xmlMapper.readValue(xml, XmlUser.class);
            return userMapper.toUser(xmlUser);
        } catch (Exception e) {
            // throw new Exception("Failed to fetch or parse user data", e);
            return null;
        }
    }
}
