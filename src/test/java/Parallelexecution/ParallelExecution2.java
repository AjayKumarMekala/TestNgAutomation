package Parallelexecution;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import TestNGrelated.NewTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecution2 extends NewTest
{
	@Parameters({ "userName", "pwd" ,"URL"})
	
	  @Test()
	  public void loginhrmqw(String userName,String pwd,String URL)
	  {
		System.out.println("Threadcount"+Thread.currentThread().getId());
		System.out.println("Execution2.1");
		    driver.get(URL);
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement input_UserName = driver.findElement(By.xpath("//input[contains(@class,'oxd-input') and @name=\"username\"]"));
			input_UserName.sendKeys(userName);
			WebElement input_Pwd = driver.findElement(By.xpath("//input[@name='password']"));
			input_Pwd.sendKeys(pwd);
			driver.findElement(By.xpath("//button[contains(@class,'oxd-button')]")).click();
			
			WebElement click_BrandLogo=driver.findElement(By.xpath("//a[@class='oxd-brand']"));
			boolean value=click_BrandLogo.isDisplayed();
			System.out.println(value);
			  SoftAssert S=new SoftAssert();
			  S.assertEquals(value, true);
			  
			 
			  S.assertAll();
		   }
	
	@Parameters({ "userName", "pwd" ,"URL"})
	  @Test()
	  public void loginhrmqw1(String userName,String pwd,String URL)
	  {
		System.out.println("Threadcount"+Thread.currentThread().getId());
		System.out.println("Execution2.1");
		    driver.get(URL);
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement input_UserName = driver.findElement(By.xpath("//input[@name='username']"));
			input_UserName.sendKeys(userName);
			WebElement input_Pwd = driver.findElement(By.xpath("//input[@name='password']"));
			input_Pwd.sendKeys(pwd);
			driver.findElement(By.xpath("//button[contains(@class,'oxd-button')]")).click();
			
			WebElement click_BrandLogo=driver.findElement(By.xpath("//a[@class='oxd-brand']"));
			boolean value=click_BrandLogo.isDisplayed();
			System.out.println(value);
			  SoftAssert S=new SoftAssert();
			  S.assertEquals(value, true);
			  
			 
			  S.assertAll();
		   }
  
		
  }



