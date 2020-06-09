package com.pageFactoryPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BaseLogin {
	//How to Manually write a Return Method for Private Web Element

		@FindBy(xpath ="//*[id='log out']")
		private WebElement logout;
		
		@FindBy(xpath = "//*[class='search']")
		private WebElement search;
		
		
		public WebElement getlogout(){
			return logout;
			
//		public WebElement getsearch(){
//				return search;
//			
//		}
		}
}
