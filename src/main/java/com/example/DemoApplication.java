package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.dao.ProductRepository;
import com.example.model.Product;

/**
 * 表示取消数据源的自动配置
 */

//@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
//@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@SpringBootApplication
@ComponentScan({ "com.example" })
@EntityScan(basePackages = "com.example.model")
@EnableJpaRepositories(basePackages = "com.example.dao") // 启用自动配置魔法
public class DemoApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class);
	}

	@Bean
	public CommandLineRunner demo(ProductRepository repository) {
		return (args) -> {

			// fetch all customers
			log.info("product found with findAll():");
			log.info("-------------------------------");
			for (Product product : repository.findAll()) {
				System.out.println(product.toString());
			}

		};
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	}

}