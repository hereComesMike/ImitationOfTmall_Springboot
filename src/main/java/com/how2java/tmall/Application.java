package com.how2java.tmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.how2java.tmall.util.PortUtil;

@SpringBootApplication
@EnableCaching
@EnableElasticsearchRepositories(basePackages = "com.how2java.tmall.es")
@EnableJpaRepositories(basePackages = {"com.how2java.tmall.dao", "com.how2java.tmall.pojo"})
public class Application {
	static {
		PortUtil.checkPort(6379, "Redis服务端", true);
		PortUtil.checkPort(9300, "ElasticSearch服务端", true);
		PortUtil.checkPort(5601, "Kibana工具", true);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
