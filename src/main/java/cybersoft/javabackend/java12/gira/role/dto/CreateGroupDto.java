package cybersoft.javabackend.java12.gira.role.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateGroupDto {
	
	@NotNull
	@Size(min = 3, max = 255, message = "{group.name.size}")
	private String name;
	private String description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
