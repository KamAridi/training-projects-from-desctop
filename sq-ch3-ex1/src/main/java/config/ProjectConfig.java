package config;

import main.Parrot;
import main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("dodo");
        return p;
    }

    @Bean
    public Person person(){
        Person p = new Person();
        p.setName("Bob");
        p.setParrot(parrot());
        return p;
    }
}
