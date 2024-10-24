package com.meghna.service;

import java.util.List;

import com.meghna.dto.RestaurantDto;
import com.meghna.model.Restaurant;
import com.meghna.model.User;
import com.meghna.request.CreateRestaurantRequest;

public interface RestaurantService {

    public Restaurant createRestaurant(CreateRestaurantRequest req,User user);

    public Restaurant updateRestaurant(Long restaurantId, CreateRestaurantRequest updatedRestaurant)
            throws Exception;

    public void deleteRestaurant(Long restaurantId) throws Exception;

    public List<Restaurant>getAllRestaurant();

    public List<Restaurant>searchRestaurant(String keyword);

    public Restaurant findRestaurantById(Long id) throws Exception;

    public Restaurant getRestaurantsByUserId(Long userId) throws Exception;

    public RestaurantDto addToFavorites(Long restaurantId,User user) throws Exception;

    public Restaurant updateRestaurantStatus(Long id)throws Exception;
}
