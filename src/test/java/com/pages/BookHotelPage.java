package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookHotelPage extends BaseClass {
	public BookHotelPage() {
PageFactory.initElements(driver, this);
}
@FindBy(id="first_name")
private WebElement txtFirstName;
@FindBy(id="last_name")
private WebElement txtLastName;
@FindBy(id="address")
private WebElement adress;
@FindBy(id="cc_num")
private WebElement cardNo;
@FindBy(id="cc_type")
private WebElement cardTyp;
@FindBy(id="cc_exp_month")
private WebElement cardMonth;
@FindBy(id="cc_exp_year")
private WebElement cardYear;

public WebElement getCardTyp() {
	return cardTyp;
}
public WebElement getCardMonth() {
	return cardMonth;
}
public WebElement getCardYear() {
	return cardYear;
}
public WebElement getCvv() {
	return cvv;
}
@FindBy(id="cc_cvv")
private WebElement cvv;

@FindBy(id="book_now")
private WebElement btnBook;





public WebElement getBtnBook() {
	return btnBook;
}
public WebElement getTxtFirstName() {
	return txtFirstName;
}
public WebElement getTxtLastName() {
	return txtLastName;
}
public WebElement getAdress() {
	return adress;
}
public WebElement getCardNo() {
	return cardNo;
}

}
