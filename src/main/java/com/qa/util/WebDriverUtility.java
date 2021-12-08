package com.qa.util;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	/*
	 * this method is used to switch to window para-driver par-partialwindowtitle
	 */
	public void switchToWindow(WebDriver driver, String PartialWindowTitle) {
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		while (it.hasNext()) {
			String windId = it.next();
			String title = driver.switchTo().window(windId).getTitle();
			if (title.contains(PartialWindowTitle)) {
				break;
			}
		}
	}

	/*
	 * method used to wait for 20sec till page get loaded para driver
	 */

	public void implicitwait10(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/*
	 * method used to wait for 5sec till page get loaded para driver
	 */

	public void pageload10(WebDriver driver) {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

	}

	public void implicitwait5(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	/*
	 * method used to wait for 30sec till page get loaded para driver
	 */

	public void implicitWait30(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	/*
	 * this method used to wait for 20sec till element is visible para-driver
	 * para-element
	 */

	public void waitforelementvisibility20(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	/*
	 * this method used for timeout till element is visible and send values to the
	 * element Para -driver, element, timeout, value
	 */

	public void sendkeys(WebDriver driver, WebElement element, int timeout, String value) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
		element.sendKeys(value);

	}

	/*
	 * this method is used to wait for element to be clicked para element
	 */

	public void waitandclick(WebElement element) throws Throwable {
		int count = 0;
		while (count < 40) {
			try {
				element.click();
				break;
			} catch (Throwable e) {
				Thread.sleep(5000);
				count++;

			}
		}
	}

	/*
	 * this method is used to wait till send the value para-element para-value
	 */

	public void waitandsendkey(WebElement element, String value) throws Throwable {
		int count = 0;
		while (count < 40) {
			try {
				element.sendKeys(value);
				;
				break;
			} catch (Throwable e) {
				Thread.sleep(5000);
				count++;

			}
		}
	}

	/*
	 * this methos is used to select the dropdown using visible text para-element
	 * para-option
	 */

	public void selectdrpdwnvisibletext(WebElement element, String option) {
		Select select = new Select(element);
		select.selectByVisibleText(option);
	}

	/*
	 * this method is used to select dropdown by values para-element para-option
	 */
	public void selctdropdownvalue(WebElement element, String option) {
		Select select = new Select(element);
		select.selectByValue(option);
	}

	/*
	 * this method i sused select dropdown by index number para-element par-int
	 * index
	 */
	public void selctdropdownvalue(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	/*
	 * this method is used to perfoem mouseover action para-driver para-element
	 */

	public void mouseHover(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	/*
	 * this method is used to accept the alert
	 */

	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	/*
	 * this method is used to dismiss alert
	 */
	public void cancelAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	/*
	 * method use to switch to frame
	 */
	public void switchToFrame(WebDriver driver, int index) {

		driver.switchTo().frame(index);
	}

	/*
	 * thread.sleep waiting
	 */

	public void waitTime35() throws Throwable {
		Thread.sleep(35000);
	}

	public void waitTime5() throws Throwable {
		Thread.sleep(5000);
	}

	public void waitTime10() throws Throwable {
		Thread.sleep(10000);
	}

	public void waitTime20() throws Throwable {
		Thread.sleep(20000);
	}

}