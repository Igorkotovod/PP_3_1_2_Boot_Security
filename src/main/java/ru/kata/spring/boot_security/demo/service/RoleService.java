package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.models.Role;

import java.util.List;

public interface RoleService {
    Role findRoleById(Long id);
    List<Role> getAllRoles();
    void addRole(Role role);
}
