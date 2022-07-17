package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Product;

//Dao层主要用来实现对数据库的增、删、查、改。 dao只要继承JpaRepository类就可以，几乎可以不用写方法，
//可以根据方法名来自动的生产SQL，比如findByUserName 会自动生产一个以 userName 为参数的查询方法
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	// 拿取全部
	List<Product> findAll();

//	List<Product> findAllById(String id);

	// 根据姓名查找
//	Product findByProductName(String name);

}