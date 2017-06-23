package com.scrud.DaoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scrud.Dao.CustomerDao;
import com.scrud.model.Authorities;
import com.scrud.model.Customer;
@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SessionFactory sessionFactory;
	public void addCustomer (Customer customer)
	{
		Session session = sessionFactory.getCurrentSession();
		session.save(customer);
		session.flush();
	}

    public Customer getCustomerById (int customerId)
    {
    	Session session = sessionFactory.getCurrentSession();
		Customer customer = (Customer) session.get(Customer.class, customerId);
		return customer;
    }

    public List<Customer> getAllCustomers()
    {
    	Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Customer");
		List<Customer> result = query.list();
		session.flush();
		return result;
    }

    public Customer getCustomerByUsername (String username)
    {
    	Session session = sessionFactory.getCurrentSession();
		Customer customer = (Customer) session.get(Customer.class, username);
		return customer;
    }
    public void addAuthority(Authorities authorities)
    {
    	Session session = sessionFactory.getCurrentSession();
		session.save(authorities);
		session.flush();
    }
}
