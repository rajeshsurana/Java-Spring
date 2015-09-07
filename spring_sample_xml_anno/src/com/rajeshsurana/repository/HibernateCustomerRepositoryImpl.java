package com.rajeshsurana.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.rajeshsurana.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	@Value("${someProperty}")
	private String someValue;

	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		//customer.setFirstname("Rajesh");
		customer.setFirstname(someValue);
		customer.setLastname("Surana");
		customers.add(customer);
		return customers;
	}
}
