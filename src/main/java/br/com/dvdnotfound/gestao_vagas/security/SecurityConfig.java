package br.com.dvdnotfound.gestao_vagas.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

  @Bean
  SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> {
              auth.requestMatchers("/candidato/").permitAll()
                      .requestMatchers("/empresa").permitAll();
              auth.anyRequest().authenticated();
            })
    ;
    return http.build();
    }
  }
