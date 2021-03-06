package org.engim.springexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringExampleApplication.class, args);
    }

}
