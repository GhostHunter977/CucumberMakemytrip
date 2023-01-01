@train
Feature: train ticket booking
  I want to use this template ticket booking for buses

  @trainticketbooking
  Scenario: I validate train module
  
  
When Open Browser
When Open Application
Then i should see make my trip Flight booking page expTitle "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday"
#When i should move attention to iframe with "name" and value is "notification-frame-173058bbb"
#And click close button with "xpath" and value is "//*[@class='wewidgeticon we_close']"
When i click mobile alert with "xpath" and value is "//li[@data-cy='account']"
When i click on bus link with "xpath"and value is "(//span[normalize-space()='Trains'])[1]"
When i click from city tab with "id" and value is "fromCity"
When Enter Fromcity with "xpath" and value is "//input[@placeholder='From']" and from city name is "Hyd"
Then i click city name with "xpath" and value is "(//li[@id='react-autowhatever-1-section-0-item-0'])[1]"
When Enter Tocity with "xpath" and value is "//input[@placeholder='To']" and To city name is "bam"
Then i click city name with "xpath" and value is "(//li[@id='react-autowhatever-1-section-0-item-0'])[1]"
When Enter date in datecalendar is : "25/march/2023"
When i Enter Train ticket Class "All Class"
When i click on the search button with "xpath" and value is "//a[@class='primaryBtn font24 latoBold widgetSearchBtn']"
When i select select class with "xpath" and value is "(//div[contains(@class,'card')])[1]"
When i click cancelcharge with "xpath" and value is "(//*[@for='r1'])[2]"
When i click add travells with "xpath" and value is "//span[@class='bold font14 capText']"
When i enter fname with "id" and value is "name" value is "Amarjit choudhury"
When i enter age with"id" and vlaue is "age" with vlaue is "26"
Then i click gender on train with "xpath" and value is "//span[normalize-space()='Select']"
Then i click gender as male with "xpath" and value is "//span[normalize-space()='Male']"
Then i click add button with "xpath" and value is "//button[text()='Add']"
When i click irctc username with "id" and value is "irctcUserName"
When i enter irctc username with "xpath" and value is "//input[@id='IRCTCUserName']" and send data is "amarjit02"
Then i click submit button with "xpath" and value is "//span[@class='font12 latoBlack capText']"
Then i give busemail id with "xpath" and value is "//input[@id='contactEmail']" and email address is "amar@gmail.com"
Then i give bus mobile no with "xpath" and value is "//input[@id='mobileNumber']" and mobileno is "9878976523"
Then i click continue to book now with "xpath" and value is "//span[normalize-space()='Pay & Book Now']"