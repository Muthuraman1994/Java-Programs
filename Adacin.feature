

Feature: Booking Hotel by Adacin Web Application.

Scenario Outline: Verify Login functionality for valid username and valid password.

Given Verify the user on Adacin Loginpage.
When  user enter valid "<username>" and "<password>"
And user click the login button
Then select Hotelpage display
When user enters "<location>","<hotelname>","<roomtype>","<roomNumberscount>","<checkinDate>","<checkoutDate>","<adultsInfo>" and "<childInfo>"
And user click on Search Button
Then user review the selected options
And user click continue Butn
When user enter the "<firstname>","<lastname>","<billingAddress>","<creditcardNo>","<CreditcardType>","<expiryDate>","<expiryYear>" and "<cvvNo>"
And user click bookNow button		
Then Hotel booking confirmation	
And Print the Order ID

Examples:

|username|password|location|hotelname|roomtype|roomNumberscount|checkinDate|checkoutDate|adultsInfo|childInfo|firstname|lastname|billingAddress|creditcardNo|CreditcardType|expiryDate|expiryYear|cvvNo|

|Muthuram0206|Muthu@99444|Melbourne|Hotel Sunshine|Double|1 - One|09/07/2022|10/07/2022|2 - Two|0 - None|Raj|Kumar|22,Nadiyamman koil street,Thanjavur-614601|4456789445678923|VISA|May|2022|137|
