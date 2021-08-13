package cybersoft.javabackend.java12.gira.role.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import cybersoft.javabackend.java12.gira.role.util.HttpMethods;

public class ProgramDto {
	@NotBlank(message = "")
	@Size(min = 1, max = 250)
	@Column(unique = true)
	private String name;
	private HttpMethods method; //safe type
	
	@NotBlank(message = "")
	private String path;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HttpMethods getMethod() {
		return method;
	}

	public void setMethod(HttpMethods method) {
		this.method = method;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
