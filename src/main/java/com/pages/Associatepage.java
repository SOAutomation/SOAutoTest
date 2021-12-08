package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Associatepage {
 WebDriver driver;
 private By editbutton = By.xpath("(//div[text()=\"Doctor\"])[1]/..//span[@ng-if]");
 private By optoutcheckbox = By.id("optout");
 private By savebutton  = By.id("save");
 private By cancelbutton = By.id("cancel");
 private By optoutonlinetext = By.xpath("//label[text()='Opt out Online Scheduling']");
 private By optoutinformation_saved_text = By.xpath("//span[text()='Opt out information saved.']");
 private By No_text = By.xpath("//div[contains(text(),'No')]");
 private By Yes_confirmText = By.xpath("//div[@ng-if='!tmController.initValues.isEdit && tmController.serviceAvailableStatus === true']/..//div[contains(text(),'Yes')]");
 private By successnotificationpopup = By.xpath("//p[text()='Associate successfully saved.']");
 

}
