package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.ProductRepository;
import com.example.model.Product;

@RestController
@RequestMapping("product")
@Component
public class ProductController {
	@Autowired(required = false)
	private ProductRepository productRepository;

	@RequestMapping("/getAllProduct")
	@ResponseBody
	public List<Product> findAll() {
		List<Product> list = new ArrayList<Product>();
		list = productRepository.findAll();
		return list;
	}

//	@RequestMapping("/getByProductName")
//	@ResponseBody
//	public Product getByProductName(String productame) {
//		Product product = productRepository.findByProductName(productame);
//		return product;
//	}

}
