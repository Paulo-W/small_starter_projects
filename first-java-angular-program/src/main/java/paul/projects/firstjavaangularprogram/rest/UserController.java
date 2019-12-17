package paul.projects.firstjavaangularprogram.rest;

import java.util.List;

import com.google.common.collect.ImmutableList;
import lombok.RequiredArgsConstructor;
import paul.projects.firstjavaangularprogram.entities.User;
import paul.projects.firstjavaangularprogram.repositories.UserRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor
public class UserController {

	private final UserRepository userRepository;

	@GetMapping("/user")
	public List<User> getUsers() {
		return ImmutableList.copyOf(userRepository.findAll());
	}

	@PostMapping
	public void addUser(@RequestBody User user) {
		userRepository.save(user);
	}
}
