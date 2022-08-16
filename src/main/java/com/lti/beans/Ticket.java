package com.lti.beans;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.CascadeType;


@Entity
@Table(name="TICKETS")
public class Ticket {
	
	@Id
	@Column(name="TICKID")
	private int tikId;
	

//	@ManyToOne(targetEntity = Bus.class,cascade = CascadeType.ALL);
//	@Column(name="BUSID")
	@ManyToOne(targetEntity = Bus.class, cascade = CascadeType.ALL)
	@JoinColumn(name="busId")
	Bus bus;
	
	@ManyToOne(targetEntity = Transaction.class, cascade = CascadeType.ALL)
	@JoinColumn(name="transId")
	Transaction transaction;
	
	@Column(name="COUNTTICKS")
	private int numTick;
	
	@Column(name="BOOKDATE")
	private String bookDate;
	
//	@Column(name="TRANSID")
//	private int transId;
	
	@Column(name="COST")
	private double totalCost;

	public int getTikId() {
		return tikId;
	}

	public void setTikId(int tikId) {
		this.tikId = tikId;
	}

	public int getNumTick() {
		return numTick;
	}

	public void setNumTick(int numTick) {
		this.numTick = numTick;
	}

	public String getBookDate() {
		return bookDate;
	}

	public void setBookDate(String bookDate) {
		this.bookDate = bookDate;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public Ticket(int tikId, int numTick, String bookDate, double totalCost) {
		super();
		this.tikId = tikId;
		this.numTick = numTick;
		this.bookDate = bookDate;
		this.totalCost = totalCost;
	}

	public Ticket() {
		super();
	}

	@Override
	public String toString() {
		return "Ticket [tikId=" + tikId + ", numTick=" + numTick + ", bookDate=" + bookDate + ", totalCost=" + totalCost
				+ "]";
	}

	
	
	

	

}
