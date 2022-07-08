import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AlertExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Sel2\\Driver\\selenium-server-4.1.3.jar");
	
		WebDriver driver = new ChromeDriver();
		
		
//		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		/*WebElement btnAlertWithTextbox = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		btnAlertWithTextbox.click();
		
		WebElement btnPromptBox = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		btnPromptBox.click();*/
		
//		driver.get("https://demoqa.com/select-menu");
//		
//		driver.manage().window().maximize();
//		
//		WebElement skillsDropDown = driver.findElement(By.id("cars"));
//		
//		Select select = new Select(skillsDropDown);
//		
//		boolean multiple = select.isMultiple();
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		driver.manage().window().maximize();
		
		WebElement friuts = driver.findElement(By.id("friuts"));
		
		Select select = new Select(friuts);
		
		boolean multiple = select.isMultiple();
		
		for (int i = 0; i < 4; i++) {
			
			if(multiple==true) {
				
				select.selectByIndex(i);
			}
			
		}
		
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		
		for (WebElement data : allSelectedOptions) {
			
			System.out.println(data.getText());
		}
		
			
			
	}
}
