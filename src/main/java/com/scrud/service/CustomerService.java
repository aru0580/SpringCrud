package com.scrud.service;

import java.util.List;

import com.scrud.model.Authorities;
import com.scrud.model.Customer;

public interface CustomerService {
	void addCustomer (Customer customer);

    Customer getCustomerById (int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername (String username);
    void addAuthority(Authorities authorities);
}
