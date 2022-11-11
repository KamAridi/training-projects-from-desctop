package config;

import main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("main")
public class ProjectConfig {

    @Bean
    public Parrot parrot1(){
        Parrot p = new Parrot();
        p.setName("dodo");
        return p;
    }

    @Bean
    public Parrot parrot2(){
        Parrot p = new Parrot();
        p.setName("coco");
        return p;
    }
}
