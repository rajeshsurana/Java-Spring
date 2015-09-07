package com.rajeshsurana.service;

import java.util.List;

import com.rajeshsurana.model.Customer;
import com.rajeshsurana.repository.CustomerRepository;
import com.rajeshsurana.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.rajeshsurana.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
