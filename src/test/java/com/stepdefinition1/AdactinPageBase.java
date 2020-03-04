package com.stepdefinition1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.base.BaseClass;

import com.pages.BookHotelPage;
import com.pages.ConfirmationPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

import cucumber.api.java.en.*;

public class AdactinPageBase extends BaseClass {
LoginPage page;
SearchHotelPage hotelPage;
SelectHotelPage selectHotel;
BookHotelPage bookHotel;
ConfirmationPage confirmPage;
	@Given("User is on adactin page")
	public void user_is_on_adactin_page() throws InterruptedException {
		getDriver();
		loadUrl("https://adactin.com/HotelApp/");
			} 

	@When("User enters {string} and {string}")
	public void user_enters_and(String s1, String s2) {
		page=new LoginPage();
		
		type(page.getTextUserName(), s1);

		WebElement pass = page.getTextpassword();
		type(pass, s2);
		
	}

	@When("User should click the login button")
	public void user_should_click_the_login_button() {
		btnclick(page.getBtnlogin());
		
	}

	@When("User should select the  {string},{string},{string},{string}")
	public void user_should_select_the(String loc, String h, String romtyp, String nor) throws InterruptedException {
		hotelPage=new SearchHotelPage();
		WebElement local = hotelPage.getLoc();
		selectByAttribute(local,loc);
		WebElement hotel = hotelPage.getHotel();
		selectByAttribute(hotel, h);
		

		WebElement room = hotelPage.getRomTyp();
	selectByAttribute(room, romtyp);

		WebElement num = hotelPage.getRomNum();
		type(num, nor);
		Thread.sleep(3000);
	}

	@When("User should enter the check in   {string},{string}")
	public void user_should_enter_the_check_in(String din, String dout) {
		WebElement datein = hotelPage.getDin();
		datein.sendKeys(din);

		WebElement dateout = hotelPage.getDout();
		dateout.sendKeys(dout);
	}

	@When("User should select the room  {string}, {string}")
	public void user_should_select_the_room(String adult, String child) throws IOException {
		WebElement adultno = hotelPage.getAdultRom();
		type(adultno, adult);
		WebElement childno =hotelPage.getChildRom();
		type(childno, child);
		
	}

	@When("User should click the search")
	public void user_should_click_the_search() {
		WebElement btnSearch = hotelPage.getBtnSubmit();
		btnSearch.click();
	}

	@When("User should select the hotel name")
	public void user_should_select_the_hotel_name() {
		selectHotel=new SelectHotelPage();
		btnclick(selectHotel.getRadiobtn());
	}

	@When("User should click continue")
	public void user_should_click_continue() {
		
		WebElement continuebtn = driver.findElement(By.id("continue"));
		btnclick(continuebtn);
	}

	@When("User should enter the name  {string},{string},{string},{string}")
	public void user_should_enter_the_name(String fn, String ln, String ba, String can) {
		bookHotel=new BookHotelPage();
		WebElement firstName = bookHotel.getTxtFirstName();
		type(firstName, fn);
		WebElement lastName = bookHotel.getTxtLastName();
		type(lastName, ln);
		WebElement billing = bookHotel.getAdress();
		type(billing, ba);
		WebElement cardno = bookHotel.getCardNo();
		type(cardno, can);
	}

	@When("User should select the cc {string},{string},{string}")
	public void user_should_select_the_cc(String cardtype, String expMonth, String expYear) {
		WebElement cart = bookHotel.getCardTyp();
		type(cart, cardtype);
		WebElement expm = bookHotel.getCardMonth();
		type(expm, expMonth);
		WebElement expy = bookHotel.getCardYear();
		type(expy,expYear);
		}

	@When("User should enter the ccv {string}")
	public void user_should_enter_the_ccv(String cvv) {
		WebElement cv =bookHotel.getCvv();
		type(cv, cvv);
		}

	@When("User should click the book buton")
	public void user_should_click_the_book_buton() {
		
		btnclick(bookHotel.getBtnBook());
	}

	@Then("User should generate the order id")
	public void user_should_generate_the_order_id() throws InterruptedException {
		confirmPage=new ConfirmationPage();
		Thread.sleep(5000);
		WebElement order = driver.findElement(By.id("order_no"));
		String orderid = order.getAttribute("value");
		System.out.println();
		System.out.println("Order ID : " + orderid);
		WebElement myIti=confirmPage.getMyItinerary();
		btnclick(myIti);
		WebElement btnorder = driver.findElement(By.xpath("//input[@value='"+orderid+"']/parent::td/preceding-sibling::td"));
	btnorder.click();
	WebElement cancel = driver.findElement(By.xpath("//input[@value='Cancel Selected']"));
	cancel.click();
	
	Alert a=driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
	
	
	}
}
