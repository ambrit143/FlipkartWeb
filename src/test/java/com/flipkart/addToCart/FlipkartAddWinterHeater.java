package com.flipkart.addToCart;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.flipkart.generic.BaseClass;
import com.flipkart.objectRepository.FlipkartWinterHeater;
@Listeners(com.flipkart.generic.ListenerImplementationClass.class)
public class FlipkartAddWinterHeater extends BaseClass {
@Test
public void flipkartAddWinterHeater() {
	String searchProductName = excelUtility.getDataFromExcel("flipkart", 2,1);
	FlipkartWinterHeater flipkart=new FlipkartWinterHeater();
	flipkart.clickOnCrossBtn();
	flipkart.searchWinterHeater(searchProductName);
	flipkart.clickOnFirstProduct();
	webDriverUtility.switchToWindow("title","heater");
	String productName=flipkart.getProductName();
	Reporter.log("Product Name is:"+productName,true);
	flipkart.clickOnAddToCart();
	String cartProductName=flipkart.getCartProductName(productName);
	Reporter.log("Cart Product Name is:"+cartProductName,true);
	Assert.assertEquals(productName, cartProductName);
}
}
