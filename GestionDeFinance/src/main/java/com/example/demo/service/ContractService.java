package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Contract;
import com.example.demo.entity.User;
import com.example.demo.repository.ContractRepository;
@Service
public class ContractService {
   
	@Autowired
	private ContractRepository contractRepository;
	
	@SuppressWarnings("finally")
	 private Contract findOne(String Id) {
	 Contract instance = null;
	  try {
	   List < Contract > contractList = contractRepository.findAll();
	   for (Contract contract: contractList) {
	    if (contract.getId_contract().equals(Id)) {
	     instance = contract;
	     break;
	    }
	   }
	  } catch(Exception e) {
	   e.printStackTrace();
	  } finally {
	   return instance;
	  }
	 }
	
	//Create operation
	public Contract create(Contract c) {
		return contractRepository.save(c);
	}
	
    //update operation
	public Contract update(String id_contract,Contract contract) {
		Contract c = this.findOne(id_contract);
		c.setCompanyName(contract.getCompanyName());
		c.setPeriod(contract.getPeriod());
		c.setCreationDate(contract.getCreationDate());
		return contractRepository.save(c);
	}
		
	//Delete operation
	public void deleteAll() {
			contractRepository.deleteAll();
		}
		public void delete(String id_contract) {
			Contract c = this.findOne(id_contract);
			contractRepository.delete(c);
		}
	}

