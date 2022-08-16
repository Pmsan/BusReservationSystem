package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.lti.beans.Transaction;
import com.lti.beans.User;



@Repository
public class TransactionDaoImpl implements TransactionDao {
	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	@Transactional
	public int addTransaction(Transaction t)  {
		System.out.println(" Inside Dao method");	
		System.out.println(t.getUser().getUser_Id());
		int userId=t.getUser().getUser_Id();
	    User tempuser = em.find(User.class, userId);
	if(t.getAmount()> tempuser.getWalletAmt()) {
		System.out.println("insufficient balance");
	return 0;
	}
	else {
		em.persist(t);	
		return  t.getTransId() ;
	}
	}



	
}