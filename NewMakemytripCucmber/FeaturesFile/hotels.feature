@hotels
Feature: hotel ticket booking
  I want to use this template ticket booking for buses

  @hotelsbooking
  Scenario: Title of your scenario
  
  
When Open Browser
When Open Application
Then i should see make my trip Flight booking page expTitle "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday"
#When i should move attention to iframe with "name" and value is "notification-frame-173058bbb"
#And click close button with "xpath" and value is "//*[@class='wewidgeticon we_close']"
When i click mobile alert with "xpath" and value is "//li[@data-cy='account']"
When i click on bus link with "xpath"and value is "(//span[normalize-space()='Hotels'])[1]"
When i click from city tab with "id" and value is "city"
When Enter Fromcity with "xpath" and value is "//input[@placeholder='Enter city/ Hotel/ Area/ Building']" and from city name is "mumbai"
Then i click city name with "xpath" and value is "(//li[@id='react-autowhatever-1-section-0-item-0'])[1]"
#checkin date for hotel
When i click calander date ie "10/march/2023"
#checkout date for hotel
When i click calander date ie "19/march/2023"
#select room
When i click with xpath "(//div[@class='gstSlct'])[1]" number is "02"
#select adult
When i click with xpath "(//div[@class='gstSlct'])[2]" number is "04"
#select children
When i click with xpath "(//div[@class='gstSlct'])[3]" number is "00"
#click apply button
Then click apply button with "xpath" and value is "//button[normalize-space()='Apply']"
When i click on the search button with "xpath" and value is "//button[@id='hsw_search_button']"
When i click on hotel banner with "xpath" and value is "(//img[@alt='hotelImg'])[1]"
Then change driver Focus to new window

