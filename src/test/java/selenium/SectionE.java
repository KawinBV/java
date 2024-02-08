package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SectionE {
	
	public static void main (String[]args) throws Throwable {
		
System.setProperty("Webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\selenium\\target\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//select[@id='first']"));
		Select s = new Select(element);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByValue("Microsoft");
		Thread.sleep(3000);
		s.selectByVisibleText("Google");
		boolean maltiple = s.isMultiple();
		System.out.println(maltiple);
		
		//driver.quit();
		
		WebElement element1 = driver.findElement(By.xpath("//select[@id='second']"));
		Select s1 = new Select(element1);
		s1.selectByIndex(1);
		Thread.sleep(3000);
		s1.selectByIndex(2);
		Thread.sleep(3000);
		s1.selectByIndex(3);
		s1.deselectByIndex(2);
		
	}

}
