package com.Nannas.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages="com.Nannas.repository")
@EntityScan(basePackages="com.Nannas.entity")
public class ApplicationConfig {

}
