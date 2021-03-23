package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Payslip;
import com.example.demo.repository.PayslipRepository;



@Service
public class PayslipService {
   
	@Autowired
	private PayslipRepository payslipRepository;
	
	@SuppressWarnings("finally")
	 private Payslip findOne(String Id) {
		Payslip instance = null;
	  try {
	   List < Payslip > payslipList = payslipRepository.findAll();
	   for (Payslip payslip: payslipList) {
	    if (payslip.getId_payslip().equals(Id)) {
	     instance = payslip;
	     break;
	    }
	   }
	  } catch(Exception e) {
	   e.printStackTrace();
	  } finally {
	   return instance;
	  }
	 }
	
	//fill_in operation
	public Payslip fillin(Payslip pay) {
		return payslipRepository.save(pay);
	}
	
    //update operation
	public Payslip update(String id_payslip,Payslip payslip) {
		Payslip pay = this.findOne(id_payslip);
		pay.setCompanyName(payslip.getCompanyName());
		pay.setAmount(payslip.getAmount());
		pay.setPayperiod(payslip.getPayperiod());
		pay.setCreationDate(payslip.getCreationDate());
		return payslipRepository.save(pay);
	}
		
	
	}

