package com.Rubicon.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FarmConnectSoftwarePage {

public WebDriver driver;
	
	
	public FarmConnectSoftwarePage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void searchFarmConnectSoftware()
	{
		WebElement menuoption=driver.findElement(By.xpath("//span[text()='Software']"));
		Actions act=new Actions(driver);
		act.moveToElement(menuoption).build().perform();
		WebElement menu2=driver.findElement(By.linkText("FarmConnect-Software"));
		act.moveToElement(menu2).build().perform();
	}
	
}
