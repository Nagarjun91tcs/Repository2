package artifacttdynew.artifacttdynew;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Testcase001_new {

	@Test
	public void Tc001_new() throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://acme-test.uipath.com/account/login");
		
		
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		
		driver.findElementById("password").sendKeys("leaf@12");
		
		driver.findElementById("buttonLogin").click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//button[text()[normalize-space()='Vendors']]").click();
		
		//driver.findElementByXPath("(//button[contains(@class,'btn btn-default')])[5]").click();
		
		
		
		WebElement elenew = driver.findElementByXPath("//button[text()[normalize-space()='Vendors']]");
	    Actions obj = new Actions(driver);
	    obj.moveToElement(elenew).perform();
	     
		
		driver.findElementByLinkText("Search for Vendor").click();
		
	    driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		
		driver.findElementById("buttonSearch").click();
		
		
         WebElement table = driver.findElementByXPath("//table[@class='table']");
		
		//byTagName("tr")
		
		 List<WebElement> allRows = table.findElements(By.tagName("tr"));
		// System.out.println(allRows.size());
		
		 for (int i = 1; i < allRows.size(); i++) {
			//WebElement thirdrow = allRows.get(i);
			List<WebElement> allCOls = table.findElements(By.tagName("td"));
			//System.out.println(allCOls.size());
			String text = allCOls.get(4).getText();
			
		     System.out.println(text);
		}
		
		 driver.findElementByLinkText("Log Out").click();
		 
		 driver.close();
		
    /*   List<WebElement> ele = driver.findElementsByXPath("//td[text()='Blue Lagoon']");
		
       //driver.findElement(By.xpath("//td[text()='Blue Lagoon']")).click();
		
		//List<Integer> Is = new ArrayList<Integer>();
		
       System.out.println(ele);
	    
	    for(WebElement ele1 : ele) {

	    System.out.println(ele1);
	    	
	    }*/

		

	}
	
}
