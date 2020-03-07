package com.stepdefinition1;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.base.BaseClass;
import com.manager.PageObjectManager;

import cucumber.api.java.en.*;

public class AdactinPageBase extends BaseClass {
PageObjectManager page;
	@Given("User is on adactin page")
	public void user_is_on_adactin_page() throws InterruptedException {
		
			} 

	@When("User enters {string} and {string}")
	public void user_enters_and(String s1, String s2) {
		page=new PageObjectManager();
		
		type(page.getLoginPage().getTextUserName(), s1);

		WebElement pass = page.getLoginPage().getTextpassword();
		type(pass, s2);
		
	}

	@When("User should click the login button")
	public void user_should_click_the_login_button() {
		btnclick(page.getLoginPage().getBtnlogin());
		
	}

	@When("User should select the  {string},{string},{string},{string}")
	public void user_should_select_the(String loc, String h, String romtyp, String nor) throws InterruptedException {
	page=new PageObjectManager();
		WebElement local = page.getsearchHotelPage().getLoc();
		selectByAttribute(local,loc);
		WebElement hotel = page.getsearchHotelPage().getHotel();
		selectByAttribute(hotel, h);
		

		WebElement room = page.getsearchHotelPage().getRomTyp();
	selectByAttribute(room, romtyp);

		WebElement num = page.getsearchHotelPage().getRomNum();
		type(num, nor);
		Thread.sleep(3000);
	}

	@When("User should enter the check in   {string},{string}")
	public void user_should_enter_the_check_in(String din, String dout) {
		WebElement datein = page.getsearchHotelPage().getDin();
		datein.sendKeys(din);

		WebElement dateout = page.getsearchHotelPage().getDout();
		dateout.sendKeys(dout);
	}

	@When("User should select the room  {string}, {string}")
	public void user_should_select_the_room(String adult, String child) throws IOException {
		WebElement adultno = page.getsearchHotelPage().getAdultRom();
		type(adultno, adult);
		WebElement childno =page.getsearchHotelPage().getChildRom();
		type(childno, child);
		
	}

	@When("User should click the search")
	public void user_should_click_the_search() {
		WebElement btnSearch = page.getsearchHotelPage().getBtnSubmit();
		btnSearch.click();
	}

	@When("User should select the hotel name")
	public void user_should_select_the_hotel_name() {
		
		btnclick(page.getSelectHotelPage().getRadiobtn());
	}

	@When("User should click continue")
	public void user_should_click_continue() {
		
		WebElement continuebtn = driver.findElement(By.id("continue"));
		btnclick(continuebtn);
	}

	@When("User should enter the name  {string},{string},{string},{string}")
	public void user_should_enter_the_name(String fn, String ln, String ba, String can) {
		
		WebElement firstName = page.getbookHotelPage().getTxtFirstName();
		type(firstName, fn);
		WebElement lastName = page.getbookHotelPage().getTxtLastName();
		type(lastName, ln);
		WebElement billing = page.getbookHotelPage().getAdress();
		type(billing, ba);
		WebElement cardno = page.getbookHotelPage().getCardNo();
		type(cardno, can);
	}

	@When("User should select the cc {string},{string},{string}")
	public void user_should_select_the_cc(String cardtype, String expMonth, String expYear) {
		WebElement cart = page.getbookHotelPage().getCardTyp();
		type(cart, cardtype);
		WebElement expm = page.getbookHotelPage().getCardMonth();
		type(expm, expMonth);
		WebElement expy = page.getbookHotelPage().getCardYear();
		type(expy,expYear);
		}

	@When("User should enter the ccv {string}")
	public void user_should_enter_the_ccv(String cvv) {
		WebElement cv =page.getbookHotelPage().getCvv();
		type(cv, cvv);
		}

	@When("User should click the book buton")
	public void user_should_click_the_book_buton() {
		
		btnclick(page.getbookHotelPage().getBtnBook());
	}

	@Then("User should generate the order id")
	public void user_should_generate_the_order_id() throws InterruptedException {
		
		Thread.sleep(5000);
		WebElement order = driver.findElement(By.id("order_no"));
		String orderid = order.getAttribute("value");
		System.out.println();
		System.out.println("Order ID : " + orderid);
		WebElement myIti=page.getConfirmationHotelPage().getMyItinerary();
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
