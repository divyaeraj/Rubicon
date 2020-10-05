package com.Rubicon.TestCase;

import com.Rubicon.PageObjects.BladeMeterBrochurePage;
import com.Rubicon.PageObjects.FarmConnectSoftwarePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_FarmConnectSoftware extends BaseClass {
	
//Story 3: As a customer, I should be able to search for “FarmConnect Software” and see details about “Crop Monitoring”.
	
	@Test
	public void SearchForCropMonitoring() {
		FarmConnectSoftwarePage farmc = new FarmConnectSoftwarePage(driver);
		farmc.searchFarmConnectSoftware();
		WebElement text2 = driver.findElement(By.xpath("/html/body/section/div/div[2]/section/div/div/h5[1]"));
		WebElement text3 = driver.findElement(By.xpath("/html/body/section/div/div[2]/section/div/div/p[4]"));
		if (text2.isDisplayed()) {
			System.out.println("Details about Crop Monitoring :"+"\n"+text3.getText());
		}

	}
}
