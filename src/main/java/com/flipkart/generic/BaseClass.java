package com.flipkart.generic;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public JavaUtility javaUtility;
	public FileUtility fileUtility;
	public ExcelUtility excelUtility;
	public WebDriverUtility webDriverUtility;
	private String url;
	private String timeouts;
	private String browser;
	public long timeoutsLong;
	public WebDriver driver;
	@BeforeClass
	public void classSetup() {
		javaUtility=new JavaUtility();
		fileUtility=new FileUtility();
		excelUtility=new ExcelUtility();
		webDriverUtility=new WebDriverUtility();
		fileUtility.initializePropertyFile(IPathConstants.PROPERTYFILEPATH);
		excelUtility.initializeExcelFile(IPathConstants.EXCELFILEPATH);
		url=fileUtility.getDataFromPropertyfile("url");
		timeouts=fileUtility.getDataFromPropertyfile("duration");
		browser=fileUtility.getDataFromPropertyfile("browser");
		timeoutsLong = javaUtility.convertStringToLong(timeouts);
		driver= webDriverUtility.openBrowser(browser);
		DriverClass.setDriver(driver);
		DriverClass.setJavaUtility(javaUtility);
		DriverClass.setWebDriverUtility(webDriverUtility);
		webDriverUtility.navigateToApplication(url);
		webDriverUtility.maxizeBrowser();
		webDriverUtility.implicitWait(timeoutsLong);
		

	}
	@BeforeMethod
	public void methodSetup() {


	}
	@AfterMethod
	public void methodTeardown() {
		
		
	}
	@AfterClass
	public void classTeardown() {
		excelUtility.closeExcelWorkbook();
		webDriverUtility.closeAllBrowser();

	}

}
