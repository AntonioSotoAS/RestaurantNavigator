package com.RestaurantNavigator.domain.repository;


import com.RestaurantNavigator.domain.Request;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RequestRepository {
    List<Request> findAllRequests();

    Optional<Request> findByIdRequest(int idRequest);
    Optional<Request> findIdByUser(int idUser);
    Request save(Request request);
    Request update(Request request);
    void delete(int idRequest);
}
