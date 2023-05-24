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
import com.ggservice.dto.RestaurantDto;
import com.ggservice.entity.Customer;
import com.ggservice.entity.Restaurant;
import com.ggservice.service.impl.CustomerServiceImpl;
import com.ggservice.service.impl.RestaurantServiceImpl;

@RestController
public class RestaurantController {
	
	@Autowired
	RestaurantServiceImpl restaurantServiceImpl;
	
	@PostMapping("/restaurant")
	public String  inserRestaurant(@RequestBody RestaurantDto  restaurantDto )
	{
		Restaurant r1 = restaurantServiceImpl.saveRestaurant(restaurantDto);
		return "saved Restaurant successfully"+r1.getId();
		
	}
	@PutMapping("/restaurant")
	public String updateRestaurant(@RequestBody RestaurantDto  restaurantDto)
	{
		Restaurant r1 = restaurantServiceImpl.saveRestaurant(restaurantDto);
		return "Restaurant update successfully: "+r1.getId();
	}
	
	@GetMapping("/restaurant")
	public Restaurant getRestaurantById(@RequestParam Integer id)
	{
		 return restaurantServiceImpl.getRestaurant(id);
	}
	
	@DeleteMapping("/restaurant")
	public boolean deleteRestaurant(@RequestParam Integer id)
	{
		boolean b = restaurantServiceImpl.deleteRestaurant(id);
		return b;
	}
    @GetMapping("/restaurant/all")
    public List<Restaurant> getAllRestaurant()
    {
    	 return restaurantServiceImpl.getAllRestaurant();
    }
	@GetMapping("/restaurant/verify")
	public Restaurant verifyRestaurant(@RequestParam String username, @RequestParam String password)
	{
		return restaurantServiceImpl.getRestaurantUsingUsernameAndPassword(username, password); 
	}


}
