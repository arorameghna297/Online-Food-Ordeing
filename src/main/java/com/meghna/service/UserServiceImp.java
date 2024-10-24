package com.meghna.service;

import com.meghna.config.JwtProvider;
import com.meghna.model.User;
import com.meghna.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements  UserService {

    @Autowired
    UserRepository userRepository;


    @Autowired
    JwtProvider jwtProvider;

    @Override
    public User findUserProfileByJwt(String jwt) throws Exception {
       String email= jwtProvider.getEmailFromJwtToken(jwt);
        User user=findUserByEmail(email);
        return user;

    }

    @Override
    public User findUserByEmail(String email) throws Exception {
       User user=userRepository.findByEmail(email);
       if(user==null)
       {
           throw new Exception("user not found");
       }
       return user;
    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }

    @Override
    public List<User> getPenddingRestaurantOwner() {
        return null;
    }

    @Override
    public void updatePassword(User user, String newPassword) {

    }

    @Override
    public void sendPasswordResetEmail(User user) {

    }
}
