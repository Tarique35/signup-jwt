package com.example.JWT.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.JWT.models.User;
import com.example.JWT.services.UserService;

//http://localhost:8081/home/user
@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	UserService userServiceObj;

	@GetMapping("/user")
	public List<User> getUser() {
		System.out.println("printing user...");
		List<User> userObj = userServiceObj.getUsers();
		return userObj;
	}

	@GetMapping("/currentuser")
	public String getLoggedInUser(Principal principal) {// getting the details of current user through spring
														// security(principal also belongs to spring security)
		return principal.getName();
	}
}
