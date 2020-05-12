package net.mikasa.mikasaweb.config;

import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest(classes = FTTestConfiguration.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, properties="spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration")
@SpringBootTest(classes = FTTestConfiguration.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class FTGenericTest {
}
