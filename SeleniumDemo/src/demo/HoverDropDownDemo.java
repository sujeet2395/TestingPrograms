package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HoverDropDownDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\sujeet\\Selenium-Java\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://freecrm.com");
		driver.manage().window().maximize();//maximize window
		driver.manage().deleteAllCookies();
		//if action is not done within 20 then skip. we may get exception
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//if action is not done within 10 then skip. we may get exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("//a[contains(text(),'CRM for Any Business')]")).click(); not work
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
	}
}
