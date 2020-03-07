package com.stepdefinition1;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.*;

public class Hooks extends BaseClass{
@Before 
public void beforeScenario() {
getDriver();
loadUrl("https://adactin.com/HotelApp/");

}
@After
public void afterScenario(Scenario sc) {

TakesScreenshot tk=(TakesScreenshot) driver;
byte[] s = tk.getScreenshotAs(OutputType.BYTES);
System.out.println(s);
sc.embed(s, "images/png");
}

}
