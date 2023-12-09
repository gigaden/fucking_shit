//package com.example.demo.configuration;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
//import org.springframework.security.web.SecurityFilterChain;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//
//        return null;
//    }
//
//    @Bean
//    public WebSecurityCustomizer webSecurityCustomizer() {
//
//        return null;
//    }
//
//    private DataSource dataSource;
//
//    @Autowired
//    public void setDataSource(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }
//
//
//}
