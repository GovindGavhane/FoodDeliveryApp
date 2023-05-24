package com.ggservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ggservice.dto.RestaurantDto;
import com.ggservice.entity.Restaurant;
import com.ggservice.repository.RestaurantRepository;
import com.ggservice.service.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	RestaurantRepository restaurantRepository;
	
	@Override
	public Restaurant saveRestaurant(RestaurantDto restaurantDto) {
		Restaurant restaurant =new Restaurant();
		restaurant.setId(restaurantDto.getRestaurantId());
		restaurant.setName(restaurantDto.getRestaurantName());
		restaurant.setUsername(restaurantDto.getRestaurantUsername());
		restaurant.setLocation(restaurantDto.getRestaurantLocation());
		restaurant.setPassword(restaurantDto.getRestaurantPassword());
		restaurant.setConfirmPassword(restaurantDto.getRestaurantConfirmPassword());
		Restaurant r = restaurantRepository.save(restaurant);
		return r;
	}

	@Override
	public Restaurant updateRestaurant(RestaurantDto restaurantDto) {
		Restaurant restaurant =new Restaurant();
		restaurant.setId(restaurantDto.getRestaurantId());
		restaurant.setName(restaurantDto.getRestaurantName());
		restaurant.setUsername(restaurantDto.getRestaurantUsername());
		restaurant.setLocation(restaurantDto.getRestaurantLocation());
		restaurant.setPassword(restaurantDto.getRestaurantPassword());
		restaurant.setConfirmPassword(restaurantDto.getRestaurantConfirmPassword());
		Restaurant r = restaurantRepository.save(restaurant);
		return r;
	}

	@Override
	public Restaurant getRestaurant(Integer id) {
		
		return restaurantRepository.findById(id).get();
	}

	@Override
	public boolean deleteRestaurant(Integer id) {
		 Restaurant r = this.getRestaurant(id);
		 if(r!=null)
		 {
			 restaurantRepository.delete(r);
			 return true;
		 }
		return false;
	}

	@Override
	public List<Restaurant> getAllRestaurant() {
		 
		return restaurantRepository.findAll();
	}

	@Override
	public Restaurant getRestaurantUsingUsernameAndPassword(String username,String password) {
		
		Restaurant r = this.getRestaurantByUsernameAndPassword(username, password);
		if(r!=null)
		{
			return r;
		}
		return null;
	}
	
	public Restaurant getRestaurantByUsernameAndPassword(String username,String password)
	{
		return restaurantRepository.getRestaurantByUsernameAndPassword(username, password);
	}

	 
}
