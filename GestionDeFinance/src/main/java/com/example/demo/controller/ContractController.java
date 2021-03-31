package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Contract;
import com.example.demo.service.ContractService;

@RestController@RequestMapping("/contracts")
public class ContractController {

	@Autowired
	private ContractService contractService;
	
	@RequestMapping(value="/create",method = RequestMethod.POST)
	 public Contract createContract(@RequestBody Contract contract) {
	return contractService.create(contract);
	}
	
	@RequestMapping(value = "/update/{idContract}", method = RequestMethod.PUT)
	 public Contract updateContract(@PathVariable("idContract") String idContract, @RequestBody Contract contract) {
	  return contractService.update(idContract,contract);
	 }
	
	
	@RequestMapping(value = "/delete/{idContract}", method = RequestMethod.POST)
	public String delete(@PathVariable String idContract) {
		contractService.delete(idContract);
		return "Deleted "+idContract;
	}
	
	
	
}
