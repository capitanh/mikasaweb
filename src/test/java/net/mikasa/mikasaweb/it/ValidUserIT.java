package net.mikasa.mikasaweb.it;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ValidUserIT {
  
  @LocalServerPort
  private int port;
  
  private WebDriver driver;
  
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    //driver = new FirefoxDriver();
    driver = new HtmlUnitDriver();
    baseUrl = "http://localhost:" + port + "/mikasaweb";
    //baseUrl = "http://localhost:" + port;
    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  
  @Test
  public void testHomePage()  throws Exception {
    driver.get(baseUrl);
    assertTrue(driver.getPageSource().contains("mikasa.net 4.0 beta"));
  }
  
  @Test
  public void testValidUser() throws Exception {
    driver.get(baseUrl + "/login");
    WebElement element = driver.findElement(By.id("username"));
    element.sendKeys("admin");
    driver.findElement(By.id("password")).sendKeys("admin");
    driver.findElement(By.id("login")).click();
    assertTrue(driver.getPageSource().contains("mikasa.net 4.0 beta. Welcome"));
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

}
