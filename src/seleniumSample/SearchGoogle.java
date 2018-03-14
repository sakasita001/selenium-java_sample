package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchGoogle extends SampleTest {

	public SearchGoogle() {
		super();
	}

	public void searchGoogle() throws InterruptedException {
		driver.get("http://www.google.com");
		Thread.sleep(5000); // Let the user actually see something!
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("ChromeDriver");
		searchBox.submit();
		Thread.sleep(5000); // Let the user actually see something!
		driver.quit();
	}

}
