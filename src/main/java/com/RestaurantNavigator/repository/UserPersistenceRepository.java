package com.RestaurantNavigator.repository;

import com.RestaurantNavigator.domain.User;
import com.RestaurantNavigator.domain.repository.UserRepository;
import com.RestaurantNavigator.repository.crud.UserCrudRepository;
import com.RestaurantNavigator.repository.entity.UserEntity;
import com.RestaurantNavigator.repository.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserPersistenceRepository implements UserRepository {

    @Autowired
    UserCrudRepository userCrudRepository;

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findAllUsers() {
        return userMapper.toUsers((List<UserEntity>) userCrudRepository.findAll());
    }

    @Override
    public Optional<User> findByUserId(int idUser) {
        return userCrudRepository.findByIdUser(idUser)
                .map(user -> userMapper.toUser(user));
    }

    @Override
    public Optional<User> findByUser(String user) {
        return userCrudRepository.findByUsername(user)
                .map(username -> userMapper.toUser(username));
    }

    @Override
    public User save(User user) {
        UserEntity userEntity = userMapper.toUserEntity(user);
        return userMapper.toUser(userCrudRepository.save(userEntity));
    }

    @Override
    public User update(User user) {
        return findByUser(user.getUser())
                .map(userUpdate -> {
                    userUpdate.setIdRole(user.getIdRole());
                    userUpdate.setUser(user.getUser());
                    userUpdate.setPassword(user.getPassword());
                    userUpdate.setName(user.getName());
                    userUpdate.setLastName(user.getLastName());
                    userUpdate.setPhoto(user.getPhoto());
                    UserEntity userEntity = userMapper.toUserEntity(userUpdate);
                    return save(userMapper.toUser(userEntity));
                }).orElse(null);
    }

    @Override
    public void delete(int idUser) {
        userCrudRepository.deleteById(idUser);
    }
}
