$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "check The Functionality",
  "description": "",
  "id": "hotel-booking-in-adactin-application;check-the-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Enter The Applicatin",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"\u003cusername\u003e\" In Usernsme Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cpassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;check-the-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9,
      "id": "hotel-booking-in-adactin-application;check-the-functionality;;1"
    },
    {
      "cells": [
        "bala",
        "1234"
      ],
      "line": 10,
      "id": "hotel-booking-in-adactin-application;check-the-functionality;;2"
    },
    {
      "cells": [
        "Jayakumar",
        "Jaya@1998"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;check-the-functionality;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "check The Functionality",
  "description": "",
  "id": "hotel-booking-in-adactin-application;check-the-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Enter The Applicatin",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"bala\" In Usernsme Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"1234\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definatoin.user_Enter_The_Applicatin()"
});
formatter.result({
  "duration": 4440863200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bala",
      "offset": 16
    }
  ],
  "location": "Step_Definatoin.user_Enter_The_In_Usernsme_Field(String)"
});
formatter.result({
  "duration": 1733824800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 16
    }
  ],
  "location": "Step_Definatoin.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 197089000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definatoin.user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 4024654200,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "check The Functionality",
  "description": "",
  "id": "hotel-booking-in-adactin-application;check-the-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Enter The Applicatin",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"Jayakumar\" In Usernsme Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"Jaya@1998\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definatoin.user_Enter_The_Applicatin()"
});
formatter.result({
  "duration": 480647300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jayakumar",
      "offset": 16
    }
  ],
  "location": "Step_Definatoin.user_Enter_The_In_Usernsme_Field(String)"
});
formatter.result({
  "duration": 366087100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jaya@1998",
      "offset": 16
    }
  ],
  "location": "Step_Definatoin.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 214769200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definatoin.user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 4734711800,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "search Hotel In Thispage",
  "description": "",
  "id": "hotel-booking-in-adactin-application;search-hotel-in-thispage",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user Select The Location",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user Select The Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Select The Roomtype",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User Select The No Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Enter The Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Enter The Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Select The Adults Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Select The Children Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Click On The Search Button And It Navigate To Select Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definatoin.user_Select_The_Location()"
});
formatter.result({
  "duration": 1396089400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definatoin.user_Select_The_Hotel()"
});
formatter.result({
  "duration": 360647900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definatoin.user_Select_The_Roomtype()"
});
formatter.result({
  "duration": 325870000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definatoin.user_Select_The_No_Of_Rooms()"
});
formatter.result({
  "duration": 296627100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definatoin.user_Enter_The_Check_In_Date()"
});
formatter.result({
  "duration": 267713400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definatoin.user_Enter_The_Check_Out_Date()"
});
formatter.result({
  "duration": 196032400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definatoin.user_Select_The_Adults_Per_Room()"
});
formatter.result({
  "duration": 100403000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definatoin.user_Select_The_Children_Per_Room()"
});
formatter.result({
  "duration": 94188100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definatoin.user_Click_On_The_Search_Button_And_It_Navigate_To_Select_Hotel()"
});
formatter.result({
  "duration": 4117267700,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "select Hotel In Thispage",
  "description": "",
  "id": "hotel-booking-in-adactin-application;select-hotel-in-thispage",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "user Select The Selected Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user Click On The Continue Button And It Navigate To Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definatoin.user_Select_The_Selected_Hotel()"
});
formatter.result({
  "duration": 235994800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definatoin.user_Click_On_The_Continue_Button_And_It_Navigate_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 3917560300,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "book A Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;book-a-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "user Enter The Firstname In Firstname Field",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user Enter The Lastname In Lastname Field",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user Enter \tThe Billing Address In Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user Enter The Creaditcard Details",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Select The Creaditcard Type",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Select The Expiry Month",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Select The  Expiry Year",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Enter The Cvv Number",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Click On The Booknow Button And It Navigate To Book Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definatoin.user_Enter_The_Firstname_In_Firstname_Field()"
});
formatter.result({
  "duration": 393595900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definatoin.user_Enter_The_Lastname_In_Lastname_Field()"
});
formatter.result({
  "duration": 243995300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definatoin.user_Enter_The_Billing_Address_In_Address_Field()"
});
formatter.result({
  "duration": 319491400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definatoin.user_Enter_The_Creaditcard_Details()"
});
formatter.result({
  "duration": 278485900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definatoin.user_Select_The_Creaditcard_Type()"
});
formatter.result({
  "duration": 295576800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definatoin.user_Select_The_Expiry_Month()"
});
formatter.result({
  "duration": 373407500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definatoin.user_Select_The_Expiry_Year()"
});
formatter.result({
  "duration": 352276000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definatoin.user_Enter_The_Cvv_Number()"
});
formatter.result({
  "duration": 3178339500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definatoin.user_Click_On_The_Booknow_Button_And_It_Navigate_To_Book_Confirmation_Page()"
});
formatter.result({
  "duration": 464576100,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "confirm Booking",
  "description": "",
  "id": "hotel-booking-in-adactin-application;confirm-booking",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 39,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "user Click On The Myitinerary Button And It Navigate To Logout Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definatoin.user_Click_On_The_Myitinerary_Button_And_It_Navigate_To_Logout_Page()"
});
formatter.result({
  "duration": 1198182000,
  "status": "passed"
});
});