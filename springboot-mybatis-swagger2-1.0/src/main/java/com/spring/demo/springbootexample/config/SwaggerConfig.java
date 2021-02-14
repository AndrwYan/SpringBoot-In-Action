package com.spring.demo.springbootexample.config;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


public class SwaggerConfig {
    private final String version="1.0";
    private final String title="SpringBoot示例工程";
    private final String description="API文档自动生成实例";
    private final String termsOfServiceUrl="http://www.andrew.com";
    private final String license="MIT";
    private final String licenseUrl = "https://mit-license.org/";
    private final Contact contact = new Contact("海森堡", "https://github.com/HaiSenBao", "HaiSenBao@gmail.com");

    @Bean
    public Docket buildDocket(){
         return new Docket(DocumentationType.SWAGGER_2).apiInfo(buildApiInf()).select().build();
    }
    private ApiInfo buildApiInf(){
        return new ApiInfoBuilder().title(title).termsOfServiceUrl(termsOfServiceUrl).description(description).version(version).license(license).licenseUrl(licenseUrl).contact(contact).build();
    }
}
