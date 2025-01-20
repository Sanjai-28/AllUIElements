package all;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllinOne {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	}

	@Test
	public void enterName() throws InterruptedException
	{
		driver.findElement(By.id("name")).sendKeys("Sanjay");
		driver.findElement(By.id("email")).sendKeys("sanmnjhsjf@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("32354324");
		driver.findElement(By.id("textarea")).sendKeys("ghgasjbdjgsadgvfghsad");
		Thread.sleep(3000);
	}
	
	@Test
	public void gender() throws InterruptedException
	{
		driver.findElement(By.id("male")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("female")).click();
	}
	
	@Test
	public void daysCheckbox() throws InterruptedException
	{
		List<WebElement> checkbox=driver.findElements(By.xpath("//label[contains(text(),'day')]"));
		
		for(WebElement x:checkbox)
		{
			System.out.println(x);
			if(x.getText().equals("Saturday"))
			{
				x.click();
			}
		}
		Thread.sleep(3000);
	}
	
	@Test
	public void Countrydrop() throws InterruptedException
	{
		WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
		
		Select sc=new Select(country);
		sc.selectByVisibleText("France");
		Thread.sleep(2000);
		sc.selectByIndex(1);
		Thread.sleep(2000);
		sc.selectByValue("japan");
	}
	
	@Test
	public void DatePicker1() throws InterruptedException
	{
		driver.findElement(By.id("datepicker")).click();
		
		String expmonth="September";
		
		while(true)
		{
		WebElement month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		if(month.getText().contains(expmonth))
		{
			month.click();break;
		}
		else
		{
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		}
	}
	
	@Test
	public void uploadFile() throws InterruptedException
	{
		driver.findElement(By.id("singleFileInput")).sendKeys("S:\\resume\\Latest\\Sanjay.pdf");
		Thread.sleep(3000);
	}
	
	@Test
	public void table()
	{
		List<WebElement> tablerow=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		System.out.println(tablerow.size());
		List<WebElement> tablecolm=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));
		System.out.println(tablecolm.size());
	}
	
	@Test
	public void form() throws InterruptedException
	{
		driver.findElement(By.id("input1")).sendKeys("Sanjay");
		driver.findElement(By.id("btn1")).click();
		Thread.sleep(3000);
	}
	
	@Test
	public void HiddenElement()
	{
		driver.findElement(By.linkText("Hidden Elements & AJAX")).click();
		driver.findElement(By.id("loadContent")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
		WebElement ajax=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ajaxContent\"]/p")));
		System.out.println(ajax.getText());
	}
	
	@Test
	public void SimpleAlert() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	
	@Test
	public void ConfirmationAlert()
	{
		driver.findElement(By.id("confirmBtn")).click();
		Alert alert = driver.switchTo().alert();
		//alert.accept();
		alert.dismiss();
	}
	
	@Test
	public void PromptAlert() throws InterruptedException
	{
		driver.findElement(By.id("promptBtn")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("sanjay");
		Thread.sleep(3000);
		alert.accept();
	}
	
	@Test
	public void NewWindow() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		driver.findElement(By.xpath("//button[@id='PopUp']")).click();
		Thread.sleep(3000);
		Set<String> windows=driver.getWindowHandles();
		for(String x:windows)
		{
			System.out.println(driver.switchTo().window(x).getTitle());
			if(driver.switchTo().window(x).getTitle().contains("Selenium"))
			{
				String text=driver.findElement(By.xpath("//h4[@class='alert-heading text-center m-2']")).getText();
				System.out.println(text);
			}
		}
	}
	
	@Test
	public void MouseHover()
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//button[@class='dropbtn']")));
	}
	
	@Test
	public void DragAndDrop() throws InterruptedException
	{
		WebElement drag=driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions ac= new Actions(driver);
		ac.dragAndDrop(drag,drop);
		Thread.sleep(3000);
	}
	
	@Test
	public void ScreeShot() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"\\target\\"+"scr.jpg";
		FileHandler.copy(src, new File(path));
	}
	
	@Test
	public void Errorcode()
	{
		driver.findElement(By.linkText("Errorcode 400")).click();
		WebElement test=driver.findElement(By.xpath("//body"));
		System.out.println(test.getText());
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	

}
