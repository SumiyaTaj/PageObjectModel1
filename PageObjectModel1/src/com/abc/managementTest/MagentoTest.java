package com.abc.managementTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.ManagementObject.Login;
import com.abc.ManagementObject.MainPage;
import com.abc.ManagementObject.WelcomPage;

public class MagentoTest {

	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.get("https://www.magento.com");
		 WelcomPage w=new WelcomPage(driver);
		 w.clickOnMyacct();
		 Login l=new Login(driver);
		 l.typeEmail("nikhildandge.abc@gmail.com");
		 l.typePassword("Welcome123");
		 l.clickOnLogin();
		 
		 MainPage m=new MainPage(driver);
		 m.clickOnLogOut();
		 Thread.sleep(3000);
		 driver.quit();
	}

}
