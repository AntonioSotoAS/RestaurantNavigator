package com.RestaurantNavigator.domain.service;

import com.RestaurantNavigator.domain.Product;
import com.RestaurantNavigator.domain.User;
import com.RestaurantNavigator.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.findAllUsers();
    }

    public Optional<User> getUserId(int idUser){
        return userRepository.findByUserId(idUser);
    }

    public Optional<User> getByUserName(String name){
        return userRepository.findByUser(name);
    }

    public User  save(User user){
        return userRepository.save(user);
    }
    public User update(User  user){
        return userRepository.update(user);
    }
    public boolean delete(int idUser){
        if (getUserId(idUser).isPresent()){
            userRepository.delete(idUser);
            return true;
        }else {
            return false;
        }
    }

}
