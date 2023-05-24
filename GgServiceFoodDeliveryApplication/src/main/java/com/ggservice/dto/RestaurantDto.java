package com.ggservice.dto;

import java.util.List;

import com.ggservice.entity.RestaurantMenu;

public class RestaurantDto {
	
	private Integer restaurantId;
	private String restaurantName;
	private String restaurantUsername;
	private String restaurantLocation;
	private String restaurantPassword;
	private String restaurantConfirmPassword;
	private List<RestaurantMenu> restaurantMenu;
	
	public Integer getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getRestaurantUsername() {
		return restaurantUsername;
	}
	public void setRestaurantUsername(String restaurantUsername) {
		this.restaurantUsername = restaurantUsername;
	}
	 
	public String getRestaurantLocation() {
		return restaurantLocation;
	}
	public void setRestaurantLocation(String restaurantLocation) {
		this.restaurantLocation = restaurantLocation;
	}
	public String getRestaurantPassword() {
		return restaurantPassword;
	}
	public void setRestaurantPassword(String restaurantPassword) {
		this.restaurantPassword = restaurantPassword;
	}
	public String getRestaurantConfirmPassword() {
		return restaurantConfirmPassword;
	}
	public void setRestaurantConfirmPassword(String restaurantConfirmPassword) {
		this.restaurantConfirmPassword = restaurantConfirmPassword;
	}
	
	
}
