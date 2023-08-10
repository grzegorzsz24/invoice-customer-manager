package com.example.invoicecustomermanager.repository;

import com.example.invoicecustomermanager.model.Role;
import org.springframework.stereotype.Repository;

import java.util.Collection;

public interface RoleRepository <T extends Role>{
    T create (T data);
    Collection<T> list(int page, int pageSize);
    T get(Long id);
    T update(T data);
    Boolean delete(Long id);
    void addRoleToUser(Long userId, String roleName);
    Role getRoleByUserId(Long userid);
    Role getRoleByUserEmail(String email);
    void updateUserRole(Long userId, String roleName);
}
