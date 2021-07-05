package com.igorf.wrkmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.igorf.wrkmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
 