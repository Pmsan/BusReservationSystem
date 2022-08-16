package com.lti.beans;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TRANSACTIONS")
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE , generator="TRANSEQ")
	@SequenceGenerator(name="TRANSEQ", sequenceName="transeq",allocationSize=1)
	@Column(name="TRANSID")
	private int transId;
	@Column(name="AMOUNT")
	private double amount;
	@Column(name="PAYMTYPE",length=20)
	private String paymType;
	
	
	
	 @ManyToOne
	 @JoinColumn(name="USERID")
	 private User user;
	
	

	
	

	 
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Transaction(int transId, double amount, String paymType, User user) {
		super();
		this.transId = transId;
		this.amount = amount;
		this.paymType = paymType;
		this.user = user;
	}
	public Transaction(int transId, double amount, String paymType) {
		super();
		this.transId = transId;
		this.amount = amount;
		this.paymType = paymType;
	}
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPaymType() {
		return paymType;
	}
	public void setPaymType(String paymType) {
		this.paymType = paymType;
	}
	public Transaction() {
		super();
	}
	@Override
	public String toString() {
		return "Transaction [transId=" + transId + ", amount=" + amount + ", paymType=" + paymType + "]";
	}
	
	
	
}