import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestJunit1 {
	// global, so all methods can use
	static WebDriver driver;

	@Test
	public void validAllBoxChecked() throws InterruptedException {
		// Set Chrome Driver Properties
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		// Create ChromeDriver object and launch chrome browser
		WebDriver driver = new ChromeDriver();

		driver.get("http://techfios.com/test/101/");

			//TA=ToggleAll
		WebElement TA = driver.findElement(By.name("allbox"));
		TA.click();
			//AB=AllBoxes
		WebElement AB = driver.findElement(By.xpath("//input[contains(@name,'todo')]"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(AB));
		Assert.assertTrue("Error", AB.isSelected());
		
	}
}
