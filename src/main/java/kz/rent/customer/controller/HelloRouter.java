package kz.rent.customer.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class HelloRouter {

    @Bean
    public RouterFunction<ServerResponse> helloRoute() {
        HandlerFunction<ServerResponse> helloHandler = request -> ServerResponse.ok().bodyValue("Hello, World!");
        return route(GET("/hello"), helloHandler);
    }

    // endpoint that returns my name
}