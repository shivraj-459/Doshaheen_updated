package com.doshaheen.service;

import com.doshaheen.exception.UserException;
import com.doshaheen.model.UserDTO;
import com.doshaheen.model.UserData;

public interface UserService {
	
	public UserDTO addUser(UserData user) throws UserException;

}
