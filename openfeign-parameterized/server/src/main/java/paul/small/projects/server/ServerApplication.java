package paul.small.projects.server;

import paul.small.projects.server.rest.SimpleController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This server application is meant to reassemble a microservice api.
 * It is rare that you will not create separate endpoints for returning
 * different objects but for the sake of this example this api takes in a
 * single string as input and from that returns a filtered unique response for
 * different strings sent in.
 *
 * @see SimpleController
 */

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

}
