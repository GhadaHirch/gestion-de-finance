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
	 private Payslip findOne(String IdPayslip) {
		Payslip instance = null;
	  try {
	   List < Payslip > payslipList = payslipRepository.findAll();
	   for (Payslip payslip: payslipList) {
	    if (payslip.getIdPayslip().equals(IdPayslip)) {
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
	public Payslip fillin(Payslip payslip) {
		return payslipRepository.save(payslip);
	}
	
    //update operation
	public Payslip update(String idPayslip,Payslip payslip) {
		Payslip p = this.findOne(idPayslip);
		p.setAmount(payslip.getAmount());
		p.setFreeField(payslip.getFreeField());
		p.setPrime(payslip.getPrime());
		return payslipRepository.save(p);
	}
		
	
	
	}

