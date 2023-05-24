package com.ggservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ggservice.dto.CustomerDto;
import com.ggservice.entity.Customer;
import com.ggservice.repository.CustomerRepository;
import com.ggservice.service.CustomerService;
 

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer saveCustomer(CustomerDto customerDto) {
		 Customer customer = new Customer();
		  customer.setId(customerDto.getCustomerid());
		  customer.setName(customerDto.getCustomerName());
		  customer.setUsername(customerDto.getCustomerUsername());
		  customer.setGmail(customerDto.getCustomerGmail());
		  customer.setPassword(customerDto.getCustomerPassword());
		  customer.setConfirmpassword(customerDto.getCustomerConfirmpassword());
		 Customer c1 = customerRepository.save(customer);
		return c1;
	}

	@Override
	public Customer updateCustomer(CustomerDto customerDto) {
		 Customer customer = new Customer();
		  customer.setId(customerDto.getCustomerid());
		  customer.setName(customerDto.getCustomerName());
		  customer.setUsername(customerDto.getCustomerUsername());
		  customer.setGmail(customerDto.getCustomerGmail());
		  customer.setPassword(customerDto.getCustomerPassword());
		  customer.setConfirmpassword(customerDto.getCustomerConfirmpassword());
		 Customer c1 = customerRepository.save(customer);
		return c1;

	}

	@Override
	public Customer getCustomer(Integer id) {
		 Customer customer = customerRepository.findById(id).get();
		 if(customer!=null)
		 {
			 return customer;
		 }
		return null;
	}

	@Override
	public boolean deleteCustomer(Integer id) {

		Customer c = this.getCustomer(id);
		if(c!=null)
		{
		customerRepository.delete(c);
		return true;
		}
     
		return false;
	}

	@Override
	public List<Customer> getAllCustomer() {
	return  customerRepository.findAll();
		 
	}

	@Override
	public Customer verifyCustomer(String username, String password) {
		 Customer customer =this.getCustomerUsingUsernameAndPassword(username, password);
		 if(customer!=null)
		 {
	     	return customer;
		 }
		 return null;
	}
	
	public Customer getCustomerUsingUsernameAndPassword(String username,String password)
	{
		return customerRepository.getCustomerByUsernameAndPassword(username, password);
	}

	 
}
