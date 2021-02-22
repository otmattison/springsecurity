package com.hcl.springsecurity.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.hcl.springsecurity.dto.UserDTO;
import com.hcl.springsecurity.model.User;

public interface UserService extends UserDetailsService{
	User save(UserDTO userDto);
}