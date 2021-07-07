package com.igorf.wrkmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.igorf.wrkmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
 