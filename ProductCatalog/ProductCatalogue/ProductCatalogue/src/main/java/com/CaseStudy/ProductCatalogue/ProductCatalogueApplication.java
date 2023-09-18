package com.CaseStudy.ProductCatalogue;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@EntityScan(basePackages="com.CaseStudy.ProductCatalogue.Entity")
//@OpenAPIDefinition(info = @Info(title = "Product Catalog", description = "Available Products"))
public class ProductCatalogueApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCatalogueApplication.class, args);
	}

}
