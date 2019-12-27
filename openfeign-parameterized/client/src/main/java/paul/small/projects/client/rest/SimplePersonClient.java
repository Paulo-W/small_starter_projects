package paul.small.projects.client.rest;

import paul.small.projects.common.representations.Person;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value ="simple-person-client", url = "${server-url}")
public interface SimplePersonClient extends SimpleClient<Person> {
}
