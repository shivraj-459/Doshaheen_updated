package com.doshaheen.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doshaheen.model.UserData;



@Repository
public interface UserDAO extends JpaRepository<UserData,Integer>{

	public Optional<UserData> findByEmail(String email);
	
}
