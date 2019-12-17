package paul.projects.firstjavaangularprogram;

import java.util.stream.Stream;

import paul.projects.firstjavaangularprogram.entities.User;
import paul.projects.firstjavaangularprogram.repositories.UserRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstJavaAngularProgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstJavaAngularProgramApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(UserRepository userRepository) {
		return args -> {
			Stream.of("Paul", "Grant", "Cindy", "Luyi", "Bob", "Casey").forEach(name -> {
				userRepository.save(new User(name, name.toLowerCase() + "@madeupmail.com"));
			});
			userRepository.findAll().forEach(System.out::println);
		};
	}
}
