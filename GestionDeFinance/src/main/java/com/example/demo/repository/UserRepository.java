package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
   public User[] findByFirstName(String firstName);
   
   public Optional<User> findById(String id_user);
//public User findOne(String id);
}
