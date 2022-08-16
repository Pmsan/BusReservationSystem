package com.lti.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lti.beans.Transaction;

import com.lti.service.TransactionService;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("/trans-api")
public class TransactionController {
	@Autowired
      TransactionService service;
	

	//http://localhost:8090/trans-api/addtrans
	@PostMapping("/addtrans")
	public int addTransaction(@RequestBody Transaction t) {
		int TransId=service.addTransaction(t);
		return TransId;
	}
	
		
		//http://localhost:8090/trans-api/addtransuser
		@PostMapping("/addtransuser")
		public int addTransUser(@RequestBody Transaction t) {
			System.out.println("controller1"+t);
		
			System.out.println("controller2"+t);
		
			int transno=service.addTransaction(t);
			
			return transno;	
		
}
		
}
