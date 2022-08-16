package com.lti.dao;
import java.util.List;

import com.lti.beans.Ticket;

public interface TicketsDao {
	
	public int addTicket(Ticket t);
	 public List<Ticket> findTicketList();
	 
	 public boolean delTicket(int tickId); 
}