package paul.small.projects.client.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "api-client", url = "${server-url}")
public interface SimpleClient<T> {

	@GetMapping("/simple-api")
	T getObjects(@RequestParam String function);
}
