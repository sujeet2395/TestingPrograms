package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefoxeDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\sujeet\\Selenium-Java\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();//maximize window
		driver.manage().deleteAllCookies();
		//if action is not done within 20 then skip. we may get exception
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//if action is not done within 10 then skip. we may get exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		//by name
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("selenium");
		searchBox.submit();
		//by id
		WebElement searchBox1=driver.findElement(By.id("q"));
		searchBox1.sendKeys("selenium");
		searchBox1.submit();
		Thread.sleep(3000);
		driver.quit();
	}
}
