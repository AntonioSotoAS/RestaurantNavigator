package com.RestaurantNavigator.domain.service;

import com.RestaurantNavigator.domain.Product;
import com.RestaurantNavigator.domain.RequestDetail;
import com.RestaurantNavigator.domain.repository.RequestDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequestDetailRepositoryService {

    @Autowired
    private RequestDetailRepository requestDetailRepository;

    public List<RequestDetail> getAll(){
        return requestDetailRepository.findAllRequestDetails();
    }

    public Optional<RequestDetail> getRequestDetailId(int idRequestDetail){
        return requestDetailRepository.findByIdRequest(idRequestDetail);
    }


    public RequestDetail  save(RequestDetail requestDetail){
        return requestDetailRepository.save(requestDetail);
    }
    public RequestDetail update(RequestDetail  requestDetail){
        return requestDetailRepository.update(requestDetail);
    }
    public boolean delete(int idRequestDetail){
        if(getRequestDetailId(idRequestDetail).isPresent()){
            requestDetailRepository.delete(idRequestDetail);
            return true;
        }else{
            return false;
        }

    }

}
