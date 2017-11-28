package net.mikasa.mikasaweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan({"net.mikasa.mikasaweb"})
//@EntityScan("net.mikasa.mikasaweb")
@EnableJpaRepositories("net.mikasa.mikasaweb")
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
