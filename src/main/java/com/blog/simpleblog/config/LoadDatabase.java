package com.blog.simpleblog.config;

import com.blog.simpleblog.dao.EmployeeRepository;
import com.blog.simpleblog.entity.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description
 * @author lilei
 * @date 2022/6/22 16:31
 */
@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    /**
     * Spring Boot will run ALL CommandLineRunner beans once the application context is loaded.
     */
    @Bean
    CommandLineRunner initDataBase(EmployeeRepository repository){
        return args -> {
            log.info("Preloading "+ repository.save(new Employee("Bilbo", "burglar")));
            log.info("Preloading "+ repository.save(new Employee("Frodo", "thief")));
        };
    }
}
