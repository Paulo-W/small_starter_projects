package paul.small.projects.simpleservice.rest;

import lombok.RequiredArgsConstructor;
import paul.small.projects.client.rest.SimpleClient;
import paul.small.projects.simpleservice.representations.ClientObject;
import paul.small.projects.simpleservice.representations.Person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SimpleServiceController2 {

	private final SimpleClient<ClientObject> simpleClient;

	@GetMapping("/client")
	public ClientObject getPerson() {
		return simpleClient.getObjects("client");
	}

}
