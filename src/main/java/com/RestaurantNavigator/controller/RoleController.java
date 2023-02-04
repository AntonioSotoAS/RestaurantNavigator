package com.RestaurantNavigator.controller;

import com.RestaurantNavigator.domain.Role;
import com.RestaurantNavigator.domain.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;
    

    @GetMapping("/all")
    public ResponseEntity<List<Role>> getAll(){
        return new ResponseEntity<>(roleService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Role> getRole(int roleId){
        return roleService.getRoleId(roleId)
                .map(role -> new ResponseEntity<>(role,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    @PostMapping("/save")
    public ResponseEntity<Role> save(@RequestBody Role role){
        return new ResponseEntity<>(roleService.save(role),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int roleId){
        if(roleService.delete(roleId)){
            return new ResponseEntity<>(HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update")
    public Role update(@RequestBody Role role){
        return roleService.update(role);
    }

}
