package com.flipkart.generic;

import org.openqa.selenium.WebDriver;

public class DriverClass {
public static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
public static ThreadLocal<JavaUtility> javaUtility=new ThreadLocal<>();
public static ThreadLocal<WebDriverUtility> webDriverUtility=new ThreadLocal<>();
public static WebDriver getDriver() {
	return driver.get();
}

public static void setDriver(WebDriver actDriver) {
	driver.set(actDriver);
}

public static JavaUtility getJavaUtility() {
	return javaUtility.get();
}

public static void setJavaUtility(JavaUtility actJavaUtility) {
	javaUtility.set(actJavaUtility);
}

public static WebDriverUtility getWebDriverUtility() {
	return webDriverUtility.get();
}

public static void setWebDriverUtility(WebDriverUtility actWebDriverUtility) {
	webDriverUtility.set(actWebDriverUtility);
}




}
