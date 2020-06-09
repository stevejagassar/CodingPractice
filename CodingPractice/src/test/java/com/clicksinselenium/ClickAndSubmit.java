package com.clicksinselenium;

import javax.swing.text.Highlighter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndSubmit {

	public static void main(String[] args) {
		// 

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting
		driver.manage().window().maximize();
		driver.get("https://www.costco.com/");
		WebElement membership = driver.findElement(By.xpath("(//*[text()='Membership'])[3]"));
		Actions a = new Actions(driver);
		a.moveToElement(membership).perform();
		//Highlighter.getcolor(driver, membership);//static
		//TakeAppScreenShot.captureScreenShot(driver, "Member Element");
	}

}
