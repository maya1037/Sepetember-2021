package variousConcepts;



import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {
	WebDriver driver;
	
@Test
	public  void launchBrowser() {
	//Create object and set property
	    System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		 driver = new ChromeDriver();
	//	
		driver.get ("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		}
    public void  learnElementLocators() {
    	driver.findElement (By.name("First name")).sendKeys("selenium");
    	
    	//upload File if you have INPUT Tag
    	//Other than Input Tag use Robot class
    	//driver.findElement(By.className("input-file")).sendKeys("C:\\Users\\asim_\\Downloads\\Selenium-Session 1.pptx");
    	
    	//Link Text
    	//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
    	
    	//navigate back
    	//driver.navigate().back();
    	//partial Link Text
    	driver.findElement(By.partialLinkText("TF-API")).click();
    	driver.findElement(By.partialLinkText("Product")).click();
    	
    	//Css selector
    	driver.findElement(By.cssSelector("input#sex-0")).click();
    	driver.findElement(By.cssSelector("input[value='3']")).click();
    	driver.findElement(By.cssSelector("input[type='radio'][id='exp-3']")).click();
    	
    	//Xpath
    	
    	//1. Abosoulte Xpath
    	driver.findElement(By.xpath("html/bocy/div/div[2]/div[2]/form/div[10]/input")).sendKeys("Selenium is fun!");
    	
    	//2. relative xpath
    	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Selenium is fun!");
    	driver.findElement(By.xpath("//strong[contains(text(), 'Link Test; New Page')]")).click();
    	
    			
    	
    	
    	
    	
    	driver.close();
    	
    	
    	
    	
    	
    	
    	
    }

}
