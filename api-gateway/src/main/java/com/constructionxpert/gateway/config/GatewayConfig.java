package com.constructionxpert.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("user-service", r -> r.path("/api/users/**")
                        .uri("lb://user-service"))
                .route("project-service", r -> r.path("/api/projects/**")
                        .uri("lb://project-service"))
                .route("task-service", r -> r.path("/api/tasks/**")
                        .uri("lb://task-service"))
                .route("resource-service", r -> r.path("/api/resources/**")
                        .uri("lb://resource-service"))
                .build();
    }
}