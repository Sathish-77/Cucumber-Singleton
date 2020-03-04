package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchHotelPage extends BaseClass {
public SearchHotelPage() {
PageFactory.initElements(driver, this);}
@FindBy(id="location")
private WebElement loc;
@FindBy(id="hotels")
private WebElement hotel;
@FindBy(id="room_type")
private WebElement romTyp;
@FindBy(id="room_nos")
private WebElement romNum;
@FindBy(xpath="//input[@name='datepick_in']")
private WebElement din;
@FindBy(xpath="//input[@name='datepick_out']")
private WebElement dout;
@FindBy(id="adult_room")
private WebElement adultRom;
@FindBy(id="child_room")
private WebElement childRom;
@FindBy(id="Submit")
private WebElement btnSubmit;
public WebElement getLoc() {
	return loc;
}
public WebElement getHotel() {
	return hotel;
}
public WebElement getRomTyp() {
	return romTyp;
}
public WebElement getRomNum() {
	return romNum;
}
public WebElement getDin() {
	return din;
}
public WebElement getDout() {
	return dout;
}
public WebElement getAdultRom() {
	return adultRom;
}
public WebElement getChildRom() {
	return childRom;
}
public WebElement getBtnSubmit() {
	return btnSubmit;
}
}
