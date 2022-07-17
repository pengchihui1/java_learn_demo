package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 表示取消数据源的自动配置 @SpringBootApplication(exclude = {
 * DataSourceAutoConfiguration.class })
 */
//@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })

//@EnableJpaRepositories("com.example.dao")
//@EntityScan("com.example.model")
//@EnableAutoConfiguration
//@ComponentScan
public class Demo2Application implements CommandLineRunner {
//
//	@Autowired
//	DataSource dataSource;
//
//	@Autowired
//	ProductRepository productRepository;

	@RequestMapping("/")
	public String sayHello() {
		return "hello world";
	}

	public static void main(String[] args) {
		System.out.println("开始");
		SpringApplication.run(Demo2Application.class, args);
		System.out.println("结束");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("Our DataSource is = " + dataSource);
////		Iterable<com.example.demo.model.Product> productlist = productRepository.findAll();
////		for (com.example.demo.model.Product systemmodel : productlist) {
////			System.out.println("Here is a system: " + systemmodel.toString());
////		}
//	}

}