package training1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//*[@id=\"input1\"]")).sendKeys("Sanjai");
		
		driver.findElement(By.xpath("//button[@id='btn1']")).click();
	}

}
