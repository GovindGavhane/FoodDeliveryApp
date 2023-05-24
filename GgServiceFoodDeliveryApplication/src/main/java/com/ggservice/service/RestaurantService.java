package com.ggservice.service;

import java.util.List;

import com.ggservice.dto.RestaurantDto;
import com.ggservice.entity.Restaurant;

public interface RestaurantService  {
	
	public Restaurant saveRestaurant(RestaurantDto restaurantDto);
	public Restaurant updateRestaurant(RestaurantDto restaurantDto);
	public Restaurant getRestaurant(Integer id);
	public boolean deleteRestaurant(Integer id);
	public List<Restaurant> getAllRestaurant();
	public Restaurant getRestaurantUsingUsernameAndPassword(String username,String password);

}
