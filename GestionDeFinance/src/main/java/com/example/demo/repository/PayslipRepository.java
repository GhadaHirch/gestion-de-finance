package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Payslip;

@Repository
public interface PayslipRepository extends MongoRepository<Payslip, String>{
  
}
