package com.weight.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.weight.base.Testbase;
import com.weight.pages.HomePage;
import com.weight.util.TestUtil;

public class HomePageTest extends Testbase  {
	HomePage homepage;
	
	public HomePageTest() {
		super();}
	
	
	@BeforeMethod
	public void setUp() {
		initialization1();
		homepage = new HomePage();}
	
	
	@Test(priority = 1)
	public void HomePageTitle() {
		
		String title = homepage.VerifyTitleofhomepage();
		Assert.assertEquals(title,"WW (Weight Watchers): Weight Loss & Wellness Help");}
	
	
	
	@Test(priority = 2)
	public void clickonfindstudio() {
	homepage.FindStudio();}
	
	
	
	public void StudiopageTitle() {
		String title1 = homepage.verifystudionearyoutitle();
		
	Assert.assertEquals(title1, "Find a Studio & Meeting Near You | WW USAexpected");}
	

	
		
		public  void clickonsearchbox() {homepage.SearchBox();
		}
	
	
	
	
	
	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
