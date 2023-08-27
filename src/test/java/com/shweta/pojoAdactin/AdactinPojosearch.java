package com.shweta.pojoAdactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shweta.base.AdactinBase;

public class AdactinPojosearch extends AdactinBase {
	
	
	
    public AdactinPojosearch() {
    	PageFactory.initElements(driver, this);
	}
    
	@FindBy(id="location")
	private WebElement location;
    @FindBy(id="hotels")
    private WebElement hotels;
    @FindBy(id="room_type")
    private WebElement roomType;
    @FindBy(id="room_nos")
    private WebElement noOfrooms;
    @FindBy(id="datepick_in")
    private WebElement CheckInDate;
    @FindBy(id="datepick_out")
    private WebElement CheckOutDate;
    
    @FindBy(id="adult_room")
    private WebElement adultperroom;
    
    @FindBy(id="child_room")
    private WebElement childPerroom;
    

	@FindBy(xpath="//span[text()='(Fields marked with Red asterix (*) are mandatory)']")
	private WebElement textPrint;
	
    @FindBy(id="Submit")
    private WebElement searchBtn;
    @FindBy(id="Reset")
    private WebElement reset;
	public WebElement getLocation() {
		return location;
	}
	public void setLocation(WebElement location) {
		this.location = location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public void setHotels(WebElement hotels) {
		this.hotels = hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public void setRoomType(WebElement roomType) {
		this.roomType = roomType;
	}
	public WebElement getNoOfrooms() {
		return noOfrooms;
	}
	public void setNoOfrooms(WebElement noOfrooms) {
		this.noOfrooms = noOfrooms;
	}
	public WebElement getCheckInDate() {
		return CheckInDate;
	}
	public void setCheckInDate(WebElement checkInDate) {
		CheckInDate = checkInDate;
	}
	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}
	public void setCheckOutDate(WebElement checkOutDate) {
		CheckOutDate = checkOutDate;
	}
	public WebElement getAdultperroom() {
		return adultperroom;
	}
	public void setAdultperroom(WebElement adultperroom) {
		this.adultperroom = adultperroom;
	}
	public WebElement getChildPerroom() {
		return childPerroom;
	}
	public void setChildPerroom(WebElement childPerroom) {
		this.childPerroom = childPerroom;
	}
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	public void setSearchBtn(WebElement searchBtn) {
		this.searchBtn = searchBtn;
	}
	public WebElement getReset() {
		return reset;
	}
	public void setReset(WebElement reset) {
		this.reset = reset;
	}
	public WebElement getTextPrint() {
		return textPrint;
	}
	public void setTextPrint(WebElement textPrint) {
		this.textPrint = textPrint;
	}
    
    
    
    

}
