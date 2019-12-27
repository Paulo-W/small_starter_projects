package paul.small.projects.simpleservice.rest;

import lombok.RequiredArgsConstructor;
import paul.small.projects.client.rest.SimplePersonClient;
import paul.small.projects.common.representations.Person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SimpleServiceController {

	private final SimplePersonClient simpleClient;

	@GetMapping("/person")
	public Person getPerson() {
		return simpleClient.getObjects("person");
	}

}
