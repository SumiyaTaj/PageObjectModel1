package com.abc.ManagementObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomPage 
{
WebDriver driver;
By myacct=By.linkText("My Account");
public WelcomPage(WebDriver driver2) {
	// TODO Auto-generated constructor stub
}
public void welcomePage(WebDriver driver)
{
	this.driver=driver;
}
public void clickOnMyacct()
{
	driver.findElement(myacct).click();
}
}
