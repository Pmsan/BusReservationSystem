package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Ticket;
import com.lti.service.TicketsService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/tickets-api")
public class TicketController {
	
	@Autowired
	TicketsService service;
	
//  http://localhost:8090/tickets-api/getticket
	@GetMapping("/getticket")
	public List<Ticket> getTicket()
	{
		System.out.println("Ticket");
		List<Ticket> tickList=service.findTicketList();
		return tickList;
	}
	
	//http://localhost:8090/tickets-api/addticket
	@PostMapping("/addticket")
	public int addTicket(@RequestBody Ticket t)
	{
		int tickId=service.addTicket(t);
		return tickId;
	}
	
	//http://localhost:8090/tickets-api/delticket
	@PostMapping("/delticket")
	public boolean delTicket(@RequestBody Ticket t)
	{
		int tickId=t.getTikId();
		return service.delTicket(tickId);
	}
	

}
