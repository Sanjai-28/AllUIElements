package training1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		driver.wait(5);
		
		String originaltab=driver.getWindowHandle();
		
		ArrayList<String> list=new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(list);
		
		

	}

}
