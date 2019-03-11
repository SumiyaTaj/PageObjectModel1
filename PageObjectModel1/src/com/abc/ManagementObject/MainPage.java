package com.abc.ManagementObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage
{
WebDriver driver;
By log=By.linkText("LogOut");
public MainPage(WebDriver driver)
{
	this.driver=driver;
	
}
public void clickOnLogOut()
{
	driver.findElement(log).click();
}
}
