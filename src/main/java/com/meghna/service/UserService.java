package com.meghna.service;

import java.util.List;

import com.meghna.model.User;

public interface UserService {

    public User findUserProfileByJwt(String jwt) throws Exception;

    public User findUserByEmail(String email) throws Exception;

    public List<User> findAllUsers();

    public List<User> getPenddingRestaurantOwner();

    void updatePassword(User user, String newPassword);

    void sendPasswordResetEmail(User user);

}
