package com.zainmorshed.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*") // More flexible than allowedOrigins
                .allowedOrigins(
                    "http://localhost:5173", 
                    "http://localhost:3000",
                    "https://yourfrontend.netlify.app", // Add your deployed frontend URL
                    "https://yourfrontend.vercel.app"   // Add other frontend URLs as needed
                )
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "PATCH")
                .allowedHeaders("*")
                .allowCredentials(true) // Changed to true for better compatibility
                .maxAge(3600); // Cache preflight for 1 hour
    }
}
