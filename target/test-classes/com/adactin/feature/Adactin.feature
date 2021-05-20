Feature: Hotel Booking In Adactin Application
@smokeTest
Scenario Outline: check The Functionality
Given user Enter The Applicatin
When user Enter The "<username>" In Usernsme Field
And user Enter The "<password>" In Password Field
Then user Click On The Login Button And It Navigate To Search Hotel Page
Examples:
    |username|password|
    |bala|1234|
    |Jayakumar|Jaya@1998|
    
@sanityTest
Scenario: search Hotel In Thispage
When user Select The Location
And user Select The Hotel
And user Select The Roomtype
And User Select The No Of Rooms
And user Enter The Check In Date
And user Enter The Check Out Date
And user Select The Adults Per Room
And user Select The Children Per Room
Then user Click On The Search Button And It Navigate To Select Hotel
@sanityTest
Scenario: select Hotel In Thispage
When user Select The Selected Hotel
Then user Click On The Continue Button And It Navigate To Book A Hotel Page
@sanityTest
Scenario: book A Hotel
When user Enter The Firstname In Firstname Field
And user Enter The Lastname In Lastname Field
And user Enter 	The Billing Address In Address Field
And user Enter The Creaditcard Details
And user Select The Creaditcard Type
And user Select The Expiry Month
And user Select The  Expiry Year
And user Enter The Cvv Number
Then user Click On The Booknow Button And It Navigate To Book Confirmation Page
@sanityTest
Scenario: confirm Booking
Then user Click On The Myitinerary Button And It Navigate To Logout Page
@RegressionTest
Scenario: logout The Account
Then user Click On The Logout Button 
