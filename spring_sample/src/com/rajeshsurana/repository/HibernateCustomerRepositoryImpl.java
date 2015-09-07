package com.rajeshsurana.repository;

import java.util.ArrayList;
import java.util.List;

import com.rajeshsurana.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.rajeshsurana.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstname("Rajesh");
		customer.setLastname("Surana");
		customers.add(customer);
		return customers;
	}
}
