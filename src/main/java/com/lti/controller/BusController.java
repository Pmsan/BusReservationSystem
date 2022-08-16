package com.lti.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Bus;
import com.lti.bexception.BusException;
import com.lti.service.BusService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/bus-api")
public class BusController {
	
	@Autowired
	BusService busservice;
	
	// http://localhost:8090/bus-api/allbus
	@GetMapping("/allbus")
	public List<Bus> fetchallbus(){
		List<Bus> blist;
		try {
			blist = busservice.fetchallBus();
			return blist;
		} catch (BusException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	@PostMapping("/addbus")
	public int addBus(@RequestBody Bus b) {
		int bId=busservice.addBus(b);
		return bId;
	}
	
	@PostMapping("/searchbus")
	public List<Bus> searchBus(@RequestBody Bus b) {
		List<Bus> blist;
		try {
			blist = busservice.searchBus(b.getSource(),b.getDestination(),b.getDepartureDate(),b.getBusType(),b.isAc());
			System.out.println(blist);
			return blist;
		} catch (BusException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@PostMapping("/upbus")
	public boolean upBus(@RequestBody Bus b) {
		boolean change=busservice.updateBus(b.getBusId(),b.getDepartureTime());
		return change;
	}
	
	@GetMapping("/srclist")
	public List<Bus> getsrclist(){
		return busservice.sourcelist();
	}
	
	@GetMapping("/destlist")
	public List<Bus> getdestlist(){
		return busservice.destlist();
	}
	
	@GetMapping("/btypelist")
	public List<Bus> gettypelist(){
		return busservice.btypelist();
	}

}
