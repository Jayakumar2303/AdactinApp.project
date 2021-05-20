package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	public static WebDriver driver;

	public BookHotel(WebDriver driver) {
		this.driver = driver;
		// pageFactory
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "first_name")
	private WebElement firstname;

	public WebElement getFirstname() {
		return firstname;
	}

	@FindBy(name = "last_name")
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	@FindBy(name = "address")
	private WebElement address;

	@FindBy(name = "cc_num")
	private WebElement cardno;

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	@FindBy(name = "cc_type")
	private WebElement cardtype;

	@FindBy(name = "cc_exp_month")
	private WebElement expirymonth;

	public WebElement getExpirymonth() {
		return expirymonth;
	}

	@FindBy(name = "cc_exp_year")
	private WebElement expiryyear;

	public WebElement getExpiryyear() {
		return expiryyear;
	}

	@FindBy(name = "cc_cvv")
	private WebElement cvvno;

	public WebElement getCvvno() {
		return cvvno;
	}

	@FindBy(name = "book_now")
	private WebElement booknow;

	public WebElement getBooknow() {
		return booknow;
	}

}
