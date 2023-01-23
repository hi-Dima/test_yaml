package ru.mezencovid.test.demo.apigateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {
    @Bean
    public RouteLocator routeToServices(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("phoneService", r -> r.path("/phone/**")
                        .and().method("GET", "POST")
                        .uri("lb://phone-notification-service"))
                .route("emailService", r -> r.path("/email/**")
                        .and().method("GET", "POST")
                        .uri("lb://email-notification-service"))
                .route("pushService", r -> r.path("/push/**")
                        .and().method("GET", "POST")
                        .uri("lb://push-notification-service"))
                .build();
    }
}
