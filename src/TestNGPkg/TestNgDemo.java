package TestNGPkg;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestNgDemo {
	WebDriver driver;
	WebElement ele;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:/Users/guntamukkala.r/Downloads/chromedriver_win32/chromedriver.exe");
	  driver = new ChromeDriver();
	  //driver.get("https://www.wikipedia.org/");
	 // ele = driver.findElement(By.xpath("//input[@id='searchInput']"));
	//ele.sendKeys("english");
	  //ele.submit();
    //driver.get("https://en.wikipedia.org/wiki/English");
   //count of links
	  driver.get("https://en.wikipedia.org/wiki/English");
		ArrayList link = new ArrayList();
		 driver.findElement(By.tagName("a"));
		System.out.println(link.size());
		
	  
	  
  }
 /* @Test
  public void countOfLinks(){
	  driver.get("https://en.wikipedia.org/wiki/English");
	ArrayList link = new ArrayList();
	 driver.findElement(By.tagName("a"));
	System.out.println(link.size());
	
  }*/
}
