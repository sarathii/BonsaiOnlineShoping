package com.Bonsai.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table()
public class UserDetail {
	@Id
String username;
	
public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getAdrs() {
		return adrs;
	}

	public void setAdrs(String adrs) {
		this.adrs = adrs;
	}

	

String password,role,enabled,adrs;
}
