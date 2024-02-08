package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SectionD {
	
	public static void main(String[]args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\selenium\\target\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");
		WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
		element.sendKeys("java");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//*[text()='Selenium']")).click();
		driver.switchTo().defaultContent();
		}

}
