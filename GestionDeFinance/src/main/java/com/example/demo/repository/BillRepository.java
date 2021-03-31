package com.example.demo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Bill;

@Repository
public interface BillRepository extends MongoRepository<Bill, String>{

}
