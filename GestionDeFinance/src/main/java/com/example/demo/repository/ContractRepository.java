package com.example.demo.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import com.example.demo.entity.Contract;


@Repository
public interface ContractRepository extends MongoRepository<Contract, String>{
  // public Contract[] findById_contract(String id_contract);
   //public List<Contract> findByAge(int age);
   public Optional<Contract> findById_id_contract(String id_contract);
//public Contract findOne(String id_contract);
}
