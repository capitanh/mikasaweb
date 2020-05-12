package net.mikasa.mikasaweb.ft;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.boot.web.server.LocalServerPort;
import net.mikasa.mikasaweb.config.FTGenericTest;


public class ValidUserIT extends FTGenericTest{

  @LocalServerPort
  private int port;

  private WebDriver driver;

  private String baseUrl;
  //private StringBuffer verificationErrors = new StringBuffer();

  /*@BeforeAll
  public static void setUp() throws Exception {
    driver = new HtmlUnitDriver(true);
    baseUrl = "http://localhost:" + port;
  }*/

  @Test
  public void testHomePage()  throws Exception {
    driver = new HtmlUnitDriver(true);
    baseUrl = "http://localhost:" + port;
    driver.get(baseUrl);
    assertThat(driver.getPageSource().contains("mikasa.net 4.0 beta")==true);

  }

  @Test
  public void testValidUser() throws Exception {
    driver = new HtmlUnitDriver(true);
    baseUrl = "http://localhost:" + port;
    driver.get(baseUrl + "/login");
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.id("password")).sendKeys("admin");
    driver.findElement(By.id("login")).click();
    assertThat(driver.getPageSource().contains("mikasa.net 4.0 beta. Welcome")==true);
  }

  //@AfterAll
  //public void tearDown() throws Exception {
    //driver.quit();
    /*String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }*/
  //}

}
