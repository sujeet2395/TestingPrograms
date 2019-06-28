package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupWindowDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\sujeet\\Selenium-Java\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.popuptest.com");
		driver.manage().window().maximize();//maximize window
		driver.manage().deleteAllCookies();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.linkText("Chromeless")).click();
		System.out.println(driver.getTitle());
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parent=it.next();
		String child=it.next();
		System.out.println(parent);
		driver.switchTo().window(child);
		System.out.println(child);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parent);
		System.out.println(parent);
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
}
