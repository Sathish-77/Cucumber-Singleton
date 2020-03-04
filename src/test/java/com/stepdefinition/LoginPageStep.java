package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginPageStep {
	WebDriver driver;
	@Given("User is on adactin page")
	public void user_is_on_adactin_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\new\\eclipse-workspace\\SamplProject1\\newdrive\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/SearchHotel.php");
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String s1, String s2) {
		WebElement textUserName = driver.findElement(By.id("username"));
		textUserName.sendKeys(s1);
	
	WebElement textPassword = driver.findElement(By.id("password"));
	textPassword.sendKeys(s2);

	}
	

	@When("User should click the login button")
	public void user_should_click_the_login_button() {
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	}

	@When("User should select the  {string},{string},{string},{string}")
	public void user_should_select_the(String loc, String h, String romtyp, String nor) throws InterruptedException {
	    WebElement local = driver.findElement(By.id("location"));
		Select s=new Select(local);
	s.selectByVisibleText(loc);
	WebElement hotel = driver.findElement(By.id("hotels"));
	Select a=new Select(hotel);
a.selectByVisibleText(h);

	WebElement room = driver.findElement(By.id("room_type"));
	Select r=new Select(room);
r.selectByVisibleText(romtyp);

WebElement num = driver.findElement(By.id("room_type"));

num.sendKeys(nor);
Thread.sleep(3000);
	
	}

	@When("User should enter the  {string},{string}")
	public void user_should_enter_the(String din, String dout) {
		WebElement datein  = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		datein.sendKeys(din);
		
	WebElement dateout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
	dateout.sendKeys(dout);

	}

	@When("User should select the  {string}, {string}")
	public void user_should_select_the(String adult, String child) {
		 WebElement adultno = driver.findElement(By.id("adult_room"));
					adultno.sendKeys(adult);
		 WebElement childno = driver.findElement(By.id("child_room"));
			
		childno.sendKeys(child);
	}
	@When("User should click the search")
	public void user_should_click_the_search() {
		WebElement btnSearch = driver.findElement(By.id("Submit"));
		btnSearch.click();
	}
	

	@When("User should select the hotel name")
	public void user_should_select_the_hotel_name() {
		WebElement radiobtn = driver.findElement(By.id("radiobutton_0"));
		radiobtn.click();
	}
	@When("User should click continue")
	public void user_should_click_continue() {
		WebElement continuebtn = driver.findElement(By.id("continue"));
		continuebtn.click();
	}
	@When("User should enter the  {string},{string},{string},{string}")
	public void user_should_enter_the(String fn, String ln, String ba, String can) {
		 WebElement firstName = driver.findElement(By.id("first_name"));
			firstName.sendKeys(fn);
			WebElement lastName = driver.findElement(By.id("last_name"));
			lastName.sendKeys(fn);		
			WebElement billing = driver.findElement(By.id("address"));
			billing.sendKeys(ba);	
			WebElement cardno = driver.findElement(By.id("cc_num"));
			cardno.sendKeys(can);
			
	}

	@When("User should select the {string},{string},{string}")
	public void user_should_select_the(String cardtype, String expMonth, String expYear) {
		 WebElement cart = driver.findElement(By.id("cc_type"));
			cart.sendKeys(cardtype);
			 WebElement expm = driver.findElement(By.id("cc_exp_month"));
				expm.sendKeys(expMonth);
				 WebElement expy = driver.findElement(By.id("cc_exp_year"));
					expy.sendKeys(expYear);
	}

	@When("User should enter the {string}")
	public void user_should_enter_the(String cvv) {
		WebElement cv = driver.findElement(By.id("cc_cvv"));
		cv.sendKeys(cvv);
	}
	@When("User should click the book")
	public void user_should_click_the_book() {
		WebElement cv = driver.findElement(By.id("book_now"));
		cv.click();
	}
	@When("User should generate the order id")
	public void user_should_generate_the_order_id() throws InterruptedException {
		Thread.sleep(5000);
		WebElement order = driver.findElement(By.id("order_no"));
		String orderid = order.getAttribute("value");
	System.out.println();
	System.out.println("Order ID : "+orderid);
	}}



