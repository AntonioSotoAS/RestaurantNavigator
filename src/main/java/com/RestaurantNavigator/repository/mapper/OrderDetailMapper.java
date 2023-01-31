package com.RestaurantNavigator.repository.mapper;

import com.RestaurantNavigator.domain.Category;
import com.RestaurantNavigator.domain.RequestDetail;
import com.RestaurantNavigator.repository.entity.CategoryEntity;
import com.RestaurantNavigator.repository.entity.OrderDetailEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface OrderDetailMapper {
        //source is entity
    @Mappings({
            @Mapping(source = "idOrderDetail",target = "idRequestDetail"),
            @Mapping(source = "idProduct",target = "idProduct"),
            @Mapping(source = "amount",target = "cantidad"),
            @Mapping(source = "idOrder",target = "idRequest")
    })
    RequestDetail toRequestDetail(OrderDetailEntity orderDetailEntity);

    List<RequestDetail> toRequestDetails(List<OrderDetailEntity> orderDetailEntities);

    @InheritInverseConfiguration
    OrderDetailEntity toOrderDetailEntity(RequestDetail ordRequestDetail);

}
