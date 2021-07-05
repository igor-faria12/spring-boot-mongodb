package com.igorf.wrkmongodb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.igorf.wrkmongodb.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@RequestMapping(method=RequestMethod.GET) // ou @GetMapping
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("1", "Maria Silva", "maria@email.com");
		User jose = new User("Jose", "Jose Alves", "jose@email.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, jose));
		return ResponseEntity.ok().body(list);
	}
}
