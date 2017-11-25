package net.mikasa.mikasaweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.apache.tomcat.util.descriptor.web.ContextResource;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
  
  @Bean
  public TomcatEmbeddedServletContainerFactory tomcatFactory() {
    return new TomcatEmbeddedServletContainerFactory() {

      @Override
      protected TomcatEmbeddedServletContainer getTomcatEmbeddedServletContainer(Tomcat tomcat) {
        tomcat.enableNaming();
        return super.getTomcatEmbeddedServletContainer(tomcat);
      }

      @Override
      protected void postProcessContext(Context context) {
        ContextResource resource = new ContextResource();
        resource.setName("/jdbc/mikasadb");
        resource.setType(DataSource.class.getName());
        resource.setProperty("driverClassName", "com.mysql.jdbc.Driver");
        resource.setProperty("url", "jdbc:mysql://localhost:13306/mikasadb");
        resource.setProperty("factory", "org.apache.tomcat.jdbc.pool.DataSourceFactory");
        resource.setProperty("username", "mikasadb");
        resource.setProperty("password", "mikasadb");

        context.getNamingResources().addResource(resource);
      }
    };
  }

}
