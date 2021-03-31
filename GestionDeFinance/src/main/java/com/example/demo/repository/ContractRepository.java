package com.example.demo.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Contract;

@Repository
public interface ContractRepository extends MongoRepository<Contract, String>{
  
}
