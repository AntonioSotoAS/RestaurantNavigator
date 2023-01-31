package com.RestaurantNavigator.repository.mapper;

import com.RestaurantNavigator.domain.Request;
import com.RestaurantNavigator.domain.RequestDetail;
import com.RestaurantNavigator.repository.entity.OrderDetailEntity;
import com.RestaurantNavigator.repository.entity.OrderEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface OrderMapper {

    @Mappings({
            @Mapping(source = "idOrder",target = "idRequest"),
            @Mapping(source = "idUser",target = "idUser"),
            @Mapping(source = "state",target = "state"),
            @Mapping(source = "updateAt",target = "update_at"),
            @Mapping(source = "createAt",target = "create_at")
    })
    Request toRequest(OrderEntity orderEntity);

    List<Request> toRequests(List<OrderEntity> orderEntities);

    @InheritInverseConfiguration
    OrderEntity toOrderEntity(Request request);

}
