package com.hlz.domain;

import com.google.common.base.Predicate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ResourceBundle;

@SpringBootApplication(scanBasePackages = "com.hlz.*")
@MapperScan("com.hlz.domain.mapper")
@EnableSwagger2
@EnableScheduling
public class HlzApplication {

    public static void main(String[] args) {
        SpringApplication.run(HlzApplication.class, args);
    }


    @Bean
    public Docket swaggerApi(){
//        ResourceBundle resourceBundle = ResourceBundle.getBundle("application");
//        String key = resourceBundle.getString("spring.profiles.active");
        Predicate<String> regex = PathSelectors.regex("/.*");
//        if ("prod".equals(key)){
//            regex = PathSelectors.none();
//        }
        return new Docket(DocumentationType.SWAGGER_2)
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false)
                .pathMapping("/")
                .select()
                .paths(regex)
                .build()
                .apiInfo(apiInfo());

    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("THIS IS SHUAIGE TEST APIS")
                .description("这是帅哥测试API")
                .termsOfServiceUrl("")
                .contact(new Contact("","",""))
                .version("1.0.1")
                .build();
    }
}
