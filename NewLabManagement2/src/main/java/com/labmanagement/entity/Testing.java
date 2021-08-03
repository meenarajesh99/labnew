package com.labmanagement.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/*Testing entity class*/

@Entity
@Table(name="testing")
public class Testing  {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long testId;
	private String testName;
	

	@ManyToMany(fetch=FetchType.LAZY, mappedBy = "testing", cascade = CascadeType.PERSIST)
	private List<Customer> customer;
	
	
	
	public Testing() {
		super();
		
	}
	/*constructor for the class*/

	public Testing( String testName) {
		super();
		this.testName = testName;
		
	}
	/*getter and setter methods*/

	public Long getTestId() {
		return testId;
	}

	public void setTestId(Long testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}



	



}
