package com.RestaurantNavigator.repository;

import com.RestaurantNavigator.domain.Role;
import com.RestaurantNavigator.domain.repository.RoleRepository;
import com.RestaurantNavigator.repository.crud.RoleCrudRepository;
import com.RestaurantNavigator.repository.entity.RoleEntity;
import com.RestaurantNavigator.repository.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RolePersistenceRepository implements RoleRepository {

    @Autowired
    RoleCrudRepository roleCrudRepository;

    @Autowired
    RoleMapper roleMapper;


    @Override
    public List<Role> findAllRoles() {
        return roleMapper.toRoles((List<RoleEntity>) roleCrudRepository.findAll());
    }

    @Override
    public Optional<Role> findByRoleId(int idRole) {
        return roleCrudRepository.findByIdRole(idRole)
                .map(role -> roleMapper.toRole(role));
    }

    @Override
    public Optional<Role> findByTypeRole(String role) {
        return roleCrudRepository.findByTypeRole(role)
                .map(roleEntity -> roleMapper.toRole(roleEntity));
    }

    @Override
    public Role save(Role role) {
        RoleEntity roleEntity = roleMapper.toRoleEntity(role);
        return roleMapper.toRole(roleCrudRepository.save(roleEntity));
    }

    @Override
    public Role update(Role role) {
        return findByRoleId(role.getIdRole())
                .map(roleUpdate -> {
                    roleUpdate.setTypeRole(role.getTypeRole());
                    RoleEntity roleEntity = roleMapper.toRoleEntity(roleUpdate);
                    return save(roleMapper.toRole(roleEntity));
                }).orElse(null);
    }

    @Override
    public void delete(int idRole) {
        roleCrudRepository.deleteById(idRole);
    }
}
