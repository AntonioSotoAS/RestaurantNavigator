package com.RestaurantNavigator.domain.service;

import com.RestaurantNavigator.domain.Product;
import com.RestaurantNavigator.domain.Role;
import com.RestaurantNavigator.domain.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    RoleRepository roleRepository;

    public List<Role> getAll(){
        return roleRepository.findAllRoles();
    }

    public Optional<Role> getRoleId(int idRole){
        return roleRepository.findByRoleId(idRole);
    }

    public Optional<Role> getByRoleName(String name){
        return roleRepository.findByTypeRole(name);
    }

    public Role  save(Role role){
        return roleRepository.save(role);
    }
    public Role update(Role  role){
        return roleRepository.update(role);
    }
    public boolean delete(int idRole){
        if (getRoleId(idRole).isPresent()){
            roleRepository.delete(idRole);
            return true;
        }else {
            return false;
        }
    }
}
