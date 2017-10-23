import org.openqa.selenium.By;

import com.appium.maas.common.Initialization;

import io.appium.java_client.ios.IOSDriver;

public class ComposeMail_CancelSaveDraft {
	
	
	
	 public static void main(String args[]){
		//
	IOSDriver driver =	DriverManager.getDriver();
	driver.findElement(By.name(Initialization.getIdentifier("Email"))).click();
	//driver.findElement(By.xpath(Identifiers.getIdentifier("Compose"))).click();
	driver.findElement(By.name(Initialization.getIdentifier("ComposeButton"))).click();
	driver.findElement(By.xpath(Initialization.getIdentifier("ComposeMail_ToField"))).sendKeys("mamin@mdm05.onmicrosoft.com");
    driver.findElement(By.name(Initialization.getIdentifier("ComposeMail_return"))).click();
    driver.findElement(By.name(Initialization.getIdentifier("ComposeMail_Subject"))).click();
    driver.findElement(By.name(Initialization.getIdentifier("ComposeMail_Subject"))).sendKeys("Subject of mail");
    //driver.findElement(By.name("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextView[1]")).sendKeys("Subject");
    driver.findElement(By.name(Initialization.getIdentifier("ComposeMail_Cancel"))).click();
    driver.findElement(By.name(Initialization.getIdentifier("ComposeMail_SaveDraft"))).click();

}
} 
