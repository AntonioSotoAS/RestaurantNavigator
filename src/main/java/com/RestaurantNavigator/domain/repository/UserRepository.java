package com.RestaurantNavigator.domain.repository;



import com.RestaurantNavigator.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository {

    Optional<List<User>> findAllUsers();
    Optional<User> findByUserId(int idUser);
    Optional<User> findByUser(String user);
    User save(User user);
    User update(User user);
    void delete(int idUser);

}
