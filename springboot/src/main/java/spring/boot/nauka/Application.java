package spring.boot.nauka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import spring.boot.nauka.tasks.ScheduledTask;

/**
 * Created by Piotr Kulma on 21.05.15.
 */
@Configuration
@EnableAutoConfiguration
@EnableScheduling
@ComponentScan(basePackages = "spring.boot.nauka.controllers, spring.boot.nauka.tasks")
public class Application {
    @Bean
    public ScheduledTask scheduledTask() {
        return new ScheduledTask();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
