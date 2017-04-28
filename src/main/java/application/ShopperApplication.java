package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages= {"controller", "config"})
@EnableJpaRepositories("repo")
@EntityScan("model")

public class ShopperApplication extends SpringBootServletInitializer { 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(ShopperApplication.class, args);
	}

	@Override
    protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(ShopperApplication.class);
    }
}
