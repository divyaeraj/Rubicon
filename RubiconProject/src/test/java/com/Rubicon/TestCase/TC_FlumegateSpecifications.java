package com.Rubicon.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Rubicon.PageObjects.FlumegateSpecificationsPage;

public class TC_FlumegateSpecifications extends BaseClass {

//Story 1: As a customer, I should be able to find the type of “Solar Panel” in a Rubicon FlumeGate by looking at the FlumeGate’s specification.
	
	@Test
	  public void SpecificationTab() {
		
		FlumegateSpecificationsPage fl=new FlumegateSpecificationsPage(driver);
		fl.clickonmenu();
		  
		  driver.findElement(By.xpath("//span[text()='Specifications']")).click();		  
		  WebElement text=driver.findElement(By.xpath("/html/body/section/div/div[2]/section/div[2]/div[5]/table/tbody/tr[27]/td[1]"));
		  
		  if(text.isDisplayed())
		  {
			  WebElement text2=driver.findElement(By.xpath("/html/body/section/div/div[2]/section/div[2]/div[5]/table/tbody/tr[27]/td[2]"));
			  System.out.println("type of Solar Panel is:"+ text2.getText());
		  }
	  }
}
