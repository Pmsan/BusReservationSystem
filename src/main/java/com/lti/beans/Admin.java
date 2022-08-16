package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ADMIN")
public class Admin {
	
	@Id
	@Column(name="SECURITY_ID")
	private String security_id;
	
	@Column(name="PASSCODE")
	private String passcode;

	public Admin(String security_id, String passcode) {
		super();
		this.security_id = security_id;
		this.passcode = passcode;
	}

	public Admin() {
		super();
	}

	public String getSecurity_id() {
		return security_id;
	}

	public void setSecurity_id(String security_id) {
		this.security_id = security_id;
	}

	public String getPasscode() {
		return passcode;
	}

	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}
	
	
}