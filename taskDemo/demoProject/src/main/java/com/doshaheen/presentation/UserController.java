package com.doshaheen.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.doshaheen.exception.UserException;
import com.doshaheen.model.UserDTO;
import com.doshaheen.model.UserData;
import com.doshaheen.service.UserService;

import jakarta.validation.Valid;

@CrossOrigin(origins = "*")
@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/addusers")
	public ResponseEntity<UserDTO> addUserHandler(@Valid @RequestBody UserData user) throws UserException{
	
		
		UserDTO userDTO=userService.addUser(user);
		
		return new ResponseEntity<UserDTO>(userDTO, HttpStatus.OK);
	}
	
	
	
}
