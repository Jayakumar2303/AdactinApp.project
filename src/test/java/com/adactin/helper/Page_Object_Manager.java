package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pomclass.BookHotel;
import com.pomclass.Loginpage;
import com.pomclass.Logout;
import com.pomclass.SearchHotel;
import com.pomclass.SelectHotel;

public class Page_Object_Manager {
	public WebDriver driver;
	private Loginpage login;
	private BookHotel BH;
	private SearchHotel SH;
	private SelectHotel s;
	private Logout LO;

	public Page_Object_Manager(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public Loginpage getinstacelogin() {
		login = new Loginpage(driver);
		return login;
	}

	public Logout getinstancelogout() {
		LO = new Logout(driver);
		return LO;
	}

	public BookHotel getinstanceBookHotel() {
		BH = new BookHotel(driver);
		return BH;
	}

	public SelectHotel getinstanceSelectHotel() {
		s = new SelectHotel(driver);
		return s;
	}

	public SearchHotel getinstanceSearchHotel() {
		SH = new SearchHotel(driver);
		return SH;
	}

}
