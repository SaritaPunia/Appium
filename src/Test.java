import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.ios.IOSDriver;

public class Test extends DriverManager{
	
public void testMethod(){
	IOSDriver driver = DriverManager.getDriver();
	Select select = new Select(driver.findElement(By.id("abs")));
	select.getOptions().size();
	
	
	
	
	
	

}

}
