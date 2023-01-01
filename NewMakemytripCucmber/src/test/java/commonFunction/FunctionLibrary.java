package commonFunction;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class FunctionLibrary 
{

//static WebDriver driver;
//	
//	public static WebDriver startBrowser() throws Exception{
////		if (browser.equalsIgnoreCase("chrome"))
////		{
//			driver =new ChromeDriver();	
//			//System.setProperty("webdriver.chrome.driver","D:\\testmind\\chromedriver.exe");
////			
////		}
////		else if (browser.equalsIgnoreCase("firefox")) 
////		{
////			driver =new FirefoxDriver();
////			System.setProperty("webdriver.chrome.driver","D:\\testmind\\geckodriver.exe");
////			
////		}
//		return driver;	 
//	}
//	
//	public static void openApplication(WebDriver driver) throws Exception{
//		driver.get("http://www.makemytrip.com");	
//		driver.manage().window().maximize();
//		//driver.manage().deleteAllCookies();
//	}
//	
		public static WebDriver driver;
			
			public static WebDriver startBrowser() throws Throwable{
						
					 driver =new ChromeDriver();	
				
				return driver;
			}
			
			
			public static void openApplication(WebDriver driver) throws Throwable
			{
				
				driver.get("http://www.makemytrip.com/");	
				driver.manage().window().maximize();
			}
			
			
			
			
			
			
	
	public static void waitForElement(WebDriver driver,String locatortype,String locatorvalue,String waittitme)
	{
			
			WebDriverWait mywait=new WebDriverWait(driver, Integer.parseInt(waittitme));
			if(locatortype.equalsIgnoreCase("id")){
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorvalue)));
			}
			else if(locatortype.equalsIgnoreCase("xpath")){
				mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorvalue)));
			}else if(locatortype.equalsIgnoreCase("name")){
				mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorvalue)));
			}else
			{
			System.out.println("unable to locate for waitForElement method with "+locatortype);
			}			
	}
//	
//	//method for clickaction
	public static void clickAction(WebDriver driver,String locatortype,
			String locatorvalue)
	{
		if(locatortype.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(locatorvalue)).click();
		}
		else if(locatortype.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(locatorvalue)).click();
		}
		else if(locatortype.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(locatorvalue)).click();
	}
		else{
		System.out.println("Unable to locate for ClickAction method");	
		}
	}
