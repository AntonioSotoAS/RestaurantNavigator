package com.RestaurantNavigator.repository;

import com.RestaurantNavigator.domain.Request;
import com.RestaurantNavigator.domain.repository.RequestRepository;
import com.RestaurantNavigator.repository.crud.OrderCrudRepository;
import com.RestaurantNavigator.repository.entity.OrderEntity;
import com.RestaurantNavigator.repository.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class OrderPersistenceRepository implements RequestRepository {

    @Autowired
    OrderCrudRepository orderCrudRepository;

    @Autowired
    OrderMapper orderMapper;


    @Override
    public List<Request> findAllRequests() {
        return orderMapper.toRequests((List<OrderEntity>) orderCrudRepository.findAll());
    }

    @Override
    public Optional<Request> findByIdRequest(int idRequest) {
        return orderCrudRepository.findByIdOrder(idRequest)
                .map(order -> orderMapper.toRequest(order));
    }

    @Override
    public Optional<Request> findIdByUser(int idUser) {
        return orderCrudRepository.findByIdUser(idUser)
                .map(order -> orderMapper.toRequest(order));
    }

    @Override
    public Request save(Request request) {
        OrderEntity orderEntity = orderMapper.toOrderEntity(request);
        return orderMapper.toRequest(orderCrudRepository.save(orderEntity));
    }

    @Override
    public Request update(Request request) {
        return findByIdRequest(request.getIdRequest())
                .map(orderUpdate -> {
                    orderUpdate.setIdUser(request.getIdUser());
                    orderUpdate.setState(request.getState());
                    orderUpdate.setUpdate_at(request.getUpdate_at());
                    OrderEntity orderEntity = orderMapper.toOrderEntity(orderUpdate);
                    return save(orderMapper.toRequest(orderEntity));

                }).orElse(null);
    }

    @Override
    public void delete(int idRequest) {
        orderCrudRepository.deleteById(idRequest);
    }
}
