package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public static WebDriver driver;

	public Loginpage(WebDriver driver) {
		this.driver = driver;
		// pageFactory
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(id = "password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(name = "login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

}
