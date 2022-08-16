package com.lti.service;
import java.util.List;

import com.lti.beans.Ticket;

public interface TicketsService {
	
	public int addTicket(Ticket t);
	
	public List<Ticket> findTicketList();
	public boolean delTicket(int tickId);

}