package com.doshaheen.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doshaheen.exception.UserException;
import com.doshaheen.model.UserDTO;
import com.doshaheen.model.UserData;
import com.doshaheen.repo.UserDAO;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public UserDTO addUser(UserData user) throws UserException {


		Optional<UserData> optional= userDAO.findByEmail(user.getEmail());
		
		if(optional.isPresent()) {
			
		   throw new UserException("user already present with this mail");
		   
		}
		
	    userDAO.save(user);
	    
	    UserDTO userDTO=new UserDTO();
	    
	    userDTO.setEmail(user.getEmail());
	    userDTO.setUserName(user.getUserName());
	    
	    
	    return userDTO;
		
		
	}

}
