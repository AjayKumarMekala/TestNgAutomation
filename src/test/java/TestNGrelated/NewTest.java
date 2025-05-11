package TestNGrelated;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
@Test(groups="all")
public class NewTest {
//  @Test(dataProvider = "dp")
//  public void f(Integer n, String s) {
//	  
//  }
	public WebDriver driver;

//	@BeforeMethod
//	public void beforeMethod() {
//		System.out.println("@@@  Test Method started @@@");
//	}
//    
//	@AfterMethod
//	public void afterMethod() {
//		System.out.println("@@@  Test Method Completed @@@");
//	}

//  @DataProvider
//  public Object[][] dp() {
//    return new Object[][] {
//      new Object[] { 1, "a" },
//      new Object[] { 2, "b" },
//    };
//  }
//  @BeforeClass
//  public void beforeClass() {
//  }
//
//  @AfterClass
//  public void afterClass() {
//  }
	@Parameters("browserName")
	@BeforeMethod(groups="smoke")
	public void browserSetUp(@Optional("edge") String browserName) {
		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("======Opened in Chromedriver=======");
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			System.out.println("======Opened in Edgedriver=======");
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println("======Opened in Firefoxdriver=======");
			break;
		default:
			System.err.println("Browser not supported");

		}
	}

//	@AfterTest(groups="smoke")
//	public void browserTearDown() {
//		if (driver != null)
//			driver.quit();
//	}
	@AfterMethod
	public void browserTearDown() {
		if (driver != null)
			driver.quit();
	}

//  @BeforeSuite
//  public void beforeSuite() {
//  }
//
//  @AfterSuite
//  public void afterSuite() {
//  }
	
	
//	@Parameters({ "userName", "pwd" ,"URL"})
//	@Test(groups= {"smoke"})
//	public void login(String userName, String pwd,String URL)  {
//	
//		driver.get(URL);
//		driver.manage().window().maximize();																										
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		System.out.println("--->Login successfully");
//        WebElement input_UserName = driver.findElement(By.xpath("//input[@name='username']"));
//		input_UserName.sendKeys(userName);
//		WebElement input_Pwd = driver.findElement(By.xpath("//input[@name='password']"));
//		input_Pwd.sendKeys(pwd);
//		WebElement btn_Login=driver.findElement(By.xpath("//button[contains(@class,'oxd-button')]"));
//		btn_Login.click();
//	}
//   
//	@Test(groups= {"sanity"},dependsOnMethods= {"login"})
//	public void Dashboard() {
//		WebElement click_BrandLogo=driver.findElement(By.xpath("//a[@class='oxd-brand']"));
//		click_BrandLogo.click();
//	}
//
//	@Test(dependsOnMethods= {"Dashboard"})
//	public void ticketDownload() {
//		System.out.println("--->Ticket download has been completed");
//	}
//
//	@Test(dependsOnMethods= {"ticketDownload"})
//	public void logOut() {
//		System.out.println("--->logout successfully");
//	}

}
