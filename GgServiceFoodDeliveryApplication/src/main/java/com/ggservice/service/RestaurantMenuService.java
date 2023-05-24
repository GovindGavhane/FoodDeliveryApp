package com.ggservice.service;

import java.util.List;

import com.ggservice.dto.RestaurantDto;
import com.ggservice.entity.RestaurantMenu;

public interface RestaurantMenuService {
	
	public RestaurantMenu saveMenu(RestaurantDto restaurantDto);
	public RestaurantMenu updateMenu(RestaurantDto restaurantDto);
	public RestaurantMenu getMenuById(Integer id);
	public boolean deleteMenu(Integer id);
	public List<RestaurantMenu> getMenuList();

}
