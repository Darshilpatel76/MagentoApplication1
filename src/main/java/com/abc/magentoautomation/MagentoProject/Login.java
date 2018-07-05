package com.abc.magentoautomation.MagentoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement pwd;
	
	@FindBy(id="send2")
	WebElement login;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendEmail(String un)
	{
		email.sendKeys(un);
	}
	
	public void sendPassword(String pwd1)
	{
		pwd.sendKeys(pwd1);
	}
	
	public void clickOnLogin()
	{
		login.click();
	}
}
