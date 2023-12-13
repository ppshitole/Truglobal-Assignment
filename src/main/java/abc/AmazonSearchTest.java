package abc;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSearchTest {
	public static void main(String args[]) {
		
		
//Set the path to your EdgeDriver
		System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\Downloads\\msedgedriver.exe");

//Create a new instance of the Edge driver	
	WebDriver driver = new EdgeDriver();
	
// Navigate to Amazon.in
    driver.get("https://www.amazon.in");
    driver.manage().window().maximize();
// Find the search input field by its name and enter "iPhone"
    WebElement searchInput = driver.findElement(By.id("twotabsearchtextbox"));
    searchInput.sendKeys("iPhone");
    
// Find the search button by its ID and click it
    WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
    searchButton.click();
    
 // Ensure the search results page is loaded by checking the page title
    if (driver.getTitle().contains("Amazon.in : iPhone")) {
        System.out.println("Search results page loaded successfully.");
        
 // You can further interact with the search results if needed
 // For example, click on the first result
        WebElement firstResult = driver.findElement(By.xpath("(//span[@class='a-price'])[1]"));
        firstResult.click();       
// Add your logic to proceed to the product details page and store the price in a variable
// ...

    } else {
        System.out.println("Search results page failed to load.");
        
        
	}
	}
}
