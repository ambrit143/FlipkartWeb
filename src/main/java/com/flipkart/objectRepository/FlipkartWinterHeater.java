package com.flipkart.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.generic.DriverClass;

public class FlipkartWinterHeater {
	
 public FlipkartWinterHeater(){
	 PageFactory.initElements(DriverClass.getDriver(), this);
 }
 
 @FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
 private WebElement crossBtn;
 
 @FindBy(xpath="//input[@class='_3704LK']")
 private WebElement searchProduct;
 
 @FindBy(xpath="(//*[name()='path' and @class='_34RNph'])[2]")
 private WebElement searchBtn;
 
 @FindBy(xpath="(//a[contains(text(),'Heater')])[2]")
 private WebElement firstProductSearch;
 
 @FindBy(xpath="//span[@class='B_NuCI']")
 private WebElement productName;
 
 @FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
 private WebElement addToCartBtn;
 
 
 //business logic
 public void clickOnCrossBtn() {
	 crossBtn.click();
 }
 
 public void searchWinterHeater(String productName) {
	 searchProduct.sendKeys(productName,Keys.ENTER); 
 }
 
 public void clickOnFirstProduct() {
	 firstProductSearch.click();
 }
 
 public String getProductName() {
	 return productName.getText().trim();
 }
 
 public void clickOnAddToCart() {
	 addToCartBtn.click();
 }
 
 public String getCartProductName(String productName) {
	 return DriverClass.getDriver().findElement(By.xpath("//a[contains(text(),'"+productName+"')]")).getText().trim();
 }
 
 
}
