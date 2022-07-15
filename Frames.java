import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Frames {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();			

//		driver.get("https://www.facebook.com/");
		
		/*driver.switchTo().frame("frame1");
		driver.findElement(By.tagName("input")).sendKeys("muthu");
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();;*/
		
		
		/*WebElement LoginTxt = driver.findElement(By.id("email"));
		WebElement PassTxt = driver.findElement(By.id("pass"));
		WebElement LoginButton = driver.findElement(By.name("login"));
	
		
		JavascriptExecutor Execute = (JavascriptExecutor) driver;
		
		Execute.executeScript("arguments[0].setAttribute('value','muthu')", LoginTxt);
		
		Execute.executeScript("arguments[0].setAttribute('value','muthu')", PassTxt);
		
		Object GetUserText = Execute.executeScript("return arguments[0].getAttribute('value')", LoginTxt);
		System.out.println(GetUserText);
		
		Execute.executeScript("arguments[0].scrollIntoView(true)", LoginButton);
		
		Execute.executeScript("arguments[0].click()", LoginButton);*/
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor Executor = (JavascriptExecutor)driver;
		
		WebElement SearchIphone = driver.findElement(By.xpath("//input[@type='text']"));
		
		Executor.executeScript("arguments[0].setAttribute('value','Iphone')", SearchIphone);		
		
		WebElement SearchClick = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		
		Executor.executeScript("arguments[0].click()", SearchClick);
		
		WebElement Scroll1 = driver.findElement(By.xpath("((//span[text()='Apple iPhone 12 (128GB) - Blue'])[1])"));
		
		Executor.executeScript("arguments[0].scrollIntoView(true)", Scroll1);
		
		TakesScreenshot Screenshot1 = (TakesScreenshot)driver;
		
		File SS1 = Screenshot1.getScreenshotAs(OutputType.FILE);
		
		File file = new File("C:\\Users\\hp\\eclipse-workspace\\Sel2\\SS_Folder\\SS1.jpeg");
		
		FileHandler.copy(SS1, file);
		
		Thread.sleep(2000);
		
		WebElement Scroll2 = driver.findElement(By.xpath("//span[text()='Apple iPhone XR (128GB) - (Product) RED']"));
		
		Executor.executeScript("arguments[0].scrollIntoView(true)", Scroll2);
		
		TakesScreenshot Screenshot2 = (TakesScreenshot)driver;
				
		File SS2 = Screenshot2.getScreenshotAs(OutputType.FILE);
		
		File file2 = new File("C:\\Users\\hp\\eclipse-workspace\\Sel2\\SS_Folder\\SS2.jpeg");
		
		FileHandler.copy(SS2, file2);
		
		
		WebElement Scroll3 = driver.findElement(By.xpath("//span[text()='Apple iPhone 12 (64GB) - Black']"));
		
		Executor.executeScript("arguments[0].scrollIntoView(false)", Scroll3);
		
		TakesScreenshot Screenshot3 = (TakesScreenshot)driver;
		
		File SS3 = Screenshot3.getScreenshotAs(OutputType.FILE);
		
		File file3 = new File("C:\\Users\\hp\\eclipse-workspace\\Sel2\\SS_Folder\\SS3.jpeg");
		
		FileHandler.copy(SS3, file3);
		
		
		WebElement Scroll4 = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 Mini (128GB) - Pink']"));
		
		Executor.executeScript("arguments[0].scrollIntoView(true)", Scroll4);
		
		TakesScreenshot Screenshot4 = (TakesScreenshot)driver;
		
		File SS4 = Screenshot4.getScreenshotAs(OutputType.FILE);
		
		File file4 = new File("C:\\Users\\hp\\eclipse-workspace\\Sel2\\SS_Folder\\SS4.jpeg");
		
		FileHandler.copy(SS4, file4);
		
		File file5 = new File("C:\\Users\\hp\\eclipse-workspace\\Sel2\\SS_Folder\\SS5.jpeg");
				
		FileUtils.copyFile(SS4, file5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
