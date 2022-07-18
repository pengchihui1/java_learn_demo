package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Product;

//Dao层主要用来实现对数据库的增、删、查、改。 dao只要继承JpaRepository类就可以，几乎可以不用写方法，
//可以根据方法名来自动的生产SQL，比如findByProductName 会自动生产一个以 ProductName 为参数的查询方法
//@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findAll();
//
//	@Query(value = "select * from product t where t.name =?1")
//	Product findProductForHql(Long name);

//	@Query(value = "select * from product t where t.id =?1", nativeQuery = true)
//	Product findProductForSql(Long id);
//
//	@Query(value = "select t from product t where t.id =?1")
//	Product findProductForHql(Long id);
//
//	@Query(value = "select t from product t where t.id = :id")
//	Product findProductForHql2(@Param("id") Long id);
//
//	@Modifying
//	@Query(value = "delete from product where id = ?1")
//	void deleteProduct(Long id);
//
//	@Modifying
//	@Query(value = "update product set name = ?1 where id = ?2")
//	void updateProduct(String name, Long id);

}