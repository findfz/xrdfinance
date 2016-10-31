package com.xrd.config;

import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.inject.Inject;

@Configuration
@EnableJpaRepositories("com.xrd.repository")
@EnableTransactionManagement
public class DatabaseConfiguration {

    private final Logger log = LoggerFactory.getLogger(DatabaseConfiguration.class);

    @Inject
    private Environment env;


    @Bean
    public Hibernate4Module hibernate4Module() {
        return new Hibernate4Module();
    }
}
