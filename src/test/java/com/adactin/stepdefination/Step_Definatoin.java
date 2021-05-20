package com.adactin.stepdefination;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.File_Reader_Manager;
import com.adactin.helper.Page_Object_Manager;
import com.baseclass.Base_Class;
import com.pomclass.BookHotel;
import com.pomclass.Loginpage;
import com.pomclass.Logout;
import com.pomclass.SearchHotel;
import com.pomclass.SelectHotel;
import com.testrunner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definatoin extends Base_Class {
	public static WebDriver driver = Test_Runner.driver;
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("^user Enter The Applicatin$")
	public void user_Enter_The_Applicatin() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().geturl();
		get(url);
	}

	@When("^user Enter The \"([^\"]*)\" In Usernsme Field$")
	public void user_Enter_The_In_Usernsme_Field(String username) throws Throwable {
		inputkeys(pom.getinstacelogin().getUsername(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
		inputkeys(pom.getinstacelogin().getPassword(), password);
	}

	@Then("^user Click On The Login Button And It Navigate To Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page() throws Throwable {
		clickonelement(pom.getinstacelogin().getLogin());
		Thread.sleep(3000);
	}

	@When("^user Select The Location$")
	public void user_Select_The_Location() throws Throwable {
		dropdown(pom.getinstanceSearchHotel().getLocatoin(), "index", "1");
	}

	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		dropdown(pom.getinstanceSearchHotel().getHotels(), "index", "2");
	}

	@When("^user Select The Roomtype$")
	public void user_Select_The_Roomtype() throws Throwable {
		dropdown(pom.getinstanceSearchHotel().getRoomtype(), "index", "2");
	}

	@When("^User Select The No Of Rooms$")
	public void user_Select_The_No_Of_Rooms() throws Throwable {
		dropdown(pom.getinstanceSearchHotel().getRoomno(), "index", "1");
	}

	@When("^user Enter The Check In Date$")
	public void user_Enter_The_Check_In_Date() throws Throwable {
		inputkeys(pom.getinstanceSearchHotel().getCheckin(), "12/05/2021");
	}

	@When("^user Enter The Check Out Date$")
	public void user_Enter_The_Check_Out_Date() throws Throwable {
		inputkeys(pom.getinstanceSearchHotel().getCheckout(), "13/05/2021");
	}

	@When("^user Select The Adults Per Room$")
	public void user_Select_The_Adults_Per_Room() throws Throwable {
		dropdown(pom.getinstanceSearchHotel().getAdult(), "input", "1");
	}

	@When("^user Select The Children Per Room$")
	public void user_Select_The_Children_Per_Room() throws Throwable {
		dropdown(pom.getinstanceSearchHotel().getChild(), "input", "1");
	}

	@Then("^user Click On The Search Button And It Navigate To Select Hotel$")
	public void user_Click_On_The_Search_Button_And_It_Navigate_To_Select_Hotel() throws Throwable {
		clickonelement(pom.getinstanceSearchHotel().getSearch());
		Thread.sleep(3000);
	}

	@When("^user Select The Selected Hotel$")
	public void user_Select_The_Selected_Hotel() throws Throwable {

		clickonelement(pom.getinstanceSelectHotel().getSelect());
	}

	@Then("^user Click On The Continue Button And It Navigate To Book A Hotel Page$")
	public void user_Click_On_The_Continue_Button_And_It_Navigate_To_Book_A_Hotel_Page() throws Throwable {
		clickonelement(pom.getinstanceSelectHotel().getSelectcontinue());
		Thread.sleep(3000);
	}

	@When("^user Enter The Firstname In Firstname Field$")
	public void user_Enter_The_Firstname_In_Firstname_Field() throws Throwable {
		String firstname = File_Reader_Manager.getInstance().getInstanceCR().getfirstname();
		inputkeys(pom.getinstanceBookHotel().getFirstname(), firstname);
	}

	@When("^user Enter The Lastname In Lastname Field$")
	public void user_Enter_The_Lastname_In_Lastname_Field() throws Throwable {
		String lastname = File_Reader_Manager.getInstance().getInstanceCR().getlastname();
		inputkeys(pom.getinstanceBookHotel().getLastname(), lastname);
	}

	@When("^user Enter 	The Billing Address In Address Field$")
	public void user_Enter_The_Billing_Address_In_Address_Field() throws Throwable {
		String address = File_Reader_Manager.getInstance().getInstanceCR().getaddress();
		inputkeys(pom.getinstanceBookHotel().getAddress(), address);
	}

	@When("^user Enter The Creaditcard Details$")
	public void user_Enter_The_Creaditcard_Details() throws Throwable {
		String cardno = File_Reader_Manager.getInstance().getInstanceCR().getcardno();
		inputkeys(pom.getinstanceBookHotel().getCardno(), cardno);
	}

	@When("^user Select The Creaditcard Type$")
	public void user_Select_The_Creaditcard_Type() throws Throwable {
		dropdown(pom.getinstanceBookHotel().getCardtype(), "index", "1");
	}

	@When("^user Select The Expiry Month$")
	public void user_Select_The_Expiry_Month() throws Throwable {
		dropdown(pom.getinstanceBookHotel().getExpirymonth(), "index", "6");
	}

	@When("^user Select The  Expiry Year$")
	public void user_Select_The_Expiry_Year() throws Throwable {
		dropdown(pom.getinstanceBookHotel().getExpiryyear(), "index", "5");
	}

	@When("^user Enter The Cvv Number$")
	public void user_Enter_The_Cvv_Number() throws Throwable {
		String cvvno = File_Reader_Manager.getInstance().getInstanceCR().getcvvno();
		inputkeys(pom.getinstanceBookHotel().getCvvno(), cvvno);
		Thread.sleep(3000);
	}

	@Then("^user Click On The Booknow Button And It Navigate To Book Confirmation Page$")
	public void user_Click_On_The_Booknow_Button_And_It_Navigate_To_Book_Confirmation_Page() throws Throwable {
		clickonelement(pom.getinstanceBookHotel().getBooknow());
		explicitwait(30, pom.getinstanceBookHotel().getBooknow());
	}

	@Then("^user Click On The Myitinerary Button And It Navigate To Logout Page$")
	public void user_Click_On_The_Myitinerary_Button_And_It_Navigate_To_Logout_Page() throws Throwable {
		clickonelement(pom.getinstancelogout().getMyltinerary());

	}

	@Then("^user Click On The Logout Button$")
	public void user_Click_On_The_Logout_Button() throws Throwable {
		clickonelement(pom.getinstancelogout().getLogout());

	}

}
