package com.labmanagement.entity;

/* Customer entity class*/

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
		

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="custID", updatable=false, nullable=false)
	private Long custID;
	

	private String custName;
	private String custDOB;
	private String email;
	private String address;
	private String city;
	private String state;
	private Long zipcode;
	
	@ManyToMany
	@JoinTable(name = "customers_testing")
	private List<Testing> testing ;
	
	
	public Customer() {
		super();
	}
	
	/*constructor for the class*/
	
	public Customer(String custName,  String custDOB, String email, String address, String city,
			String state, Long zipcode) {
		super();
		
		this.custName = custName;
		this.custDOB = custDOB;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		
	}
	
	/*getter and setter methods*/

	public Long getCustID() {
		return custID;
	}

	public void setCustId(Long custID) {
		this.custID = custID;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	

	public String getCustDOB() {
		return custDOB;
	}

	public void setCustDOB(String custDOB) {
		this.custDOB = custDOB;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		
	}
	public Long getZipcode() {
		return zipcode;
	}

	public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;
	}



	public List<Testing> getTesting() {
		return testing;
	}

	public void setTesting(List<Testing> testing) {
		this.testing = testing;
	}

//	public void listAll() {
		// TODO Auto-generated method stub
		
	}

	

//	@Override
//	public String toString() {
//		return "Customer [custID=" + custID + ", custName=" + custName + ", custDOB=" + custDOB + ", email=" + email
//				+ ", address=" + address + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + ", testing="
//				+ testing + "]";
//	}


	

	
	
	



