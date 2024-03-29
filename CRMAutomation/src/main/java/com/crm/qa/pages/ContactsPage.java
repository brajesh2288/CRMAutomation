package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.BasePage;

public class ContactsPage extends BasePage {
	
	public ContactsPage()
	{
		super();
	}
	
	
	public boolean verifyContactLabel()
	{
		return driver.findElement(By.xpath(prop.getProperty("contactlabel"))).isDisplayed();
	}
	
	public void selectContactsByName(String name){
		driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']"
				+ "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
	}
	
/*	public void createNewContact(String title, String ftName, String ltName, String comp){
		Select select = new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText(title);
		
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		company.sendKeys(comp);
			saveBtn.click();
		
	}
	*/
	

}
