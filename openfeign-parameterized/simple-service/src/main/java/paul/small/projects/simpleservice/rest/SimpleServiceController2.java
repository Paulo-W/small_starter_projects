package paul.small.projects.simpleservice.rest;

import lombok.RequiredArgsConstructor;
import paul.small.projects.client.rest.ClientObjectClient;
import paul.small.projects.common.representations.ClientObject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SimpleServiceController2 {

	private final ClientObjectClient simpleClient;

	@GetMapping("/client")
	public ClientObject getPerson() {
		return simpleClient.getObjects("client");
	}

}
