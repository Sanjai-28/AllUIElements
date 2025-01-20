package training1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicButton {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//button[@name='start']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@name='stop']")).click();

	}

}
