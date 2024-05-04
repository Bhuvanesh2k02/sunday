package practice_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Launch_Chrome_Browser {

	@Test
	public void webdriver() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("bhuvanesh2k02@gmail.com");
		Thread.sleep(1000);
		email.clear();
		Thread.sleep(1000);
		email.sendKeys("email.com");
		Thread.sleep(2000);
		driver.close();
		
	}
	@Test
	public void password() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("8754313835");
		Thread.sleep(2000);
		WebElement forpassword = driver.findElement(By.linkText("Forgotten password?"));
		forpassword.click();
		Thread.sleep(2000);
		driver.close();	
	}
	@Test
	public void forgotPassword() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement forpassword = driver.findElement(By.linkText("Forgotten password?"));
		forpassword.click();
		Thread.sleep(2000);
		WebElement enterEamil = driver.findElement(By.name("email"));
		enterEamil.sendKeys("bhuvanesh2k02@gmail.com");
		Thread.sleep(3000);
		
		driver.close();	

		

	}
}
