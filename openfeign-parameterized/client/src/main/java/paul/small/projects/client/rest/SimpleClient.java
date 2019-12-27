package paul.small.projects.client.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface SimpleClient<T> {

	@GetMapping("/simple-api")
	T getObjects(@RequestParam String function);
}
