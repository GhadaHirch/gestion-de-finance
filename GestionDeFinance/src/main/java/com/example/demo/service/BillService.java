package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Bill;
import com.example.demo.repository.BillRepository;

@Service
public class BillService {
   
	@Autowired
	private BillRepository billRepository;
	
	@SuppressWarnings("finally")
	 private Bill findOne(String IdBill) {
	 Bill instance = null;
	  try {
	   List < Bill > billList = billRepository.findAll();
	   for (Bill bill: billList) {
	    if (bill.getIdBill().equals(IdBill)) {
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
	//Retrieve operation
		
		/*public Bill[] getByBillType(String billType) {
			return billRepository.findByBillType(billType);
		}*/
	
    //update operation
	public Bill update(String idBill,Bill bill) {
		Bill b = this.findOne(idBill);
		b.setAmountBC(bill.getAmountBC());
		b.setAmountTT(bill.getAmountTT());
		b.setFreeField(bill.getFreeField());
		b.setTitle(bill.getTitle());
		b.setTimbre(bill.getTimbre());
		b.setTVA(bill.getTVA());
		return billRepository.save(b);
	}
	
		
	
	}

