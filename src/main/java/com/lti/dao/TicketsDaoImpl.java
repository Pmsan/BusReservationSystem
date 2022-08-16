package com.lti.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Ticket;

@Repository
public class TicketsDaoImpl implements TicketsDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public int addTicket(Ticket t) {
		// TODO Auto-generated method stub
		System.out.println("Dao layer"+t);
		em.persist(t);
		return t.getTikId();
	}

	@Override
	public List<Ticket> findTicketList() {
		// TODO Auto-generated method stub
		TypedQuery<Ticket> qry=em.createQuery("select t from Ticket t",Ticket.class);
		List<Ticket> tickList=qry.getResultList();
		System.out.println(tickList);
		return tickList;
	}

	@Override
	@Transactional
	public boolean delTicket(int tickId) {
		// TODO Auto-generated method stub
		//em.getTransaction().begin();
		Ticket t=em.find(Ticket.class, tickId);
		em.remove(t);
		//em.close();
		return true;
	}

//	@Override
//	public boolean updateTicket() {
//		// TODO Auto-generated method stub
//		return false;
	//}

}