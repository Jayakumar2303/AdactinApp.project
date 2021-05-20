package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	public static WebDriver driver;

	public SearchHotel(WebDriver driver) {
		this.driver = driver;
		// pageFactory
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocatoin() {
		return locatoin;
	}

	@FindBy(name = "location")
	private WebElement locatoin;

	@FindBy(id = "hotels")
	private WebElement hotels;

	public WebElement getHotels() {
		return hotels;
	}

	@FindBy(id = "room_type")
	private WebElement roomtype;

	public WebElement getRoomtype() {
		return roomtype;
	}

	@FindBy(id = "room_nos")
	private WebElement roomno;

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	@FindBy(name = "datepick_in")
	private WebElement checkin;

	public WebElement getCheckout() {
		return checkout;
	}

	@FindBy(name = "datepick_out")
	private WebElement checkout;

	@FindBy(name = "adult_room")
	private WebElement adult;

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	@FindBy(name = "child_room")
	private WebElement child;

	@FindBy(name = "Submit")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}

}
