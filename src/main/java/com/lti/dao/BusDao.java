package com.lti.dao;

import java.util.List;

import com.lti.beans.Bus;

public interface BusDao {
	
	public List<Bus> fetchallBus();
	
	public int addBus(Bus b);
	
	public List<Bus> searchBus(String src,String dest,String date,String btype,boolean ac);
	
	public boolean updateBus(int bid,String time);
	
	public List<Bus> sourcelist();
	
	public List<Bus> destlist();
	
	public List<Bus> btypelist();

}
