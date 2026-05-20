package com.example.revisao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Desabilita proteção contra CSRF para testes no Insomnia
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // LIBERA TODAS AS ROTAS SEM SENHA
                );
        return http.build();
    }

}
