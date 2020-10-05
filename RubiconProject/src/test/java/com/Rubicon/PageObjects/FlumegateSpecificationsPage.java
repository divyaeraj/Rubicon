package com.Rubicon.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlumegateSpecificationsPage {

	public WebDriver driver;
	
	
	public FlumegateSpecificationsPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void clickonmenu()
	{
		WebElement menuoption=driver.findElement(By.xpath("//span[text()='Control Gates & Valves']"));
		Actions act=new Actions(driver);
		act.moveToElement(menuoption).build().perform();
		WebElement menu2=driver.findElement(By.linkText("FlumeGate"));
		act.moveToElement(menu2).build().perform();
	}
}
