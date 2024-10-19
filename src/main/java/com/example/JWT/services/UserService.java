package com.example.JWT.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.JWT.models.User;

@Service
public class UserService {

	private List<User> store = new ArrayList<>();
	
	public UserService() {
//		store.add(new User(UUID.randomUUID().toString(),"Tarique Ansari","tarique@gmail.com"));
//		store.add(new User(UUID.randomUUID().toString(),"Tarique Ansari2","tarique2@gmail.com"));
//		store.add(new User(UUID.randomUUID().toString(),"Tarique Ansari3","tarique3@gmail.com"));
//		store.add(new User(UUID.randomUUID().toString(),"Tarique Ansari4","tarique4@gmail.com"));
	}
	
	public List<User> getUsers(){
		return this.store;
	}
}
