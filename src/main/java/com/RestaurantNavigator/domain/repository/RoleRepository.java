package com.RestaurantNavigator.domain.repository;



import com.RestaurantNavigator.domain.Role;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoleRepository {
    List<Role> findAllRoles();
    Optional<Role> findByRoleId(int idRole);
    Optional<Role> findByTypeRole(String role);
    Role save(Role role);
    Role update(Role role);
    void delete(int idRole);
}
