package com.lti.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.beans.Admin;


@Repository
public class AdminDaoImpl implements AdminDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<Admin> findAdminList() {
		
		Query qry=em.createQuery("Select al.security_id,al.passcode from Admin al");
//		System.out.println();
		List<Admin> adminList=qry.getResultList();
		System.out.println(adminList);
		return adminList;
	}
	
	public boolean validateAdmin(String security_id, String passcode) {
		System.out.println("in admin dao");
		Query qry = em.createQuery("select al.passcode from Admin al where al.security_id=:s_id");
		qry.setParameter("s_id", security_id);
		String s = (String) qry.getSingleResult();
		if(passcode.equals(s)) {
			return true;
		}
		else {
			return false;
		}
		
	}
}