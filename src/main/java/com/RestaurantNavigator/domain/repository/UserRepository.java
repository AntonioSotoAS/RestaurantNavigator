package com.RestaurantNavigator.domain.repository;



import com.RestaurantNavigator.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository {

    Optional<List<User>> findAllUsers();
    Optional<User> findByUserId(User user);
    Optional<User> findByUser(String user);
    void save(User user);
    void update(User user);
    void delete(User user);

}
