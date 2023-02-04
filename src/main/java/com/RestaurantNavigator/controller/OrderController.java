package com.RestaurantNavigator.controller;

import com.RestaurantNavigator.domain.Request;
import com.RestaurantNavigator.domain.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RequestService requestService;
    

    @GetMapping("/all")
    public ResponseEntity<List<Request>> getAll(){
        return new ResponseEntity<>(requestService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Request> getRequest(int requestId){
        return requestService.getRequestId(requestId)
                .map(request -> new ResponseEntity<>(request,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    @PostMapping("/save")
    public ResponseEntity<Request> save(@RequestBody Request request){
        return new ResponseEntity<>(requestService.save(request),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int requestId){
        if(requestService.delete(requestId)){
            return new ResponseEntity<>(HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update")
    public Request update(@RequestBody Request request){
        return requestService.update(request);
    }

}
