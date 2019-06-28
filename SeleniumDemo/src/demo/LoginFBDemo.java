package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginFBDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\sujeet\\Selenium-Java\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();//maximize window
		driver.manage().deleteAllCookies();
		//if action is not done within 20 then skip. we may get exception
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//if action is not done within 10 then skip. we may get exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		System.out.println(driver.getTitle());
		
		//by id
		WebElement email=driver.findElement(By.id("email"));
		//by name
		WebElement pass=driver.findElement(By.id("pass"));
		WebElement loginbtn=driver.findElement(By.id("u_0_a"));
		
		email.sendKeys("sujeets.sharma2395@gmail.com");
		Thread.sleep(2000);
		pass.sendKeys("s542sad3215");
		Thread.sleep(2000);
		//loginbtn.submit();
		//Thread.sleep(3000);
		

		
		/*driver.findElement(By.cssSelector("#email")).sendKeys("sujeet2.sharma@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.className("inputtext")).sendKeys("sujeet3.sharma@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sujeet4.sharma@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='inputtext']")).sendKeys("sujeet5.sharma@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'inputtext')]")).sendKeys("sujeet6.sharma@gmail.com");
		Thread.sleep(2000);
		
		//dynaminc name
		driver.findElement(By.xpath("//input[contains(@id,'emai')]")).sendKeys("sujeet7.sharma@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@id,'emai')]")).sendKeys("sujeet8.sharma@gmail.com");
		Thread.sleep(2000);*/
		//not worked
		//driver.findElement(By.xpath("//input[ends-with(@id,'mail')]")).sendKeys("sujeet9.sharma@gmail.com");
		//Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.linkText("Log In")).getText());
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.partialLinkText("Sign Up")).getText());
		Thread.sleep(3000);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Log In')]")).getText());
		
		/*WebElement month_dropdown=driver.findElement(By.id("month"));		
		Select months_dd= new Select(month_dropdown);

		months_dd.selectByIndex(3);
		Thread.sleep(2000);
		months_dd.selectByValue("10");
		Thread.sleep(2000);
		months_dd.selectByVisibleText("Aug");
		Thread.sleep(2000);
		
		List<WebElement> list=months_dd.getOptions();
		for(WebElement e: list) {
			System.out.println(e.getText());
		}*/
		driver.quit();
	}
}
