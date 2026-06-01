package com.exercicios.gerenciamentoDeLivros.filters;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Controller;

// @Configuration Mostra que essa classe será utilizada como configuração
@Configuration
// @EnableWebSecurity permite manipular o Spring Security
@EnableWebSecurity
public class SecurityFilter {

    // @Bean mostra que essa classe/método está pronto para ser usado
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) {
        return http.csrf(csrf -> csrf.disable())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(auth -> auth.requestMatchers(HttpMethod.GET, "/livros").permitAll())
                .authorizeHttpRequests(auth -> auth.requestMatchers(HttpMethod.POST, "/livros").permitAll())
                .build();
    }
}
