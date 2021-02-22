package com.hcl.springsecurity.dto;

import lombok.Data;

public @Data class UserDTO {

	private String firstName;
	private String lastName;
	private String username;
	private String password;

	public UserDTO() {

	}

	public UserDTO(String firstName, String lastName, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
	}
}
