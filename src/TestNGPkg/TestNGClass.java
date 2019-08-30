package TestNGPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGClass {
	WebDriver driver;
  @Test
  public void getPatymwebsite(){
	  System.setProperty("webdriver.chrome.driver","C:/Users/guntamukkala.r/Downloads/chromedriver_win32/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://paytm.com/");
  }
  
  @BeforeClass
  public void firstMethod(){
	  System.out.println("first_method");
  }
  @AfterClass
  public void secondMethod(){
	  System.out.println("Second_method");
  }
  
  
  
}
