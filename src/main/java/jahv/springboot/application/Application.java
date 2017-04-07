package jahv.springboot.application;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;

import jahv.springboot.domain.Journal;
import jahv.springboot.repository.JournalRepository;

@SpringBootApplication
//@ComponentScan({"jahv.springboot"})
//@EnableJpaRepositories({"jahv.springboot"})
public class Application {

    //InitializingBean class is always called when the Spring engine is creating the instance to initialize it
    @Bean
    InitializingBean saveData(JournalRepository repo) {
        return () -> {
            repo.save(new Journal("Get to know Spring Boot","Today I will learn Spring Boot","01/01/2016"));
            repo.save(new Journal("Simple Spring Boot Project","I will do my first Spring Boot Project","01/02/2016"));
            repo.save(new Journal("Spring Boot Reading","Read more about Spring Boot","02/01/2016"));
            repo.save(new Journal("Spring Boot in the Cloud","Spring Boot using Cloud Foundry","03/01/2016"));
        };
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);

        for(String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
