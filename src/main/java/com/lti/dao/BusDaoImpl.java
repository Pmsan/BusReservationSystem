package com.lti.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.Bus;



@Repository
public class BusDaoImpl implements BusDao{

	
	@PersistenceContext
	private EntityManager em;
	
	
	
	@Override
	@Transactional
	public int addBus(Bus b) {
		em.persist(b);
		return b.getBusId();
	}

	

	@Override
	@Transactional
	public boolean updateBus(int bid,String time) {
		Query qry=em.createQuery("update from Bus b set b.departureTime=:dt where e.busId=:bid");
        qry.setParameter("bid",bid);
        qry.setParameter("dt",time);
        int i=qry.executeUpdate();
        
        if(i==0) {
		return false;
        }
        else {
        	return true;
        }
	}

	@Override
	public List<Bus> searchBus(String src, String dest, String date,String btype,boolean ac) {
		Query qry=em.createQuery("select b from Bus b where b.source=:start and b.destination=:end and b.departureDate=:pdate and b.busType=:btype and b.ac=:pac");
		qry.setParameter("start",src);
		qry.setParameter("end",dest);
		qry.setParameter("pdate",date);
		qry.setParameter("pac",ac);
		qry.setParameter("btype",btype);
		List<Bus> blist=qry.getResultList();
		return blist;
	}



	@Override
	public List<Bus> fetchallBus() {
		Query qry=em.createQuery("select b from Bus b");
		List<Bus> blist=qry.getResultList();
		return blist;
	}
	
	public List<Bus> sourcelist() {
		Query qry=em.createQuery("select distinct b.source from Bus b");
		List<Bus> blist=qry.getResultList();
		return blist;
	}
	
	public List<Bus> destlist() {
		Query qry=em.createQuery("select distinct b.destination from Bus b");
		List<Bus> blist=qry.getResultList();
		return blist;
	}
	
	public List<Bus> btypelist() {
		Query qry=em.createQuery("select distinct b.busType from Bus b");
		List<Bus> blist=qry.getResultList();
		return blist;
	}

}
