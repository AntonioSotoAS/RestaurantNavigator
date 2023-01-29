package com.RestaurantNavigator.domain.repository;



import com.RestaurantNavigator.domain.RequestDetail;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RequestDetailRepository {

    Optional<List<RequestDetail>> findAllRequestDetails();
    Optional<RequestDetail> findByRequestDetailId(RequestDetail requestDetail);
    Optional<RequestDetail> findByIdRequest(int idRequest);
    void save(RequestDetail requestDetail);
    void update(RequestDetail requestDetail);
    void delete(RequestDetail requestDetail);

}