//	
	public static void typeAction(WebDriver driver,String locatortype,
			String locatorvalue,String testdata){
		if(locatortype.equalsIgnoreCase("id"))
		{
			//driver.findElement(By.id(locatorvalue)).clear();
			driver.findElement(By.id(locatorvalue)).sendKeys(testdata);
		}
		else if(locatortype.equalsIgnoreCase("name"))
		{
			//driver.findElement(By.name(locatorvalue)).clear();
			driver.findElement(By.name(locatorvalue)).sendKeys(testdata);
		}
		else if(locatortype.equalsIgnoreCase("xpath"))
		{
			//driver.findElement(By.xpath(locatorvalue)).clear();
			driver.findElement(By.xpath(locatorvalue)).sendKeys(testdata);
		}else
		{
			System.out.println("unable to locate for typeAction method with "+locatortype);
		}	
		
	}
	
	public static void validateTitle(String actTitle) 
	{
		  String exptitle= driver.getTitle();
		   String actualtitle ="MakeMyTrip";
		  System.out.println("Expected title is:"+exptitle+ "Actual title is:" +actualtitle);
		   if (exptitle.contains(actualtitle))
		   {
			   System.out.println("Test pass" +exptitle+ "is equal to" +actualtitle );
			
		}
	}
	
	public static void calendar(String date) 
	{
		try {//Calender operation 
			//driver.findElement(By.xpath("//label[@for='departure']")).click();  
			String[] temp =date.split("/");
			String mmyy= temp[1]+ " "+temp[2];
			String dd= temp[0];
			 System.out.println(dd);
			 System.out.println(mmyy);
			 
			 //find cal date
			Thread.sleep(2000);
			String yearmonth= driver.findElement(By.xpath("(//div[@role='heading'])[1]/div")).getText();
			System.out.println(yearmonth);
			
			while (! mmyy.equalsIgnoreCase(yearmonth)) 
			{
				
				System.out.println("while loop");
				//driver.findElement(By.className("DayPicker-Months")).sendKeys(Keys.ARROW_RIGHT);

				driver.findElement(By.xpath("(//span[@tabindex=0])[2]")).click();
				yearmonth= driver.findElement(By.xpath("(//div[@role='heading'])[1]/div")).getText();
				
			}
			WebElement caltabl = driver.findElement(By.xpath("(//div[@role='rowgroup'])[2]"));
			
			List<WebElement> rows = caltabl.findElements(By.xpath("(//div[@role='rowgroup'])[2]//div[@role='row']"));
			System.out.println(rows.size());
			
			for (int i = 0; i <rows.size() ; i++) 
			{
				
				List<WebElement>cols=rows.get(i).findElements(By.xpath("//div[@class='DayPicker-Month'][1]//div[@class='dateInnerCell']//p[1]"));
				System.out.println(cols.size());
					

			for (WebElement data : cols)
			{
				if ((data.getText()).equals(dd)) 
				{
					data.click();
					break;
				}
				
			}
				
				
				
			}
			
		} catch (Throwable t) 
	{
			System.out.println("Steal element catched");
		}
		
	}
	
	public static void datecalendar(String date) 
	{
		try {//Calender operation 
			//driver.findElement(By.xpath("//label[@for='departure']")).click();  
			String[] temp =date.split("/");
			String mmyy= temp[1]+ " "+temp[2];
			String dd= temp[0];
			 System.out.println(dd);
			 System.out.println(mmyy);
			 
			 //find cal date
			Thread.sleep(2000);
			String yearmonth= driver.findElement(By.xpath("(//div[@role='heading'])[1]/div")).getText();
			System.out.println(yearmonth);
			
			while (! mmyy.equalsIgnoreCase(yearmonth)) 
			{
				
				System.out.println("while loop");
				//driver.findElement(By.className("DayPicker-Months")).sendKeys(Keys.ARROW_RIGHT);

				driver.findElement(By.xpath("(//span[@tabindex=0])[2]")).click();
				yearmonth= driver.findElement(By.xpath("(//div[@role='heading'])[1]/div")).getText();
				
			}
			WebElement caltabl = driver.findElement(By.xpath("(//div[@role='rowgroup'])[2]"));
			
			List<WebElement> rows = caltabl.findElements(By.xpath("(//div[@role='rowgroup'])[2]//div[@role='row']"));
			System.out.println(rows.size());
			
			for (int i = 0; i <rows.size() ; i++) 
			{
				
				List<WebElement>cols=rows.get(i).findElements(By.xpath("//div[@class='DayPicker-Day']"));
				System.out.println(cols.size());
					

			for (WebElement data : cols)
			{
				if ((data.getText()).equals(dd)) 
				{
					data.click();
					break;
				}
				
			}
				
				
				
			}
			
		} catch (Throwable t) 
	{
			System.out.println("Steal element catched");
		}
		
	}
	
	
	public static void moveDriverFocus() 
	{
		Set<String> nextwindow= driver.getWindowHandles();
		Object[] window = nextwindow.toArray();
		String window1 = window[0].toString();
		String window2 = window[1].toString();
		System.out.println(window1);
		System.out.println(window2);
		
		driver.switchTo().window(window2);
	}
	
	
	public static void mouseAction(String locatortype, String movecursor, String clickelement) throws Throwable
	{
		Actions act = new Actions(driver);
		if(locatortype.equalsIgnoreCase("xpath"))
		{
			act.moveToElement(driver.findElement(By.xpath(movecursor)));
		
			act.moveToElement(driver.findElement(By.xpath(clickelement))).click();
			act.build().perform();

		}
		
		else if (locatortype.equalsIgnoreCase("id")) 
		{
			act.moveToElement(driver.findElement(By.id(movecursor)));
			Thread.sleep(3000);
			act.moveToElement(driver.findElement(By.id(clickelement))).click();
			act.build().perform();

		}
		else {
			System.out.println("add locator type");
		}



	}
		
	
public static void ticketclass(String Ticketclass) 
{
try {
		
		

		List<WebElement> Ticket = driver.findElements(By.xpath("//ul[@class='travelForPopup']//li"));
		System.out.println(Ticket.size());

		
		System.out.println("Enter Ticket Class all class/sleeper class/third Ac/second Ac/First Ac/second setting /ac chair  : ");
		for (WebElement Ticketclass1 : Ticket)
		{
			System.out.println(Ticketclass1.getText());
			if ((Ticketclass1.getText().equalsIgnoreCase(Ticketclass))) 
			{
				Ticketclass1.click();
				break;
			}
		}	
	} catch (Throwable e) {
		System.out.println("steal element");
	}
	
}
	
public static void movetoiframe(WebDriver driver,String locatortype,
		String locatorvalue)
{
	if(locatortype.equalsIgnoreCase("id"))
	{
		 driver.switchTo().frame(driver.findElement(By.id(locatorvalue)));
	}
	else if(locatortype.equalsIgnoreCase("name"))
	{
		 driver.switchTo().frame(driver.findElement(By.name(locatorvalue)));
	}
	else if(locatortype.equalsIgnoreCase("xpath"))
	{
		 driver.switchTo().frame(driver.findElement(By.xpath(locatorvalue)));
}
	else{
	System.out.println("Unable to locate for movetoiframelocator method");	
	}
}

	
	
	
	
	
	


	
	
}
