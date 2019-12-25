package paul.small.projects.server.rest;

import java.util.Map;
import java.util.function.Function;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * In most cases it is unlikely you will want to unify endpoints that return different
 * objects. But in programming I have learn't to never say never.
 *
 * The reason I initially needed something like this was rather strange but it may make sense when
 * you understand the complexities that can arise from managing multiple microservices.
 *
 * I needed to make use of an external api (one outside of my company) for arguments sake lets say azure
 * (it was not azure). I needed to make use of "azure" and have dependencies for this external library in
 * a lot of places, see this api also had a bunch of dependencies I needed to import into my maven package.
 * So instead of we decided to make a internal api service for the external api service.
 * Great all dependencies and api restriction in one place, then all the clients needed to do was
 * send in what api function to call and there you go.
 *
 * But that required conversions on either end if only there was a way I could return a representation of
 * what was needed generically because I am essentially doing the same thing on this side, call the api
 * and get a response.
 */

@RestController
@RequiredArgsConstructor
public class SimpleController {

	private final Function<String, Map<String, Object>> getFunction;

	@GetMapping("/simple-api")
	public Map<String, Object> readApi(@RequestParam String function) {
		return getFunction.apply(function);
	}
}
