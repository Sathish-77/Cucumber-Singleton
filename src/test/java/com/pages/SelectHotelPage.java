package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotelPage extends BaseClass {
public SelectHotelPage() {
PageFactory.initElements(driver, this);}
@FindBy(id="radiobutton_0")
private WebElement radiobtn;
public WebElement getRadiobtn() {
	return radiobtn;
}

}
