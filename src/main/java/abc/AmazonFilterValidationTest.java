package abc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonFilterValidationTest {
	public static void main(String args[]) {
		
		
		//Set the path to your EdgeDriver
				System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\Downloads\\msedgedriver.exe");

		//Create a new instance of the Edge driver	
			WebDriver driver = new EdgeDriver();
			
		// Navigate to Amazon.in
	        driver.get("https://www.amazon.in");
	        driver.manage().window().maximize();

	    // Find the search input field by its name and enter "phone"
	        WebElement searchInput = driver.findElement(By.id("twotabsearchtextbox"));
	        searchInput.sendKeys("phone");

	    // Find the search button by its ID and click it
	        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
	        searchButton.click();
	        
	     // Apply filters (you can modify this part based on your specific filters)
	        WebElement filterCheckbox = driver.findElement(By.xpath("//span[text()='Brand']"));
	        filterCheckbox.click();
	        ///ancestor::li//input
	     // Wait for some time for the results to be filtered (you might want to use WebDriverWait in a real scenario)

	     // Validate the filtered list
	        List<WebElement> filteredResults = driver.findElements(By.xpath("//div[@data-asin]"));
	        if (!filteredResults.isEmpty()) {
	            System.out.println("Filtered list validation successful. Results are displayed.");

	      // You can further interact with the filtered results if needed
	      // ...

	        } else {
	            System.out.println("Filtered list validation failed. No results found.");
	        }

	        // Close the browser
	        driver.quit();
			
			
			
}
}
