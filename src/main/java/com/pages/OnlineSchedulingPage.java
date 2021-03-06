package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnlineSchedulingPage {
	
	private WebDriver driver;
	
	//Doctor Day Max Capacity
	private By administrationTitle = By.xpath("//h3[@class='ng-binding']");
	private By onlineScheduling = By.linkText("Online Scheduling");
	private By onlineSchedulingTitle = By.xpath("//legend[text()='Online Scheduling']");
	private By maxCapacityTitle = By.xpath("//label[@for='in-room-comps-limit']");
	private By capacityLink = By.xpath("(//a[@class='ng-binding'])[2]");
	private By capacityField = By.id("in-room-comps-limit");
	private By saveButton = By.id("//button[text()='Save']");
	private By cancelButton = By.id("//button[text()='Save']");
	private By minCapacityWarningMessage = By.xpath("//span[contains(text(), 'Minimum value is 5.')]");
	private By maxCapacityWarningMessage = By.xpath("//span[contains(text(), 'Maximum value is 99.')]");
	
	
	//Delay Time
	private By delaytimeTitle = By.xpath("//label[@for='delaytime']");
	private By delaytimeSubtitle = By.xpath("//label[@for='delaytime']/following-sibling::p");
	private By delayOption = By.xpath("//label[@for='delaytime']/following-sibling::div[@class='ng-scope']//a");
	private By noDelay = By.xpath("//li[contains(text(),'No delay')]");
	private By delay30min = By.xpath("//li[contains(text(),'30 mins delay')]");
	private By delay60min = By.xpath("//li[contains(text(),'1 hour delay')]");
	private By delay90min = By.xpath("//li[contains(text(),'90 mins delay')]");
	private By delay120min = By.xpath("//li[contains(text(),'2 hours delay')]");
	
	
	public WebDriver getDriver() {
		return driver;
	}
	public By getAdministrationTitle() {
		return administrationTitle;
	}
	public By getOnlineScheduling() {
		return onlineScheduling;
	}
	public By getMaxCapacityTitle() {
		return maxCapacityTitle;
	}
	public By getCapacityLink() {
		return capacityLink;
	}
	public By getCapacityField() {
		return capacityField;
	}
	public By getSaveButton() {
		return saveButton;
	}
	public By getCancelButton() {
		return cancelButton;
	}
	public By getMinCapacityWarningMessage() {
		return minCapacityWarningMessage;
	}
	public By getMaxCapacityWarningMessage() {
		return maxCapacityWarningMessage;
	}
	public By getDelaytimeTitle() {
		return delaytimeTitle;
	}
	public By getDelaytimeSubtitle() {
		return delaytimeSubtitle;
	}
	public By getDelayOption() {
		return delayOption;
	}
	public By getNoDelay() {
		return noDelay;
	}
	public By getDelay30min() {
		return delay30min;
	}
	public By getDelay60min() {
		return delay60min;
	}
	public By getDelay90min() {
		return delay90min;
	}
	public By getDelay120min() {
		return delay120min;
	}
	public By getOnlineSchedulingTitle() {
		return onlineSchedulingTitle;
	}
	
	
}
