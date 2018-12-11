package com.qfedu.yikitchen.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @author Nvarchar
 */
@Configuration   //标记位配置文件
@EnableSwagger2  //使用Swagger
public class SwaggerConfig {
    //生成站点信息
    public ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("easycook在线接口文档")
                .description("主要实现开发中的cookies项目的在线接口描述信息")
                .contact(new Contact("As","http://www.1000phone.com","asang9503@Gmail.com")).
                        build();
    }
    @Bean   //类似<bean> 创建对象 IOC
    public Docket createDocket(){
        return new Docket(DocumentationType.SWAGGER_2).//文档的类型
                apiInfo(apiInfo()).select().//整个在线接口文档的设置
                apis(RequestHandlerSelectors.basePackage("com.qfedu.yikitchen.controller")).//需要生成接口文档的包 使用Swagger的包
                build();
    }
}
