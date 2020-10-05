package com.Rubicon.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BladeMeterBrochurePage {

	public WebDriver driver;
	
	public BladeMeterBrochurePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void DownloadBladeMeterBrochure()
	{
		WebElement menuoption=driver.findElement(By.xpath("//span[text()='Flow Meters']"));
		Actions act=new Actions(driver);
		act.moveToElement(menuoption).build().perform();
		WebElement menu2=driver.findElement(By.xpath("/html/body/nav/ul/li[4]/div[1]/div[1]/div/ul/li[3]/a"));
		act.moveToElement(menu2).build().perform();
	}
	
}
