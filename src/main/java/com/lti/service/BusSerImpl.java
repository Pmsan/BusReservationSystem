package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Bus;
import com.lti.bexception.BusException;
import com.lti.dao.BusDao;

@Service("busservice")
public class BusSerImpl implements BusService{

	@Autowired
	BusDao busdao;
	
	@Override
	public int addBus(Bus b) {
		return busdao.addBus(b);
	}

	@Override
	public List<Bus> searchBus(String src, String dest, String date,String btype,boolean ac) throws BusException {
		
		List<Bus> blist=busdao.searchBus(src, dest, date,btype, ac);
		
		if(blist==null) {
			throw new BusException();
		}
		else {
		return busdao.searchBus(src, dest, date, btype, ac);
		}
		
	}

	@Override
	public boolean updateBus(int bid,String time) {
		return busdao.updateBus(bid, time);
	}

	@Override
	public List<Bus> fetchallBus() throws BusException {
		
		List<Bus> blist=busdao.fetchallBus();
		
		if(blist==null) {
			throw new BusException();
		}
		else {
		return busdao.fetchallBus();
		}
	}

	@Override
	public List<Bus> sourcelist() {
		return busdao.sourcelist();
	}

	@Override
	public List<Bus> destlist() {
		return busdao.destlist();
	}

	@Override
	public List<Bus> btypelist() {
		return busdao.btypelist();
	}

}
