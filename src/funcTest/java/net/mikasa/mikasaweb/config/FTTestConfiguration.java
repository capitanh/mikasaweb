package net.mikasa.mikasaweb.config;

import org.apache.catalina.startup.Tomcat;
//import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer;
import org.springframework.boot.web.embedded.tomcat.TomcatWebServer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
//import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
//import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableAutoConfiguration(exclude={EmbeddedMongoAutoConfiguration.class, MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@EnableAutoConfiguration
@ComponentScan("net.mikasa.mikasaweb")
public class FTTestConfiguration {

  @Bean
  public TomcatServletWebServerFactory tomcatFactory() {
    return new TomcatServletWebServerFactory() {

      @Override
      protected TomcatWebServer getTomcatWebServer(Tomcat tomcat) {
        tomcat.enableNaming();
        //return super.getTomcatEmbeddedServletContainer(tomcat);
        return super.getTomcatWebServer(tomcat);
      }
    };
  }
}
