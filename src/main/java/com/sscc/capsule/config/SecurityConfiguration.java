package com.sscc.capsule.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;


@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfiguration {

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        String requestMatcher[] = {"/v3/api-docs/**", "/swagger-ui/**", "/swagger-resources/**"};
        return (web) -> web.ignoring().requestMatchers(requestMatcher);
    }
}


