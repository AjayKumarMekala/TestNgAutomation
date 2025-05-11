package Invocationcount;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import TestNGrelated.NewTest;

public class InvocationCount extends NewTest {
	@Parameters("URL")
	@Test(invocationCount=5,threadPoolSize=1)
	public void invocationcount(String URL) {
		    driver.get(URL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            System.out.println("My Name is:" + driver.findElement(By.xpath("//p[@id='user_value']")).getText());
		
	}
}
