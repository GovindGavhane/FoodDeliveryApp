package com.ggservice.dto;

public class RestaurantMenuDto {
	
	private Integer restaurantMenuId;
	private String restaurantMenuName;
	private String restaurantMenuPrice;
	private String restaurantDescription;
	private RestaurantDto restaurantDto;
	
	public Integer getRestaurantMenuId() {
		return restaurantMenuId;
	}
	public void setRestaurantMenuId(Integer restaurantMenuId) {
		this.restaurantMenuId = restaurantMenuId;
	}
	public String getRestaurantMenuName() {
		return restaurantMenuName;
	}
	public void setRestaurantMenuName(String restaurantMenuName) {
		this.restaurantMenuName = restaurantMenuName;
	}
	public String getRestaurantMenuPrice() {
		return restaurantMenuPrice;
	}
	public void setRestaurantMenuPrice(String restaurantMenuPrice) {
		this.restaurantMenuPrice = restaurantMenuPrice;
	}
	public String getRestaurantDescription() {
		return restaurantDescription;
	}
	public void setRestaurantDescription(String restaurantDescription) {
		this.restaurantDescription = restaurantDescription;
	}
	public RestaurantDto getRestaurantDto() {
		return restaurantDto;
	}
	public void setRestaurantDto(RestaurantDto restaurantDto) {
		this.restaurantDto = restaurantDto;
	}
	
	
	
	

}
