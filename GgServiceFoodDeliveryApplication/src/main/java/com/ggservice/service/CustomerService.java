package com.ggservice.service;

import java.util.List;

import com.ggservice.dto.CustomerDto;
import com.ggservice.entity.Customer;

public interface CustomerService {
	
	public Customer saveCustomer(CustomerDto customerDto);
	public Customer updateCustomer(CustomerDto customerDto);
	public Customer getCustomer(Integer id);
	public boolean deleteCustomer(Integer id);
	public List<Customer> getAllCustomer();
	public Customer verifyCustomer(String username,String password);

}
