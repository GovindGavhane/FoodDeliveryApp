package com.ggservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ggservice.dto.CustomerDto;
import com.ggservice.entity.Customer;
import com.ggservice.service.impl.CustomerServiceImpl;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerServiceImpl customerServiceImpl;
	
	@PostMapping("/customer")
	public String  inserCustomer(@RequestBody CustomerDto customerdto )
	{
		Customer c1 = customerServiceImpl.saveCustomer(customerdto);
		return "saved customer successfully"+c1.getId();
		
	}
	@PutMapping("/customer")
	public String updateCustomer(@RequestBody CustomerDto customerDto)
	{
		Customer c1 = customerServiceImpl.updateCustomer(customerDto);
		return "customer update successfully: "+c1.getId();
	}
	
	@GetMapping("/customer")
	public Customer getCustomerById(@RequestParam int id)
	{
		Customer c1 = customerServiceImpl.getCustomer(id);
		return c1;
	}
	
	@DeleteMapping("/customer")
	public boolean deleteCustomer(@RequestParam int id)
	{
		boolean b = customerServiceImpl.deleteCustomer(id);
		return b;
	}
    @GetMapping("/customer/all")
    public List<Customer> getAllCustomer()
    {
    	 return customerServiceImpl.getAllCustomer();
    }
	@GetMapping("/customer/verify")
	public Customer verifyCustomer(@RequestParam String username, @RequestParam String password)
	{
		return customerServiceImpl.verifyCustomer(username, password); 
	}

}
