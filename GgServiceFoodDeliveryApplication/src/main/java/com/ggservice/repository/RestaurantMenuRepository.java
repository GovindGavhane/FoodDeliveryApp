package com.ggservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ggservice.entity.RestaurantMenu;

public interface RestaurantMenuRepository extends JpaRepository<RestaurantMenu, Integer>  {

}
