package com.frico.crmweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication(scanBasePackages = "com.frico")
@MapperScan(value = "com.frico.crmcore.mapper",annotationClass = javax.annotation.Resource.class)
public class CrmWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrmWebApplication.class, args);
	}

}
