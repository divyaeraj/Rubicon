package com.Rubicon.TestCase;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Rubicon.PageObjects.BladeMeterBrochurePage;

public class TC_BladeMeterBrochurePage extends BaseClass {
	
//Story 2: As a customer, I should be able to download the brochure for a Rubicon BladeMeter.
	
	@Test
	public void DownloadBrochure()
	{
		BladeMeterBrochurePage broucher=new BladeMeterBrochurePage(driver);
		broucher.DownloadBladeMeterBrochure();
		
		WebElement text5=driver.findElement(By.xpath("//a[text()='Download brochure']"));
		text5.click();
		String handle= driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();
		handles.remove(handle);
		String newhandle=handles.iterator().next();
		driver.switchTo().window(newhandle);
		System.out.println("Brochure Downloaded");
	}
}
