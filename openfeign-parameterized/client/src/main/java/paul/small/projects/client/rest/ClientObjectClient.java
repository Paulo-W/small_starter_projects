package paul.small.projects.client.rest;

import paul.small.projects.common.representations.ClientObject;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value ="person-client", url = "${server-url}")
public interface ClientObjectClient extends SimpleClient<ClientObject> {
}
