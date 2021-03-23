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

import com.example.demo.entity.Bill;
import com.example.demo.service.BillService;

@RestController@RequestMapping("/bill")
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
	
	@RequestMapping(value = "/{id_bill}", method = RequestMethod.PUT)
	 public Bill updateBill(@PathVariable String id_bill, @RequestBody Bill bill) {
	  return billService.update(id_bill, bill);
	 }
	
	
}
