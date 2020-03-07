package com.manager;


import com.pages.BookHotelPage;
import com.pages.ConfirmationPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;


public class PageObjectManager {
private LoginPage loginPage;
private SelectHotelPage selectHotelPage;
private SearchHotelPage searchHotelPage;
private BookHotelPage bookHotelPage;
private ConfirmationPage confirmationPage;

public LoginPage getLoginPage() {
System.out.println(loginPage);	
return (loginPage==null)?loginPage=new LoginPage():loginPage;
}
public SelectHotelPage getSelectHotelPage() {
System.out.println(selectHotelPage);	
return (selectHotelPage==null)?selectHotelPage=new SelectHotelPage():selectHotelPage;
}
public SearchHotelPage getsearchHotelPage() {
System.out.println(searchHotelPage);	
return (searchHotelPage==null)?searchHotelPage=new SearchHotelPage():searchHotelPage;
}
public BookHotelPage getbookHotelPage() {
System.out.println(bookHotelPage);	
return (bookHotelPage==null)?bookHotelPage=new BookHotelPage():bookHotelPage;
}
public ConfirmationPage getConfirmationHotelPage() {
System.out.println(confirmationPage);	
return (confirmationPage==null)?confirmationPage=new ConfirmationPage():confirmationPage;
}
}
