package com.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // 表明是一个实体Bean
@Table(name = "product") // 自定义表名
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id // 标明主键
	@GeneratedValue(strategy = GenerationType.AUTO) // 主键自增，使用该注解在创建bi表的时候会同步创建一个hibernate-sequence表来记录下一个主键
	@Column(name = "id") // 定义列，可以自定义列名，指定列的类型以及一些约束
	private long id;
	@Column(name = "name")
	private String name;

	public Product(long id, String name, String description, String price, String image, String category_id) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.image = image;
		this.category_id = category_id;
	}

	@Column(name = "description")
	private String description;
	@Column(name = "price")
	private String price;
	@Column(name = "image")
	private String image;

	private String category_id;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

}
