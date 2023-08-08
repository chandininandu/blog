package com.ssd.log.projectlog.postDto;

import java.util.Set;

import com.ssd.log.projectlog.entity.Role;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

public class UserDto { private Long id;
private String name;

private String username;
private String email;
private String password;

@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
@JoinTable(name = "users_roles",
        joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id")
)
private Set<Role> roles;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Set<Role> getRoles() {
	return roles;
}

public void setRoles(Set<Role> roles) {
	this.roles = roles;
}

public UserDto(Long id, String name, String username, String email, String password,
		Set<com.ssd.log.projectlog.entity.Role> roles) {
	super();
	this.id = id;
	this.name = name;
	this.username = username;
	this.email = email;
	this.password = password;
	this.roles = roles;
}

public UserDto(String name, String username, String email, String password, Set<com.ssd.log.projectlog.entity.Role> roles) {
	super();
	this.name = name;
	this.username = username;
	this.email = email;
	this.password = password;
	this.roles = roles;
}

@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", password="
			+ password + ", roles=" + roles + "]";
}
public UserDto() {
	
}
}
