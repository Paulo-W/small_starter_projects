package paul.small.projects.common.representations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Interesting that all properties need to have a jsonProperty mapping even
 * though the names sent back match variable names
 *
 * @see Person
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientObject {

	@JsonProperty("full-name")
	private String fullName;

	@JsonProperty("company")
	private String company;

	@JsonProperty("employee-number")
	private long employeeNumber;

	@JsonProperty("employee-role")
	private String employeeRole;
}
