package com.swagger.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author lixiang
 * @date 2020-04-07-23:04
 */
@Configuration
@EnableSwagger2
@EnableWebMvc
//必须存在 扫描API Controller包
@ComponentScan(basePackages = {"com.swagger.controller"})
public class SwaggerConfig {
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2);
    }

    public ApiInfo apiInfo() {
        Contact contact = new Contact("zed", "http://localhost", "18500942@qq.com");
        return new ApiInfoBuilder()//
                .title("刘亚项目API接口")//
                .description("API接口")//
                .contact(contact)//
                .version("1.1.0")//
                .build();
    }

}
