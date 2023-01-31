package com.RestaurantNavigator.domain.repository;


import com.RestaurantNavigator.domain.Request;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RequestRepository {
    Optional<List<Request>> findAllRequests();
    Optional<Request> findByUser(int idUser);
    Request save(Request request);
    Request update(Request request);
    void delete(int idRequest);
}
