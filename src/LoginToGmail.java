import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LoginToGmail {
	
	public static void main(String args[]){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("www.gmail.com");
		driver.findElement(By.id("id")).sendKeys("userName");
		driver.findElement(By.id("id")).sendKeys("password");
		driver.findElement(By.id("Login")).click();
		Assert.assertEquals("GMAil", driver.findElement(By.id("id")).getText());
		driver.findElement(By.id("Compose")).click();
		driver.findElement(By.xpath("\\")).sendKeys("EmailAddress");
		driver.findElement(By.name("Subject")).sendKeys("SubjectOfMail");
		
	}

}
