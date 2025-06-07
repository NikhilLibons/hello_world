package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point for the Hello World Spring Boot application.
 */
@SpringBootApplication
public final class HelloworldApplication {

    // Private constructor to prevent instantiation
    private HelloworldApplication() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(HelloworldApplication.class, args);
    }

}
