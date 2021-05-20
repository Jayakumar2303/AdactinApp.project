package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	public static WebDriver driver;

	public Logout(WebDriver driver) {
		this.driver = driver;
		// pageFactory
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='button'][2]")
	private WebElement myltinerary;

	public WebElement getMyltinerary() {
		return myltinerary;
	}

	@FindBy(xpath= "//a[text()='Logout']")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}

}
