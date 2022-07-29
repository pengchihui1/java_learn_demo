# Getting Started

链接数据库

https://blog.csdn.net/haojuntu/article/details/81707165


## 数据库依赖
```
<!-- 添加Tomcat-JDBC依赖 -->
        <dependency>
            <groupId>org.apache.tomcat</groupId>
            <artifactId>tomcat-jdbc</artifactId>
        </dependency>
        <!-- 添加HikariCP依赖 -->
        <dependency>
            <groupId>com.zaxxer</groupId>
            <artifactId>HikariCP</artifactId>
        </dependency>
   
        <!-- 添加DBCP2依赖 -->
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-dbcp2</artifactId>
        </dependency>

		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
		</dependency>
		
				
		<dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid-spring-boot-starter</artifactId>
            <version>1.1.9</version>
        </dependency>
		
```

## 链接数据库

```
#spring:
#  profiles:
#    active: dev

server:
  port: 8080
  name: server
  version: public
spring:
  datasource:
    url: jdbc:mysql://localhost/prismamysql?serverTimezone=GMT
    username: root
    password: 
    driver-class-name: com.mysql.cj.jdbc.Driver
  jpa:
    show-sql: true
```

配置博客：https://zhuanlan.zhihu.com/p/356671895