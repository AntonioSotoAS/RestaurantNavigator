package com.RestaurantNavigator.domain.repository;



import com.RestaurantNavigator.domain.Role;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoleRepository {
    Optional<List<Role>> findAllRoles();
    Optional<Role> findByRoleId(Role role);
    Optional<Role> findByTypeRole(String role);
    void save(Role role);
    void update(Role role);
    void delete(Role role);
}
