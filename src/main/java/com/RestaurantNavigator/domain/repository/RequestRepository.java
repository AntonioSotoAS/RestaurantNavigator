package com.RestaurantNavigator.domain.repository;


import com.RestaurantNavigator.domain.Request;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RequestRepository {
    Optional<List<Request>> findAllRequests();
    Optional<Request> findByRequestId(Request request);
    Optional<Request> findByUser(int idUser);
    void save(Request request);
    void update(Request request);
    void delete(Request request);
}
