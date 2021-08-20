package cybersoft.javabackend.java12.gira.role.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import cybersoft.javabackend.java12.gira.common.entity.BaseEntity;
import cybersoft.javabackend.java12.gira.role.util.HttpMethods;

@Entity
@Table(name = "gira_program")
public class Program extends BaseEntity {
	@NotNull
	@Size(min = 1, max = 250, message = "{program.name.size}")
	@Column(unique = true)
	private String name;
	
	@NotNull
	private HttpMethods method; //safe type
	
	
	@NotNull
	private String path;
	
	@ManyToMany(mappedBy = "programs", fetch = FetchType.LAZY)
	@JsonIgnore
	private Set<Role> roles = new HashSet<>();	
	
	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

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
