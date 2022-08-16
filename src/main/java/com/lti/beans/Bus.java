package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="BUSES")
public class Bus {
	
//	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "empseq")
//	@SequenceGenerator(name="empseq",sequenceName="empseq",allocationSize = 1)
	
	
	
	@Id
	@Column(name="BUSID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "busidseq")
	@SequenceGenerator(name="busidseq",sequenceName="busidseq",allocationSize=1)
	private int busId;
	
	@Column(name="BUSNAME")
	private String busName;
	
	@Column(name="SOURCE")
	private String source;
	
	@Column(name="DESTINATION")
	private String destination;
	
	@Column(name="DEPARTIME")
	private String departureTime;
	
	@Column(name="DEPARDATE")
	private String departureDate;
	
	@Column(name="SEATS")
	private int seatsAvailable;
	
	@Column(name="COST")
	private double cost;
	
	@Column(name="BUSTYPE")
	private String busType;
	
	@Column(name="AC")
	private boolean ac;

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public int getSeatsAvailable() {
		return seatsAvailable;
	}

	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busName=" + busName + ", source=" + source + ", destination=" + destination
				+ ", departureTime=" + departureTime + ", departureDate=" + departureDate + ", seatsAvailabe="
				+ seatsAvailable + ", cost=" + cost + ", busType=" + busType + ", ac=" + ac + "]";
	}

	public Bus(int busId, String busName, String source, String destination, String departureTime, String departureDate,
			int seatsAvailable, double cost, String busType, boolean ac) {
		super();
		this.busId = busId;
		this.busName = busName;
		this.source = source;
		this.destination = destination;
		this.departureTime = departureTime;
		this.departureDate = departureDate;
		this.seatsAvailable = seatsAvailable;
		this.cost = cost;
		this.busType = busType;
		this.ac = ac;
	}

	public Bus() {
		super();
	}
	
//	@Column(name="SBOOKED")
//	private int seatsBooked;

}
