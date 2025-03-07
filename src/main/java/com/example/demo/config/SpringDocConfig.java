package com.example.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.servers.Server;

import java.util.List;

@Configuration
public class SpringDocConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Demo API")
                        .version("1.0")
                        .description("Tài liệu API cho dự án")
                )
                .servers(List.of(
                        new Server().url("http://localhost:8081").description("Server mặc định"),
                        new Server().url("http://localhost:9090").description("Cổng 9090")
                ));
    }
}
