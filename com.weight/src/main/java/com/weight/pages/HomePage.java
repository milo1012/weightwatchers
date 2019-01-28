package com.weight.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.weight.base.Testbase;

public class HomePage extends Testbase {
	
	@FindBy (xpath = "//*[@height='40px']")
	WebElement title;
	@FindBy (xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]")
	WebElement findstudio;
	@FindBy (xpath ="/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ui-view[1]/ui-view[1]/div[1]/div[2]/form[1]/div[1]/input[1]")
	WebElement search;
	
	public HomePage () {
		PageFactory.initElements(driver, this);}
		
	
	
	public String VerifyTitleofhomepage() {
		
		return driver.getTitle();}

	
	
	public void FindStudio()
	{findstudio.click();}
	
	
	
	
	public String verifystudionearyoutitle() {
		
		return driver.getTitle()  ;}
	

	public void SearchBox() {
	 search.sendKeys("10011");
	}
	
	
	

	
	}

