package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GloballocatorPage {
	
	private WebDriver driver;
	 
    public By getLasthospitaldistance() {
		return lasthospitaldistance;
	}
	public void setLasthospitaldistance(By lasthospitaldistance) {
		this.lasthospitaldistance = lasthospitaldistance;
	}
	public By getPlusbutton() {
		return plusbutton;
	}
	public void setPlusbutton(By plusbutton) {
		this.plusbutton = plusbutton;
	}
	public By getNoprovidertext() {
		return Noprovidertext;
	}
	public void setNoprovidertext(By noprovidertext) {
		Noprovidertext = noprovidertext;
	}
	public By getOpentime() {
		return opentime;
	}
	public void setOpentime(By opentime) {
		this.opentime = opentime;
	}
	public By getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(By phonenumber) {
		this.phonenumber = phonenumber;
	}
	public By getGloballocatorpagetitle() {
		return globallocatorpagetitle;
	}
	public void setGloballocatorpagetitle(By globallocatorpagetitle) {
		this.globallocatorpagetitle = globallocatorpagetitle;
	}
	public By getGloballocatorpagesubtitle() {
		return globallocatorpagesubtitle;
	}
	public void setGloballocatorpagesubtitle(By globallocatorpagesubtitle) {
		this.globallocatorpagesubtitle = globallocatorpagesubtitle;
	}
	private By lasthospitaldistance = By.xpath("(//h5[@class='ng-binding'])[last()]");
	
	private By plusbutton = By.xpath("//span[contains(@class,'plus-icon')]");
	private By Noprovidertext = By.xpath("//p[(text()='No Providers']");
	private By opentime = By.xpath("//p[contains(text(),'Open today')]");
	private By phonenumber = By.xpath("(//p[@class='ng-binding'])[2]");
	private By globallocatorpagetitle = By.xpath("//div[text()='Banfield Pet Hospital® Locator']");
	private By globallocatorpagesubtitle = By.xpath("//div[@class='pw-global-location-sub-title']"); 
}
