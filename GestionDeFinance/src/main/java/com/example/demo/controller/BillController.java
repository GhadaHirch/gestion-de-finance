package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Bill;
import com.example.demo.service.BillService;


@RestController@RequestMapping("/bills")
public class BillController {
	
	@Autowired
	private BillService billService;
	
	/*@RequestMapping(value = "/", method = RequestMethod.GET)
	    public List<Bill> list() {
	        return Bill.emptyList();
	    }*/
	 
	 @RequestMapping(method = RequestMethod.POST)
	 public Bill addBill(@RequestBody Bill b) {
	return billService.add(b);
	}
	 /*@RequestMapping(value="/{billType}",method= RequestMethod.GET)
		@ResponseBody
		public Bill[] getBill(@PathVariable String billType) {
			return billService.getByBillType(billType);
		}*/
	
	@RequestMapping(value = "/update/{idBill}", method = RequestMethod.PUT)
	 public Bill updateBill(@PathVariable String idBill, @RequestBody Bill bill) {
	  return billService.update(idBill, bill);
	 }
	
}
	 
			
	