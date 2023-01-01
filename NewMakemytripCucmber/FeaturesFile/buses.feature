
@buses
Feature: BUS ticket booking
  I want to use this template ticket booking for buses

  @busticketbooking
  Scenario: Title of your scenario
  
  
When Open Browser
When Open Application
Then i should see make my trip Flight booking page expTitle "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday"
#When i should move attention to iframe with "name" and value is "notification-frame-173058bbb"
#And click close button with "xpath" and value is "//*[@class='wewidgeticon we_close']"
When i click mobile alert with "xpath" and value is "//li[@data-cy='account']"
When i click on bus link with "xpath"and value is "//span[normalize-space()='Buses']"
When Wait For searchbutton with "xpath" and value is "//button[@id='search_button']"
#When i click mobile alert with "xpath" and value is "//li[@data-cy='account']"
When i click from city tab with "id" and value is "fromCity"
When Enter Fromcity with "xpath" and value is "//input[@placeholder='From']" and from city name is "Hyd"
Then i click city name with "xpath" and value is "(//li[@id='react-autowhatever-1-section-0-item-0'])[1]"
#When click on To city with "id" and value is "toCity"
When Enter Tocity with "xpath" and value is "//input[@placeholder='To']" and To city name is "vtz"
Then i click city name with "xpath" and value is "(//li[@id='react-autowhatever-1-section-0-item-0'])[1]"
When Enter date in datecalendar is : "25/january/2023"
When i click on the search button with "xpath" and value is "//button[@class='primaryBtn font24 latoBold widgetSearchBtn']"
When i click primo alert with "xpath" and value is "//img[@class='primoCloseIcon']"
When i click select seat with "xpath" and value is "//a[@class='sc-jKJlTe bPClQZ']"
When i choose seats with "xpath" and value is "//div[@class='sc-jWBwVP jvaXlp']//div[1]//div[2]//img[1]"
When i click book seats with "xpath" and value is "//div[@class='cta-book-seats font16 capText makeFlex hrtlCenter vrtlCenter active']"
When i enter fname with "id" and value is "fname" value is "ramesh"
When i enter age with"id" and vlaue is "age" with vlaue is "26"
When i use mouse action move gender with "xpath" and value is "//div[@class='GenderDropDownContainer']" and select male with value is "//li[normalize-space()='Male']"
Then i give busemail id with "xpath" and value is "//input[@id='contactEmail']" and email address is "amar@gmail.com"
Then i give bus mobile no with "xpath" and value is "//input[@id='mobileNumber']" and mobileno is "9878976523"
When i click on yes secure my trip with "xpath" and value is "(//span[@class='sc-kPVwWT hCyTgB'])[2]"
Then i click continue to book now with "xpath" and value is "//a[@class='paymentBtn whiteText latoBold font16 capText']"


