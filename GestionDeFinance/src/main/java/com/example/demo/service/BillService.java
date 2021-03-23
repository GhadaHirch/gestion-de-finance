package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Bill;
import com.example.demo.entity.Contract;
import com.example.demo.entity.User;
import com.example.demo.repository.BillRepository;



@Service
public class BillService {
   
	@Autowired
	private BillRepository billRepository;
	
	@SuppressWarnings("finally")
	 private Bill findOne(String Id_bill) {
	 Bill instance = null;
	  try {
	   List < Bill > billList = billRepository.findAll();
	   for (Bill bill: billList) {
	    if (bill.getId_bill().equals(Id_bill)) {
	     instance = bill;
	     break;
	    }
	   }
	  } catch(Exception e) {
	   e.printStackTrace();
	  } finally {
	   return instance;
	  }
	 }
	
	//add operation
	public Bill add(Bill b) {
		return billRepository.insert(b);
	}
	
    //update operation
	public Bill update(String id_bill,Bill bill) {
		Bill b = this.findOne(id_bill);
		b.setBill_type(bill.getBill_type());
		b.setNumero(bill.getNumero());
		b.setInfo_supp(bill.getInfo_supp());
		b.setCreationDate(bill.getCreationDate());
		return billRepository.save(b);
	}
		
	
	}

