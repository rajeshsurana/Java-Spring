package com.rajeshsurana.service;

import java.util.List;

import com.rajeshsurana.model.Customer;
import com.rajeshsurana.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(){
		
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository){
		this.customerRepository = customerRepository;
	}
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
