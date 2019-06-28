package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateSetDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\sujeet\\Selenium-Java\\chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/sujeet/WebPage/postembed.html");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("date")).sendKeys("125-83-3242");
		Thread.sleep(2000);
		driver.quit();
	}
}
