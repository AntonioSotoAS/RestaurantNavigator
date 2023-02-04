package com.RestaurantNavigator.repository;

import com.RestaurantNavigator.domain.RequestDetail;
import com.RestaurantNavigator.domain.repository.RequestDetailRepository;
import com.RestaurantNavigator.repository.crud.OrderDetailCrudRepository;
import com.RestaurantNavigator.repository.entity.OrderDetailEntity;
import com.RestaurantNavigator.repository.mapper.OrderDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OrderDetailPersistenceRepository implements RequestDetailRepository {


    @Autowired
    OrderDetailCrudRepository orderDetailCrudRepository;

    @Autowired
    OrderDetailMapper orderDetailMapper;


    @Override
    public List<RequestDetail> findAllRequestDetails() {
        return orderDetailMapper.toRequestDetails((List<OrderDetailEntity>) orderDetailCrudRepository.findAll());
    }

    @Override
    public Optional<RequestDetail> findByIdRequest(int idRequest) {
        return orderDetailCrudRepository.findByIdOrderDetail(idRequest)
                .map(orderDetail -> orderDetailMapper.toRequestDetail(orderDetail));
    }

    @Override
    public RequestDetail save(RequestDetail requestDetail) {
        OrderDetailEntity orderDetailEntity = orderDetailMapper.toOrderDetailEntity(requestDetail);
        return orderDetailMapper.toRequestDetail(orderDetailCrudRepository.save(orderDetailEntity));
    }

    @Override
    public RequestDetail update(RequestDetail requestDetail) {
        return findByIdRequest(requestDetail.getIdRequestDetail())
                .map(orderDetailUpdate -> {
                    orderDetailUpdate.setIdProduct(requestDetail.getIdProduct());
                    orderDetailUpdate.setIdRequestDetail(requestDetail.getIdRequest().getIdRequest());
                    orderDetailUpdate.setCantidad(requestDetail.getCantidad());
                    OrderDetailEntity orderDetailEntity = orderDetailMapper.toOrderDetailEntity(orderDetailUpdate);
                    return save(orderDetailMapper.toRequestDetail(orderDetailEntity));
                }).orElse(null);
    }

    @Override
    public void delete(int idRequestDetail) {
        orderDetailCrudRepository.deleteById(idRequestDetail);
    }
}
