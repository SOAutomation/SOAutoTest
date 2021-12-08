package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	private By visitManagement = By.xpath("//div[@class='pw-visit-management-header-title']");
	
	private By adminSettings = By.xpath("//span[text()='Admin']");
	private By hospitalInfo = By.xpath("//span[text()='Hospital Info']");
	private By associates = By.xpath("//span[text()='Associates']");
	private By usernameField = By.xpath("//input[@id='user-name']");
	private By passwordField = By.xpath("//input[@id='password']");
	private By signButton = By.xpath("//button[@class='btn btn-primary btn-block']");
	
	private By mapIcon = By.xpath("//a[@ui-sref='globalLocation']");
}
