package com.ggservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class RestaurantMenu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer menuId;
	private String menuName;
	private String menuPrice;
	private String description;
	@ManyToOne
	private Restaurant restaurant;
	
	
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuPrice() {
		return menuPrice;
	}
	public void setMenuPrice(String menuPrice) {
		this.menuPrice = menuPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
