package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Payslip;
import com.example.demo.service.PayslipService;

@RestController@RequestMapping("/payslip")
public class PayslipController {

	@Autowired
	private PayslipService payslipService;
	
	 
	 @RequestMapping(method = RequestMethod.POST)
	 public Payslip fillinPayslip(@RequestBody Payslip pay) {
	return payslipService.fillin(pay);
	}
	
	@RequestMapping(value = "/{id_payslip}", method = RequestMethod.PUT)
	 public Payslip updatePayslip(@PathVariable String id_payslip, @RequestBody Payslip payslip) {
	  return payslipService.update(id_payslip, payslip);
	 }
	
	
}
