package TestNGrelated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.*;
public class Dataprovider 
{WebDriver driver;
	
	@Test(dataProvider="logindataHrm",dataProviderClass=Dataprovidermethod.class)
   public void loginorangeHRM(String UserName,String Pwd)
   {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	WebElement input_UserName = driver.findElement(By.xpath("//input[@name='username']"));
	input_UserName.sendKeys(UserName);
	WebElement input_Pwd = driver.findElement(By.xpath("//input[@name='password']"));
	input_Pwd.sendKeys(Pwd);
	WebElement btn_Login=driver.findElement(By.xpath("//button[text()=' Login ']"));
	btn_Login.click();
	WebElement click_BrandLogo=driver.findElement(By.xpath("//a[@class='oxd-brand']"));
	boolean value=click_BrandLogo.isDisplayed();
	  SoftAssert S=new SoftAssert();
	  S.assertEquals(value, true);
	  
	 
	  S.assertAll();
   }
	@AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
	 
}
