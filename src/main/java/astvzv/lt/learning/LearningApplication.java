package astvzv.lt.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningApplication.class, args);
	}

	@RestController
	class ApiController {

		private final BggService bggService;

		public ApiController(BggService bggService) {
			this.bggService = bggService;
		}

		@GetMapping("/api/echo")
		public ResponseEntity<Map<String, String>> echo(@RequestParam String message) {

			Map<String, String> response = new HashMap<>();
			response.put("message", message + " (echoed)");

			return ResponseEntity.ok(response);
		}

		@GetMapping("/api/getGamesList/{userid}")
		public String getGamesList(@PathVariable String userid) {
			return "Games list for user: " + userid;
		}

		@GetMapping(value = "/user/{username}", produces = "application/json")
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
}
