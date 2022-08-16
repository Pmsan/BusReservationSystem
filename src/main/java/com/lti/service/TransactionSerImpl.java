package com.lti.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Transaction;

import com.lti.dao.TransactionDao;

@Service
public class TransactionSerImpl implements TransactionService{
	@Autowired
	TransactionDao dao;
	
	
	
	@Override
	public int addTransaction(Transaction t)  {
	
		
			 System.out.println(" Inside service layer");
				return dao.addTransaction(t);
		 }
	}

