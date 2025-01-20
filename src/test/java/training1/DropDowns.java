package training1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement drop=driver.findElement(By.xpath("//select[@id='country']"));
		
		Select sc=new Select(drop);
		
		sc.selectByIndex(1);
		
		Thread.sleep(3000);
		
		sc.selectByValue("germany");
		
		Thread.sleep(3000);
		
		sc.selectByVisibleText("Brazil");
		
	}

}
