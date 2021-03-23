package com.example.demo.controller;

import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Contract;

import com.example.demo.service.ContractService;

@RestController@RequestMapping("/contract")
public class ContractController {

	@Autowired
	private ContractService contractService;
	
	
	@RequestMapping(method = RequestMethod.POST)
	 public Contract createContract(@RequestBody Contract c) {
	return contractService.create(c);
	}

	@RequestMapping(value = "/{id_contract}", method = RequestMethod.PUT)
	 public Contract updateContract(@PathVariable String id_contract, @RequestBody Contract contract) 
	{
	  return contractService.update(id_contract, contract);
	 }
	
	@RequestMapping(value = "/{id_contract}", method = RequestMethod.DELETE)
	public String deleteContract(@PathVariable String id_contract) {
		contractService.delete(id_contract);
		return "Deleted "+id_contract;
	}
	@RequestMapping(method= RequestMethod.DELETE)
	public String deleteAll() {
		contractService.deleteAll();
		return "Deleted all records";
	}
	
	
	
}
