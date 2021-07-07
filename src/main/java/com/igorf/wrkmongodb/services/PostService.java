package com.igorf.wrkmongodb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igorf.wrkmongodb.domain.Post;
import com.igorf.wrkmongodb.repository.PostRepository;
import com.igorf.wrkmongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> post = repo.findById(id);
		return post.orElseThrow(() -> new ObjectNotFoundException("Post não encontrado!"));
	}
	
}
