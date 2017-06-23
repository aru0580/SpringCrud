package com.scrud.Dao;

import java.util.List;

import com.scrud.model.Authorities;
import com.scrud.model.Customer;

public interface CustomerDao {
	
	 void addCustomer (Customer customer);

	    Customer getCustomerById (int customerId);

	    List<Customer> getAllCustomers();

	    Customer getCustomerByUsername (String username);
	    void addAuthority(Authorities authorities);
}
