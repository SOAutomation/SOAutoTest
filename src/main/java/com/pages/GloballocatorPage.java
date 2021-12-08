package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GloballocatorPage {
	
	private WebDriver driver;
	
private By lasthospitaldistance = By.xpath("(//h5[@class='ng-binding'])[last()]");
	
	private By plusbutton = By.xpath("//span[contains(@class,'plus-icon')]");
	private By Noprovidertext = By.xpath("//p[(text()='No Providers']");
	private By opentime = By.xpath("//p[contains(text(),'Open today')]");
	private By phonenumber = By.xpath("(//p[@class='ng-binding'])[2]");
	private By globallocatorpagetitle = By.xpath("//div[text()='Banfield Pet Hospital® Locator']");
	private By globallocatorpagesubtitle = By.xpath("//div[@class='pw-global-location-sub-title']");
}
