package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.entity.Menu;

public interface MenuDao extends JpaRepository<Menu, Integer>, JpaSpecificationExecutor<Menu> {

}
