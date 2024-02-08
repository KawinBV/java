package selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class SectionB {
	public static void main(String[] args) throws Throwable {
		
		 System.setProperty("Webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\selenium\\target\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement elements2 = driver.findElement(By.id("email"));
		//WebElement elements = driver.findElement(By.xpath("//*[text()='EN']"));
		
		Actions a = new Actions(driver);
		//a.moveToElement(elements).perform();
		
		a.sendKeys(elements2, "KawinRaina").perform();
		a.doubleClick().perform();
		a.contextClick().perform();
		
		
		Robot r = new Robot();
		
		for(int i = 0; i<2; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File dce = new File("C:\\Users\\DELL\\eclipse-workspace\\selenium\\Takes\\image.png");
		FileUtils.copyFile(source,dce);
		
	}

}
