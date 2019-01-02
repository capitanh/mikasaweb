package net.mikasa.mikasaweb.config;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ITTestConfiguration.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, properties="spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration")
public abstract class ITGenericTest {
}
