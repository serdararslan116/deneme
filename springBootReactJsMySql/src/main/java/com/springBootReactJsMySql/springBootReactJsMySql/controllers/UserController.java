package com.springBootReactJsMySql.springBootReactJsMySql.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springBootReactJsMySql.springBootReactJsMySql.entities.User;
import com.springBootReactJsMySql.springBootReactJsMySql.repos.UserRepository;
import java.util.List;
import java.util.Optional;

@RestController 
@RequestMapping("/users")
public class UserController {
	
	private UserRepository userRepository;
	
	public UserController(UserRepository userRepository) {
		this.userRepository=userRepository;
	}

	  @GetMapping
	  public List<User> getAllUsers(){
		  return userRepository.findAll();
	  }
	  
	  @PostMapping 
	  public User createUser(@RequestBody User newUser) {
		  return userRepository.save(newUser);
	  }
	 
	  @GetMapping("/{userId}")
	  public User getOneUser(@PathVariable Long userId) {
		  //custom exception
			return userRepository.findById(userId).orElse(null);
	  }
	  
	  @PutMapping("/{userId}")
	  public User updateOneUser(@PathVariable Long userId,@RequestBody User newUser) {
		  Optional<User> user =userRepository.findById(userId);
		  if(user.isPresent()) {
			  User foundUser = user.get();
			  foundUser.SetUserName(newUser.getUserName());
			  foundUser.SetPassword(newUser.getPassword());
			  userRepository.save(foundUser);
			  return foundUser;
		  }else {
			  return null;
		  }
	  }
	  
	  @DeleteMapping("/{userId}")
	  public void deleteOneUser(@PathVariable Long userId) {
		  userRepository.deleteById(userId);
		  
	  }
	  
	  
}
