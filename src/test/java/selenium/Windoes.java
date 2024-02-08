package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windoes {
	public static void main(String[]args) {
		
System.setProperty("Webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\selenium\\target\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile",Keys.ENTER);
	}

}
