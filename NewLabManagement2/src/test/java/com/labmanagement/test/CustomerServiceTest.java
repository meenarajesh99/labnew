package com.labmanagement.test;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyLong;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.labmanagement.entity.Customer;
import com.labmanagement.repository.CustomerRepository;
import com.labmanagement.service.CustomerService;



class CustomerServiceTest {
	private CustomerRepository repo;
	private CustomerService service;
	
	@BeforeEach
	void setUp() throws Exception {
		repo = Mockito.mock(CustomerRepository.class);
		service = new CustomerService(repo, null);
	}

	@Test
	void testGet() {
		Customer expected = new Customer("Susan","07/24/2005" ,"ks@msn.com", "67 Black Horse Lane", "Robbinsville", "New Jersey", (long)8056);
		expected.setCustId(1L);
		Mockito.when(repo.findById(anyLong())).thenReturn(Optional.of(expected));
		Customer actual = service.get(1L);
		assertEquals(expected, actual);
	}
	@Test
	void testSave() {
		Customer customer = new Customer("Alan","01/24/1999" ,"ab@msn.com", "67 Black Horse Lane", "Newark", "New Jersey", 8056L);
		
		repo.save(customer);
		System.out.println(customer.getCustID());
		assertNotNull(customer.getCustName());
	}
	
	@Test
	public void testUpdate() {
		Customer customer = new Customer("Susan","07/26/1986" ,"srodri@yahoo.com", "145 Springwell st", "Summit", "New Jersey", (long)7085);
		repo.save(customer);
		String expected = customer.getCustName();
		customer.setCustName("Sandy");
		repo.save(customer);
		System.out.println(expected);
		String actual = customer.getCustName();
		assertNotEquals(actual, expected);
		
	}
	
	@Test
	public void testDelete() {
		Customer expected = new Customer("Mary","10/09/1989" ,"mary56@icloud.com", "76 Stewart Ave", "Millburn", "New Jersey", (long)7067);
		repo.save(expected);
		repo.delete(expected);
		Customer actual = null;
		assertNotEquals(actual, expected);
					
	}
	

	

}

