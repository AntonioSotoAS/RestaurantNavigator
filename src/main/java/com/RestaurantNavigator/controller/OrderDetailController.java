package com.RestaurantNavigator.controller;

import com.RestaurantNavigator.domain.RequestDetail;
import com.RestaurantNavigator.domain.service.RequestDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/orderDetail")
public class OrderDetailController {

    @Autowired
    private RequestDetailService requestDetailService;
    

    @GetMapping("/all")
    public ResponseEntity<List<RequestDetail>> getAll(){
        return new ResponseEntity<>(requestDetailService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RequestDetail> getRequestDetail(int requestId){
        return requestDetailService.getRequestDetailId(requestId)
                .map(requestDetail -> new ResponseEntity<>(requestDetail,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    @PostMapping("/save")
    public ResponseEntity<RequestDetail> save(@RequestBody RequestDetail requestDetail){
        return new ResponseEntity<>(requestDetailService.save(requestDetail),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int requestDetailId){
        if(requestDetailService.delete(requestDetailId)){
            return new ResponseEntity<>(HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update")
    public RequestDetail update(@RequestBody RequestDetail requestDetail){
        return requestDetailService.update(requestDetail);
    }

}
