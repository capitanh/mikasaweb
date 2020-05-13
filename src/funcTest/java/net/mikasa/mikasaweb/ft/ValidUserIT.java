package net.mikasa.mikasaweb.ft;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
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

  @Test
  public void testHomePage()  throws Exception {
    driver = new HtmlUnitDriver(true);
    baseUrl = "http://localhost:" + port;
    driver.get(baseUrl);
    assertTrue(driver.getPageSource().contains("mikasa.net 5.1.0"));

  }

  @Test
  public void testValidUser() throws Exception {
    driver = new HtmlUnitDriver(true);
    baseUrl = "http://localhost:" + port;
    driver.get(baseUrl + "/login");
    driver.findElement(By.id("username")).sendKeys("lnovo");
    driver.findElement(By.id("password")).sendKeys("alibaba");
    driver.findElement(By.id("login")).click();
    assertTrue(driver.getPageSource().contains("Firma del PO FEDER Cantabria"));
  }

}
