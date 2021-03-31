package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Contract;
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
	    if (contract.getIdContract().equals(Id)) {
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
	public Contract create(Contract contract) {
		contract.setDeleted(false);
		return contractRepository.save(contract);
	}

	//Update operation
	public Contract update(String idContract,Contract contract) {
		Contract c = this.findOne(idContract);
		c.setCompanyName(contract.getCompanyName());
		c.setFinishDate(contract.getFinishDate());
		c.setStartDate(contract.getStartDate());
		c.setSalary(contract.getSalary());
		c.setFreeField(contract.getFreeField());
		return contractRepository.save(c);
	}

	//Delete operation
	
	public void delete(String idContract) {
		Contract c = this.findOne(idContract);
		c.setDeleted(true);
		contractRepository.save(c);
		
	}
}
