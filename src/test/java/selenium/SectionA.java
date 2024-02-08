package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class SectionA {
	public static void main(String[] args) throws InterruptedException {
      System.setProperty("Webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\selenium\\target\\chromedriver.exe");
   // WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      String url = "https://www.facebook.com/login/";
      driver.get(url);
      driver.manage().window().maximize();
      
      driver.navigate().back();
      Thread.sleep(2000);
      driver.navigate().forward();
      Thread.sleep(3000);
      driver.navigate().refresh();
      
      
      driver.switchTo().newWindow(WindowType.TAB);
      String currenturl = driver.getCurrentUrl();
      System.out.println(currenturl);
      if (url.equals(currenturl)) {
    	  System.out.println("Given URL is correct");
      }
      else {
    	  System.err.println("Not matched the URL");
      }
      
      String title = driver.getTitle();
      System.out.println(title);
      
      String pagesource = driver.getPageSource();
      System.out.println(pagesource);
      driver.close();
      driver.quit();
      
	}
	
	
	
	
	
	
	
	

}
