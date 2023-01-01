@tag
Feature: Flight Booking
  I want to use this template for validate flight Ticket Booking
@Flightbooking

Scenario: Check Flight booking with valid data


When Open Browser
When Open Application
Then i should see make my trip Flight booking page expTitle "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday"
#When i should move attention to iframe with "name" and value is "notification-frame-173058bbb"
#And click close button with "xpath" and value is "//*[@class='wewidgeticon we_close']"
When Wait For searchbutton with "xpath" and value is "//a[contains(text(),'Search')]"
When i click mobile alert with "xpath" and value is "//div[@class='makeFlex column flexOne whiteText latoBold']"
When i click from city tab with "id" and value is "fromCity"
When Enter Fromcity with "xpath" and value is "//input[@placeholder='From']" and from city name is "Hyd"
Then i click city name with "xpath" and value is "(//li[@id='react-autowhatever-1-section-0-item-0'])[1]"
When Enter date in calendar is : "25/march/2023"
When click on To city with "id" and value is "toCity"
When Enter Tocity with "xpath" and value is "//input[@placeholder='To']" and To city name is "vtz"
Then i click city name with "xpath" and value is "(//li[@id='react-autowhatever-1-section-0-item-0'])[1]"
When click on Travellers and class "xpath" and value is "//div[@data-cy='flightTraveller']"
When click on Adult passenger no is "1"
When click on Children no is "0"
When click on Infants passengar no is "0"
When click on Choose travel Class passenger with Travel class no is "1"
Then click apply button with "xpath" and value is "//button[@data-cy='travellerApplyBtn']"
When i click on the search button with "xpath" and value is "//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']"
When i click okay, got it alert with "xpath" and value is "//button[normalize-space()='OKAY, GOT IT!']"
When i click on view prices with "xpath" and value is "(//span[@class='appendRight8'][normalize-space()='View Prices'])[1]"
When i click on booknow button with "xpath" and value is "(//button[text()='Book Now'])[1]"
Then change driver Focus to new window

When i click add adult with "xpath"and value is "//button[normalize-space()='+ ADD NEW ADULT']"
When i enter fname with "xpath" and value is "//input[@placeholder='First & Middle Name']" value is "ramesh"
When i enter lname with "xpath" and value is "//input[@placeholder='Last Name']" value is "josi"
Then i Click gender with "xpath" and value is "//div[contains(@class,'selectTab')]//label[1]"
Then i give mobile no with "xpath" and value is "//input[@placeholder='Mobile No']" and mobileno is "9878976523"
Then i give email id with "xpath" and value is "//input[@placeholder='Email']" and email address is "amar@gmail.com"
#Then i click continue button with "xpath" and value is "(//button[normalize-space()='Continue'])[1]"
Then i click continue button with "xpath" and value is "//button[text()='Continue']"
When i click confirm button with "xpath" and value is "//button[text()='CONFIRM']"
When i click yes please button with "xpath" and value is "//button[text()='Yes, Please']"
When i click continue button with "xpath" and value is "//button[text()='Continue']"
#When i click add meal with "xpath" and value is "//button[text()='Add']"
When i click continue button with "xpath" and value is "//button[text()='Continue']"
When i click continue anyway button with "xpath" and value is "//button[text()='CONTINUE ANYWAY']"
When i click proced to pay button with "xpath" and value is "//button[text()='Proceed to pay']"




