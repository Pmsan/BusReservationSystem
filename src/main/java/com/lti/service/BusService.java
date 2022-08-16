package com.lti.service;

import java.util.List;

import com.lti.beans.Bus;
import com.lti.bexception.BusException;

public interface BusService {
	

	public List<Bus> fetchallBus() throws BusException;
	
   public int addBus(Bus b);
	
	public List<Bus> searchBus(String src, String dest, String date,String btype,boolean ac) throws BusException;
	
	public boolean updateBus(int bid,String time);
	
    public List<Bus> sourcelist();
	
	public List<Bus> destlist();
	
	public List<Bus> btypelist();


}
