import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestJunit2 {
	// global, so all methods can use
	static WebDriver driver;

	@Test
	public void validAllBoxChecked() throws InterruptedException {
		// Set Chrome Driver Properties
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		// Create ChromeDriver object and launch chrome browser
		WebDriver driver = new ChromeDriver();

		driver.get("http://techfios.com/test/101/");

			//CB5=CheckBox5
		WebElement CB7 = driver.findElement(By.name("todo[7]"));
		CB7.click();
			//RB=RemoveButton
		WebElement RB = driver.findElement(By.xpath("//input[@value='Remove']"));
		RB.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(RB));
		
		
	}
}
