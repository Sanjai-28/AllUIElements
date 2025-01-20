package training1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		//Simple Alert
		/*driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		//Confirmation Alert
		driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();*/
		
		
		
		//prompt alert
		driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
		
		driver.switchTo().alert().sendKeys("sanjai");
		
		//Thread.sleep(3000);
		//alert.accept();
		
		
		

	}

}
