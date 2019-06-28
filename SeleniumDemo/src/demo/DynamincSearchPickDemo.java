package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamincSearchPickDemo {
	public static void main(String[] args) throws InterruptedException {
		//not worked
		System.setProperty("webdriver.gecko.driver", "E:\\sujeet\\Selenium-Java\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();//maximize window
		driver.manage().deleteAllCookies();
		//if action is not done within 20 then skip. we may get exception
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//if action is not done within 10 then skip. we may get exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		System.out.println(driver.getTitle());
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("java");
		//searchBox.submit();
		WebElement sp=driver.findElement(By.xpath("//ul[@roll='listbox']//li/descendant::div[@class='sbl1 sbl1p']"));
		System.out.println(sp.getText());
	
		Thread.sleep(2000);
		driver.quit();
	}
}
