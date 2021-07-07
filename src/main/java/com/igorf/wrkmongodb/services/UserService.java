package com.igorf.wrkmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igorf.wrkmongodb.domain.User;
import com.igorf.wrkmongodb.dto.UserDTO;
import com.igorf.wrkmongodb.repository.UserRepository;
import com.igorf.wrkmongodb.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}	
	
	public User findById(String id) {
		Optional<User> user = repo.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
	}
	
	public User	insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDTO(UserDTO obj) {
		return new User(obj.getId(), obj.getName(), obj.getEmail());

	}
	
	public User update(User obj) {
<<<<<<< HEAD
		User newObj = findById(obj.getId());
=======
		User newObj = this.findById(obj.getId());
>>>>>>> bfd178bd7270d062fa9093576c958a6c2d82646f
		updateData(newObj, obj);
		return repo.save(newObj);
	}
	
	private void updateData(User newObj, User obj) {
		newObj.setEmail(obj.getEmail());
		newObj.setName(obj.getName());
	}

	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
}
