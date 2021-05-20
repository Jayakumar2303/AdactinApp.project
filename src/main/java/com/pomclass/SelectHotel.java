package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	public static WebDriver driver;

	public SelectHotel(WebDriver driver) {
		this.driver = driver;
		// pageFactory
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/input[1]")
	private WebElement select;

	public WebElement getSelect() {
		return select;
	}

	@FindBy(name = "continue")
	private WebElement selectcontinue;

	public WebElement getSelectcontinue() {
		return selectcontinue;
	}
}
