package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Payslip;
import com.example.demo.service.PayslipService;

@RestController@RequestMapping("/payslips")
public class PayslipController {

	@Autowired
	private PayslipService payslipService;
	
	 
	 @RequestMapping(value= "/fillin", method = RequestMethod.POST)
	 public Payslip fillinPayslip(@RequestBody Payslip payslip) {
	return payslipService.fillin(payslip);
	}
	
	@RequestMapping(value = "/update/{idPayslip}", method = RequestMethod.PUT)
	 public Payslip updatePayslip(@PathVariable("idPayslip") String idPayslip, @RequestBody Payslip payslip) {
	  return payslipService.update(idPayslip, payslip);
	 }
	
	
}
