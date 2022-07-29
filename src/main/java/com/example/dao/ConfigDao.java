package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.entity.Config;

public interface ConfigDao extends JpaRepository<Config, Integer>, JpaSpecificationExecutor<Config> {

}
