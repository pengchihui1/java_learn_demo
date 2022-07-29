package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.entity.Role;

public interface RoleDao extends JpaRepository<Role, Integer>, JpaSpecificationExecutor<Role> {

}
