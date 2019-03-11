package com.abc.ManagementObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login
{
WebDriver driver;
By email=By.id("email");
By pass=By.id("pass");
By login=By.id("send2");
public Login(WebDriver driver2) {
	// TODO Auto-generated constructor stub
}
public   void LoginPage(WebDriver driver)
{
	this.driver=driver;
}
public void typeEmail(String em)
{
	driver.findElement(email).sendKeys(em);
}
public void typePassword(String pwd)
{
	driver.findElement(pass).sendKeys(pwd);
}
public void clickOnLogin()
{
	driver.findElement(login).click();
}

}
