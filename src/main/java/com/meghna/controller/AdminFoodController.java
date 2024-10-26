package com.meghna.controller;

import com.meghna.model.Food;
import com.meghna.request.CreateFoodRequest;
import com.meghna.service.FoodService;
import com.meghna.service.RestaurantService;
import com.meghna.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/food")
public class AdminFoodController {

    @Autowired
    private FoodService foodService;

    @Autowired
    private UserService userService;

    @Autowired
    private RestaurantService restaurantService;

    public ResponseEntity<Food>  createFood(@RequestBody CreateFoodRequest req,
                                            @RequestHeader("Authorization") String jwt) throws Exception{


    }
}
