package com.rajeshsurana.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rajeshsurana.model.Customer;
import com.rajeshsurana.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("we are using Setter injection");
		this.customerRepository = customerRepository;
	}

	public CustomerServiceImpl(){
		
	}
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
		System.out.println("we are using Constructor injection");
	}

	/* (non-Javadoc)
	 * @see com.rajeshsurana.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
