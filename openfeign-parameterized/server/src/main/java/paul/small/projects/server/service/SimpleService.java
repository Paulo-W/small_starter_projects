package paul.small.projects.server.service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleService {

	@Bean
	public Function<String, Map<String, Object>> getFunction() {
		return function ->
				"person".equals(function) ? getPersonObject() : getClientObject();
	}


	private Map<String, Object> getPersonObject() {
		return Map.of(
				"name", "Paul",
				"surname", "Wood",
				"age", 23,
				"hobbies", List.of("Programming", "Gaming", "Netflix")
		);
	}

	private Map<String, Object> getClientObject() {
		return Map.of(
				"fullName", "Paul Wood",
				"company", "EPI",
				"employeeNumber", 1234567,
				"employeeRole", "Backend Developer"
		);
	}

}
