package practice_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo_Shopping_Website {
	
	@Test
	public void demoShop() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.theknowledgeacademy.com/");
//		boolean ourBiggest=driver.findElement(By.xpath("//span[text()='OUR BIGGEST']")).isEnabled();
//		System.out.println(ourBiggest);
		driver.findElement(By.cssSelector("a#profile-link"));
		
		
	}
	
}
