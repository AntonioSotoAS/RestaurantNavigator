package com.RestaurantNavigator.domain.repository;



import com.RestaurantNavigator.domain.RequestDetail;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RequestDetailRepository {

    List<RequestDetail> findAllRequestDetails();
    Optional<RequestDetail> findByIdRequest(int idRequest);
    RequestDetail save(RequestDetail requestDetail);
    RequestDetail update(RequestDetail requestDetail);
    void delete(int idRequestDetail);

}
