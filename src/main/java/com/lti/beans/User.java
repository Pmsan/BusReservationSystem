package com.lti.beans;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE , generator="USERSEQ")
	@SequenceGenerator(name="USERSEQ", sequenceName="userseq",allocationSize=1)
	private int user_Id;
	
	@Column(nullable= false,name="NAME",length=20)
	private String name;
	
	@Column(nullable= false,name="contact",length=10)
	private int contact;
	
	@Column(nullable= false,name="EMAILID",length=40)
	private String emailId;
	
	@Column(nullable= false,name="PASSWORD",length=20)
	private String password;
	
	@Column(nullable= false,name="GENDER",length=1)
	private char gender;
	
	@Column(nullable= false,name="ADDRESS",length=40)
	private String address;
	
	@Column(nullable= false,name="WALLETAMT",length=40)
	private float walletAmt;

	public User(int user_Id, String name, int contact, String emailId, String password, char gender, String address,
			float walletAmt) {
		super();
		this.user_Id = user_Id;
		this.name = name;
		this.contact = contact;
		this.emailId = emailId;
		this.password = password;
		this.gender = gender;
		this.address = address;
		this.walletAmt = walletAmt;
	}

	public User() {
		super();
	}

	public int getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getWalletAmt() {
		return walletAmt;
	}

	public void setWalletAmt(float walletAmt) {
		this.walletAmt = walletAmt;
	}


}
