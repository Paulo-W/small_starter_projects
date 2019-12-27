package paul.small.projects.simpleservice.rest;

import lombok.RequiredArgsConstructor;
import paul.small.projects.client.rest.SimpleClient;
import paul.small.projects.simpleservice.representations.Person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SimpleServiceController {

	private final SimpleClient<Person> simpleClient;

	@GetMapping("/person")
	public Person getPerson() {
		return simpleClient.getObjects("person");
	}

}
