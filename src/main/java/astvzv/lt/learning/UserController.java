package astvzv.lt.learning;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class UserController {

    private final BggService bggService;

    public UserController(BggService bggService) {
        this.bggService = bggService;
    }

    @GetMapping("/user1/{username}")
    public ResponseEntity<User> getUser(@PathVariable String username) {
        try {
            User user = bggService.getUser(username);
            return ResponseEntity.ok(user);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        }
    }
}
