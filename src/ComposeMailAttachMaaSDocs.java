import org.openqa.selenium.By;

import io.appium.java_client.ios.IOSDriver;

public class ComposeMailAttachMaaSDocs {
	
	
	public void attachMaaSDocs(){
		
	IOSDriver driver = DriverManager.getDriver();
	
	driver.findElement(By.name("Compose")).click();
    driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeWebView[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeTextField[1]")).sendKeys("mamin@mdm05.onmicrosoft.com");
    driver.findElement(By.name("return")).click();
    driver.findElement(By.name("Subject")).click();
    driver.findElement(By.name("Subject")).sendKeys("Subject of mail");
    //driver.findElement(By.name("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextView[1]")).sendKeys("Subject");
    driver.findElement(By.name("Add Attachments")).click();
    driver.findElement(By.name("Docs")).click();
    driver.findElement(By.name("My Docs Folder")).click();
    driver.findElement(By.name("do")).click();
    driver.findElement(By.name("Download")).click();
    driver.findElement(By.name("Attach")).click();
    driver.findElement(By.name("Send")).click();

}
}
