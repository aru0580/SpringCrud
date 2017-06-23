package com.scrud.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scrud.Dao.CustomerDao;
import com.scrud.model.Authorities;
import com.scrud.model.Customer;
import com.scrud.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;
	public void addCustomer (Customer customer){
		customerDao.addCustomer(customer);
	}

    public Customer getCustomerById (int customerId){
    	Customer customer=customerDao.getCustomerById(customerId);
    	return customer;
    }

    public List<Customer> getAllCustomers()
    {
    	List<Customer> customers=customerDao.getAllCustomers();
    	return customers;
    }

    public Customer getCustomerByUsername (String username)
    {
    	Customer customer=customerDao.getCustomerByUsername(username);
    	return customer;
    }
   public void addAuthority(Authorities authorities){
    	
	   customerDao.addAuthority(authorities);
    }
}
