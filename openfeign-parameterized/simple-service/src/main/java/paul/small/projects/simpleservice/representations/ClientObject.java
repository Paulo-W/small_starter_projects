package paul.small.projects.simpleservice.representations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientObject {

	@JsonProperty("full-name")
	private String fullName;

	private String company;

	@JsonProperty("employee-number")
	private long employeeNumber;

	@JsonProperty("employee-role")
	private String employeeRole;
}
