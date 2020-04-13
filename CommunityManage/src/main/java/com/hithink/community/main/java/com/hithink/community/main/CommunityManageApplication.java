package com.hithink.community.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@MapperScan("com.hithink.community.main.mapper")
public class CommunityManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommunityManageApplication.class, args);
	}

}
