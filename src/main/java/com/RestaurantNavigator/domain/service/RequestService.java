package com.RestaurantNavigator.domain.service;

import com.RestaurantNavigator.domain.Product;
import com.RestaurantNavigator.domain.Request;
import com.RestaurantNavigator.domain.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequestService {

    @Autowired
    private RequestRepository requestRepository;

    public List<Request> getAll(){
        return requestRepository.findAllRequests();
    }

    public Optional<Request> getRequestId(int idRequest){
        return requestRepository.findByIdRequest(idRequest);
    }

    public Optional<Request> getRequestUserId(int idRequest){
        return requestRepository.findIdByUser(idRequest);
    }

    public Request  save(Request request){
        return requestRepository.save(request);
    }
    public Request update(Request  product){
        return requestRepository.update(product);
    }
    public boolean delete(int idRequest){
        if (getRequestId(idRequest).isPresent()){
            requestRepository.delete(idRequest);
            return true;
        }else {
            return false;
        }
    }

}
