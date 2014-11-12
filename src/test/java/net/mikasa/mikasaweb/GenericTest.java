package net.mikasa.mikasaweb;

import net.mikasa.mikasaweb.config.TestConfiguration;

import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestConfiguration.class)
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,DirtiesContextTestExecutionListener.class,TransactionalTestExecutionListener.class,DbUnitTestExecutionListener.class })
@DatabaseSetup("/DataTest.xml")
public abstract class GenericTest {


}
