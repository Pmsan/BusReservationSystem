package com.lti.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Ticket;
import com.lti.dao.TicketsDao;

@Service("ticketService")
public class TicketsSerImpl implements TicketsService{
	
	@Autowired
	TicketsDao dao;

	@Override
	public int addTicket(Ticket t) {
		// TODO Auto-generated method stub
		System.out.println("In Service layer");
		return dao.addTicket(t);
	}

	@Override
	public List<Ticket> findTicketList() {
		// TODO Auto-generated method stub
		return dao.findTicketList();
	}

//	@Override
//	public boolean updateTicket() {
//		// TODO Auto-generated method stub
//		return false;
//	}

	@Override
	public boolean delTicket(int tikId) {
		// TODO Auto-generated method stub
		return dao.delTicket(tikId);
	}

}
