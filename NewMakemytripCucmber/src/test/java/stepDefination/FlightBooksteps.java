package stepDefination;

import java.util.List;

import javax.swing.plaf.ActionMapUIResource;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import commonFunction.FunctionLibrary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightBooksteps 

{
	WebDriver driver;
	
	@When("^Open Browser$")
	public void open_Browser() throws Throwable 
	{
		driver = FunctionLibrary.startBrowser();
	   
	}

	@When("^Open Application$")
	public void open_Application() throws Throwable 
	{
		FunctionLibrary.openApplication(driver);
		
	  
	}

	@Then("^i should see make my trip Flight booking page expTitle \"([^\"]*)\"$")
	public void i_should_see_make_my_trip_Flight_booking_page_expTitle(String acttitle) throws Throwable 
	{
	   FunctionLibrary.validateTitle(acttitle);
	}

	@When("^Wait For searchbutton with \"([^\"]*)\" and value is \"([^\"]*)\"$")
	public void wait_For_searchbutton_with_and_value_is(String locatortype, String locatorvalue) throws Throwable
	{
	   FunctionLibrary.waitForElement(driver, locatortype, locatorvalue, "10");
	   
	}
	
	@When("^i click mobile alert with \"([^\"]*)\" and value is \"([^\"]*)\"$")
	public void i_click_mobile_alert_with_and_value_is(String locatortype, String locatorvalue) throws Throwable
	{
		FunctionLibrary.waitForElement(driver, locatortype, locatorvalue, "20");
		Thread.sleep(5000);
		FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
	  
	}
	
	@When("^i click from city tab with \"([^\"]*)\" and value is \"([^\"]*)\"$")
	public void i_click_from_city_tab_with_and_value_is(String locatortype, String locatorvalue) throws Throwable {
		Thread.sleep(3000);
	   FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
	   
	}

	
	


	@When("^Enter Fromcity with \"([^\"]*)\" and value is \"([^\"]*)\" and from city name is \"([^\"]*)\"$")
	public void enter_Fromcity_with_and_value_is_and_from_city_name_is(String locatortype, String locatorvalue, String testdata) throws Throwable
	{
		System.out.println(testdata);
		Thread.sleep(3000);
		FunctionLibrary.typeAction(driver, locatortype, locatorvalue, testdata);
	 
	}
	
	

@Then("^i click city name with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_click_city_name_with_and_value_is(String locatortype, String locatorvalue) throws Throwable 
{
	Thread.sleep(5000);
	FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
}

	@When("^Enter date in calendar is : \"([^\"]*)\"$")
	public void enter_date_in_calendar_is(String date) throws Throwable 
	{
		
	   FunctionLibrary.calendar(date);
	}
	

@When("^Enter date in datecalendar is : \"([^\"]*)\"$")
public void enter_date_in_datecalendar_is(String date) throws Throwable 
{
	FunctionLibrary.datecalendar(date);
	
   
}


	

	@When("^click on To city with \"([^\"]*)\" and value is \"([^\"]*)\"$")
	public void click_on_To_city_with_and_value_is(String locatortype, String locatorvalue) throws Throwable 
	{
	    FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
	    Thread.sleep(2000);
	}

	@When("^Enter Tocity with \"([^\"]*)\" and value is \"([^\"]*)\" and To city name is \"([^\"]*)\"$")
	public void enter_Tocity_with_and_value_is_and_To_city_name_is(String locatortype, String locatorvalue, String data) throws Throwable
	{
		
	   FunctionLibrary.typeAction(driver, locatortype, locatorvalue, data);
	   Thread.sleep(3000);
	}

	@When("^click on Travellers and class \"([^\"]*)\" and value is \"([^\"]*)\"$")
	public void click_on_Travellers_and_class_and_value_is(String locatortype, String locatorvalue) throws Throwable
	{
	   FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
	}

	@When("^click on Adult passenger no is \"([^\"]*)\"$")
	public void click_on_Adult_passenger_with_and_value_is_passengar_no_is(String adultpassno) throws Throwable 
	{
		WebElement adultno=driver.findElement(By.xpath("(//ul[@class='guestCounter font12 darkText gbCounter'])[1]"));
		
		
		List<WebElement> rowvalue=adultno.findElements(By.tagName("li"));
		System.out.println(rowvalue.size());

		Thread.sleep(5000);
		
		for (WebElement adultpass : rowvalue)
		{
			if (adultpass.getText().equals(adultpassno))
			{
				adultpass.click();
				
			}
			
		}
	    
	}

	@When("^click on Children no is \"([^\"]*)\"$")
	public void click_on_Children_passenger_with_and_value_is_children_no_is(String data) throws Throwable {
	   
		WebElement childnorow=driver.findElement(By.xpath("(//ul[@class='guestCounter font12 darkText gbCounter'])[2]"));
		List<WebElement> rowvalue1=childnorow.findElements(By.tagName("li"));
		System.out.println(rowvalue1.size());

		for (WebElement childno : rowvalue1)
		{
			if (childno.getText().equals(data))
			{
				childno.click();
				
			}
			
		}

	}

	@When("^click on Infants passengar no is \"([^\"]*)\"$")
	public void click_on_Infants_passenger_with_and_value_is_passengar_no_is(String data) throws Throwable 
	{

		WebElement infants=driver.findElement(By.xpath("(//ul[@class='guestCounter font12 darkText gbCounter'])[3]"));
		List<WebElement> rowvalue3=infants.findElements(By.tagName("li"));
		System.out.println(rowvalue3.size());	
		for (WebElement infantpass : rowvalue3)
		{
			if (infantpass.getText().equals(data))
			{
				infantpass.click();
				
			}
			
		}											
		
		
	}

	@When("^click on Choose travel Class passenger with Travel class no is \"([^\"]*)\"$")
	public void click_on_Choose_travel_Class_passenger_with_Travel_class_no_is(String ticketclass) throws Throwable 
	{
		if (ticketclass.equals("1"))
		{
			driver.findElement(By.xpath("(//li[normalize-space()='Economy/Premium Economy'])")).click();
			
		}
		else if (ticketclass.equals("2")) 
		{
			driver.findElement(By.xpath("(//li[normalize-space()='Premium Economy'])[1]")).click();
			
		}
		else if (ticketclass.equals("3")) 
		{
			driver.findElement(By.xpath("(//li[normalize-space()='Business'])[1]")).click();
			
		}
		else {
			System.out.println("Please enter valid input ");
		}
	   
	}

	@Then("^click apply button with \"([^\"]*)\" and value is \"([^\"]*)\"$")
	public void click_apply_button_with_and_value_is(String locatortype, String locatorvalue) throws Throwable 
	{
		FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
	  
	}
	
	
	

@When("^i click on the search button with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_click_on_the_search_button_with_and_value_is(String locatortype, String locatorvalue) throws Throwable
{
   FunctionLibrary.clickAction(driver, locatortype, locatorvalue); 
}

@When("^i click okay, got it alert with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_click_okay_got_it_alert_with_and_value_is(String locatortype, String locatorvalue) throws Throwable 
{
	Thread.sleep(5000);
    FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
}




@When("^i click on view prices with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_click_on_view_prices_with_and_value_is(String locatortype, String locatorvalue) throws Throwable
{
	Thread.sleep(2000);
	FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
}

@When("^i click on booknow button with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_click_on_booknow_button_with_and_value_is(String locatortype, String locatorvalue) throws Throwable
{
	Thread.sleep(2000);
    FunctionLibrary.clickAction(driver, locatortype, locatorvalue);    
}


@Then("^change driver Focus to new window$")
public void change_driver_Focus_to_new_window() throws Throwable
{
    FunctionLibrary.moveDriverFocus();
}


@When("^i click add adult with \"([^\"]*)\"and value is \"([^\"]*)\"$")
public void i_click_add_adult_with_and_value_is(String locatortype, String locatorvalue) throws Throwable
{
	Thread.sleep(5000);
	Actions act= new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath(locatorvalue)));
    Thread.sleep(3000);
    FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
}

@When("^i enter fname with \"([^\"]*)\" and value is \"([^\"]*)\" value is \"([^\"]*)\"$")
public void i_enter_fname_with_and_value_is_value_is(String locatortype, String locatorvalue, String fname) throws Throwable
{
	Thread.sleep(4000);
   FunctionLibrary.typeAction(driver, locatortype, locatorvalue, fname);
}

@When("^i enter lname with \"([^\"]*)\" and value is \"([^\"]*)\" value is \"([^\"]*)\"$")
public void i_enter_lname_with_and_value_is_value_is(String locatortype, String locatorvalue, String lname) throws Throwable 
{
	Thread.sleep(4000);
  FunctionLibrary.typeAction(driver, locatortype, locatorvalue, lname);
}

@Then("^i Click gender with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_Click_gender_with_and_value_is(String locatortype, String locatorvalue) throws Throwable 
{
	 FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
	 
}

@Then("^i give mobile no with \"([^\"]*)\" and value is \"([^\"]*)\" and mobileno is \"([^\"]*)\"$")
public void i_give_mobile_no_with_and_value_is_and_mobileno_is(String locatortype, String locatorvalue, String testdata) throws Throwable
{
  FunctionLibrary.typeAction(driver, locatortype, locatorvalue, testdata);
}

@Then("^i give email id with \"([^\"]*)\" and value is \"([^\"]*)\" and email address is \"([^\"]*)\"$")
public void i_give_email_id_with_and_value_is_and_email_address_is(String locatortype, String locatorvalue, String testdata) throws Throwable 
{
  FunctionLibrary.typeAction(driver, locatortype, locatorvalue, testdata);
  driver.findElement(By.className("emailId")).click();
}

@Then("^i click continue button with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_click_continue_button_with_and_value_is(String locatortype, String locatorvalue) throws Throwable 
{
   FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
 
}

@When("^i click confirm button with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_click_confirm_button_with_and_value_is(String locatortype, String locatorvalue) throws Throwable 
{ Thread.sleep(5000);
    FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
}


@When("^i click yes please button with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_click_yes_please_button_with_and_value_is(String locatortype, String locatorvalue) throws Throwable
{
	Thread.sleep(3000);
 FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
}


@When("^i click add meal with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_click_add_meal_with_and_value_is(String locatortype, String locatorvalue) throws Throwable
{
	Thread.sleep(4000);
   FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
}

@When("^i click proced to pay button with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_click_proced_to_pay_button_with_and_value_is(String locatortype, String locatorvalue) throws Throwable {
    Thread.sleep(2000);
    FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
}



@When("^i click continue anyway button with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_click_continue_anyway_button_with_and_value_is(String locatortype, String locatorvalue) throws Throwable 
{
	Thread.sleep(4000);
	FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
}

@When("^i click on bus link with \"([^\"]*)\"and value is \"([^\"]*)\"$")
public void i_click_on_bus_link_with_and_value_is(String locatortype, String locatorvalue) throws Throwable {
     FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
}

@When("^i click primo alert with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_click_primo_alert_with_and_value_is(String locatortype, String locatorvalue) throws Throwable
{
	Thread.sleep(5000);
	FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
	
   
}

@When("^i click select seat with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_click_select_seat_with_and_value_is(String locatortype, String locatorvalue) throws Throwable 
{
	Thread.sleep(2000);
	FunctionLibrary.clickAction(driver, locatortype, locatorvalue);

}

@When("^i choose seats with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_choose_seats_with_and_value_is(String locatortype, String locatorvalue) throws Throwable 
{
	Thread.sleep(5000);
	FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
}

@When("^i click book seats with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_click_book_seats_with_and_value_is(String locatortype, String locatorvalue) throws Throwable 
{
	Thread.sleep(3000);
	FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
   
}



@When("^i enter age with\"([^\"]*)\" and vlaue is \"([^\"]*)\" with vlaue is \"([^\"]*)\"$")
public void i_enter_age_with_and_vlaue_is_with_vlaue_is(String locatortype, String locatorvalue, String testdata) throws Throwable
{
	FunctionLibrary.typeAction(driver, locatortype, locatorvalue, testdata);
	
}

@When("^i use mouse action move gender with \"([^\"]*)\" and value is \"([^\"]*)\" and select male with value is \"([^\"]*)\"$")
public void i_use_mouse_action_move_gender_with_and_value_is_and_select_male_with_value_is(String locatortype, String movecursor, String clickelement) throws Throwable {
    

	FunctionLibrary.mouseAction(locatortype, movecursor, clickelement);
    
}



@Then("^i give bus mobile no with \"([^\"]*)\" and value is \"([^\"]*)\" and mobileno is \"([^\"]*)\"$")
public void i_give_bus_mobile_no_with_and_value_is_and_mobileno_is(String locatortype, String locatorvalue, String testdata) throws Throwable 
{
	FunctionLibrary.typeAction(driver, locatortype, locatorvalue, testdata);
    
}


@Then("^i give busemail id with \"([^\"]*)\" and value is \"([^\"]*)\" and email address is \"([^\"]*)\"$")
public void i_give_busemail_id_with_and_value_is_and_email_address_is(String locatortype, String locatorvalue, String testdata) throws Throwable 
{
	FunctionLibrary.typeAction(driver, locatortype, locatorvalue, testdata);
   
}

@When("^i click on yes secure my trip with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_click_on_yes_secure_my_trip_with_and_value_is(String locatortype, String locatorvalue) throws Throwable 
{
 FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
}

@Then("^i click continue to book now with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_click_continue_to_book_now_with_and_value_is(String locatortype, String locatorvalue) throws Throwable 
{
   FunctionLibrary.clickAction(driver, locatortype, locatorvalue); 
}

@When("^i Enter Train ticket Class \"([^\"]*)\"$")
public void i_Enter_Train_ticket_Class(String Ticketclass) throws Throwable 
{
    FunctionLibrary.ticketclass(Ticketclass);
}

@When("^i select select class with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_select_select_class_with_and_value_is(String locatortype, String locatorvalue) throws Throwable 
{
	
	FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
 }

@When("^i click cancelcharge with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_click_cancelcharge_with_and_value_is(String locatortype, String locatorvalue) throws Throwable
{
	FunctionLibrary.waitForElement(driver, locatortype, locatorvalue, "15");
	Thread.sleep(3000);
	FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
}


@When("^i click add travells with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_click_add_travells_with_and_value_is(String locatortype, String locatorvalue) throws Throwable
{
   FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
}

@Then("^i click gender on train with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_click_gender_on_train_with_and_value_is(String locatortype, String locatorvalue) throws Throwable
{
    FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
}

@Then("^i click gender as male with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_click_gender_as_male_with_and_value_is(String locatortype, String locatorvalue) throws Throwable
{
   FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
}


@Then("^i click add button with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_click_add_button_with_and_value_is(String locatortype, String locatorvalue) throws Throwable
{
	FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
}

@When("^i click irctc username with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_click_irctc_username_with_and_value_is(String locatortype, String locatorvalue) throws Throwable
{
   FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
}

@When("^i enter irctc username with \"([^\"]*)\" and value is \"([^\"]*)\" and send data is \"([^\"]*)\"$")
public void i_enter_irctc_username_with_and_value_is_and_send_data_is(String locatortype, String locatorvalue, String testdata) throws Throwable 
{
	FunctionLibrary.typeAction(driver, locatortype, locatorvalue, testdata);
   
}

@Then("^i click submit button with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_click_submit_button_with_and_value_is(String locatortype, String locatorvalue) throws Throwable 
{
   FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
}


@When("^i click calander date ie \"([^\"]*)\"$")
public void i_click_calander_date_ie(String date1) throws Throwable 
   
{

	try {
		Thread.sleep(7000);
		String[] temp1 =date1.split("/");
		String mmyy1= temp1[1]+""+temp1[2];
		String dd1= temp1[0];
		System.out.println(dd1);
		System.out.println(mmyy1);



		String calmonth1= driver.findElement(By.xpath("(//div[@role='heading'])[1]")).getText();
		System.out.println(calmonth1);
		//Forchange month useing keyboard keys
		//driver.findElement(By.xpath("(//div[@class='DayPicker-Body'])[1]")).click();
		while (! mmyy1.equalsIgnoreCase(calmonth1)) 
		{

			System.out.println("while loop");

			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			calmonth1 = driver.findElement(By.xpath("(//div[@role='heading'])[1]")).getText();

		}
		WebElement chkmonth1= driver.findElement(By.xpath("(//div[@Class ='DayPicker-Body'])[1]"));
		List<WebElement> rows1 = chkmonth1.findElements(By.xpath("(//div[@role='rowgroup'])[2]//div[@role='row']"));
		System.out.println(rows1.size());
		for (int i = 0; i < rows1.size(); i++)
		{
			
			List<WebElement> caldate1 = rows1.get(i).findElements(By.xpath("(//div[@class = 'DayPicker-Body'])[1]//div[@class='DayPicker-Day']"));
			System.out.println(caldate1.size());


			for (WebElement data1 : caldate1)
			{
				if ((data1.getText()).equals(dd1)) 
				{
					data1.click();
					break;
				}

			}
		}

	} catch (Throwable t)
	{

		System.out.println("Steal Element exception");
	}

	Thread.sleep(1000);
	 
}

@When("^i click with xpath \"([^\"]*)\" number is \"([^\"]*)\"$")
public void i_click_with_xpath_number_is(String locatorvalue, String childs) throws Throwable
{
	Thread.sleep(2000);
	driver.findElement(By.xpath(locatorvalue)).click();
	
	List<WebElement> child = driver.findElements(By.xpath("//ul[@class='gstSlct__list']//li"));
	System.out.println(child.size());
	//Thread.sleep(2000);

	for (WebElement childs1 : child)
	{
		if ((childs1.getText()).equals(childs)) 
		{
			childs1.click();
			break;
		}
		
	}   
}


@When("^i click on hotel banner with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_click_on_hotel_banner_with_and_value_is(String locatortype, String locatorvalue) throws Throwable
{
    FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
}

@When("^i should move attention to iframe with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void i_should_move_attention_to_iframe_with_and_value_is(String locatortype, String locatorvalue) throws Throwable 
{
	Thread.sleep(5000);
   FunctionLibrary.movetoiframe(driver, locatortype, locatorvalue);
    System.out.println("frame move");
}

@When("^click close button with \"([^\"]*)\" and value is \"([^\"]*)\"$")
public void click_close_button_with_and_value_is(String locatortype, String locatorvalue) throws Throwable
{
   FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
   System.out.println("click close");
}






}
