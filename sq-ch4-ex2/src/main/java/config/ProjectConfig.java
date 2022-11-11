package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"proxies", "repositories", "services"})
public class ProjectConfig {
}
