package paul.small.projects.simpleservice.representations;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

	private String name;

	private String surname;

	private int age;

	private List<String> hobbies;
}
