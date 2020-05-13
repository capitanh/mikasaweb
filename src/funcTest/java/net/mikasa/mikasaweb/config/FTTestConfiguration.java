package net.mikasa.mikasaweb.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.catalina.startup.Tomcat;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatWebServer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.ScriptOperations;
import org.springframework.data.mongodb.core.script.ExecutableMongoScript;

@Configuration
//@EnableAutoConfiguration(exclude={EmbeddedMongoAutoConfiguration.class, MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@EnableAutoConfiguration
@ComponentScan("net.mikasa.mikasaweb")
public class FTTestConfiguration {
  
  private static Logger log = LoggerFactory.getLogger(FTTestConfiguration.class);
  
  @Autowired
  private ApplicationContext ctx;

  @Autowired
  private MongoTemplate mongoTemplate;

  @Bean
  public TomcatServletWebServerFactory tomcatFactory() {
    return new TomcatServletWebServerFactory() {

      @Override
      protected TomcatWebServer getTomcatWebServer(Tomcat tomcat) {
        tomcat.enableNaming();
        return super.getTomcatWebServer(tomcat);
      }
    };
  }
  
  @Bean
  public String initDb() throws IOException {

    log.info("Initializing test database...");
    Resource resource = ctx.getResources("classpath:testdata.js")[0];
    InputStream is = resource.getInputStream();
    //String scriptBody = IOUtils.toString(is, Charsets.UTF_8);
    String scriptBody = IOUtils.toString(is);

    log.info("Importing test data...");
    ScriptOperations scriptOps = mongoTemplate.scriptOps();
    ExecutableMongoScript script = new ExecutableMongoScript(scriptBody);
    scriptOps.execute(script, "dataLoader");
    return "ok";
  }
}
