package com.cssPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pageobjectmodule.LoginPage;

public class PracticeCSS {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting
		
		String filepath="./Config.propeties";
		FileInputStream fis = new FileInputStream(filepath);//bytecode 
		Properties pro = new Properties();
		pro.load(fis);
		
		//System.out.println(pro.getProperty("URL"));
		driver.navigate().to(pro.getProperty("URL"));// 1 URL
		driver.manage().window().maximize();
		LoginPage pf = new LoginPage(driver);
		JavascriptExecutor obj = (JavascriptExecutor) driver;
		obj.executeScript("arguments[0].style.border='3px solid red'", pf.getSignInBtn());
		pf.getSignInBtn().click();//
		WebDriverWait wait = new WebDriverWait(driver, 5);//best wait
		wait.until(ExpectedConditions.elementToBeClickable(pf.getemailInputBox()));
		obj.executeScript("arguments[0].style.border='3px solid red'", pf.getemailInputBox());
		pf.getemailInputBox().sendKeys(pro.getProperty("email"));// 2 email
		
		
		driver.quit();
	}

}
