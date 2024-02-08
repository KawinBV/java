package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SectionC {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\selenium\\target\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.name("alert"));
		element.click();
		Thread.sleep(5000);
		Alert simple = driver.switchTo().alert();
		simple.accept();
		
		
		WebElement element1 = driver.findElement(By.name("confirmation"));
		element1.click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		
		
		WebElement element2 = driver.findElement(By.name("prompt"));
		element2.click();
		Thread.sleep(5000);
		Alert prompt =driver.switchTo().alert();
		prompt.sendKeys("kawin");
		prompt.accept();
		
		String text = prompt.getText();
		System.out.println(text);

		
	}

}
