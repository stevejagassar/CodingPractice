package com.pageobjectmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver){//Create Constructor to handle the Null Pointer Exception error for Driver.
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//*[@class = 'login']")
	private WebElement getSignINBtn;
	
	public WebElement getSignInBtn() {
		return getSignINBtn;
	}
	
	@FindBy(xpath ="//*[@id = 'email']")
	private WebElement emailInputBox;
	
	public WebElement getemailInputBox() {
		return emailInputBox;
	}
	
	
	@FindBy(xpath ="//*[@name='passwd']")
	private WebElement passwordInputBox;
	
	public WebElement getpasswordInputBox() {
		return passwordInputBox;
	}

}
