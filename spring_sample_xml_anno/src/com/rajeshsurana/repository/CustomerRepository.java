package com.rajeshsurana.repository;

import java.util.List;

import com.rajeshsurana.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}