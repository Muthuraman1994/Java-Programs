import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DragAndDrop {


	public static void main(String[] args) throws AWTException, InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Sel\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();			

		//		driver.get("https://www.greenstech.in/index.html");

		/*String title = driver.getTitle();
			System.out.println(title);
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);*/
		/*driver.manage().window().maximize();

		WebElement findCourse = driver.findElement(By.xpath("(//a[text()='Courses '])[1]"));

		Actions action1 = new Actions(driver);
		action1.moveToElement(findCourse).perform();

		WebElement findOracle = driver.findElement(By.xpath("//a[text()='Oracle Training ']"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(findOracle).perform();

		WebElement findDBA = driver.findElement(By.xpath("//a[contains(text(),'Oracle DBA')]"));
		findDBA.click();


		//div[@id='client-logo']

		WebElement GetContact = driver.findElement(By.xpath("//div[@id='pageHeader']"));

		String text = GetContact.getText();

		System.out.println(text);*/

		/*driver.get("https://www.google.com/");



		WebElement gmail = driver.findElement(By.xpath("(//a[@class='gb_d'])[1]"));

		Actions action1 = new Actions(driver);
		action1.contextClick(gmail).perform();*/

		/*Robot stepdown = new Robot();

		stepdown.keyPress(KeyEvent.VK_DOWN);
		stepdown.keyRelease(KeyEvent.VK_DOWN);

		stepdown.keyPress(KeyEvent.VK_DOWN);
		stepdown.keyRelease(KeyEvent.VK_DOWN);

		stepdown.keyPress(KeyEvent.VK_ENTER);
		stepdown.keyRelease(KeyEvent.VK_ENTER);*/


		/*Robot stepdown = new Robot();

		for (int i = 1; i <=6; i++) {

			stepdown.keyPress(KeyEvent.VK_DOWN);
			stepdown.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
		}

		stepdown.keyPress(KeyEvent.VK_ENTER);
		stepdown.keyRelease(KeyEvent.VK_ENTER);
		 */

		
/*		driver.get("https://www.flipkart.com/");


		WebElement Login = driver.findElement(By.xpath("(//input[contains(@class,'2IX')])[1]"));
		Login.sendKeys("muthu@gmail.com");
		
		Actions action1 = new Actions(driver);
		action1.doubleClick(Login).perform();
		action1.contextClick(Login).perform();
		
		Robot selectMail = new Robot();
		
		for (int i = 1; i <= 6; i++) {
			
			selectMail.keyPress(KeyEvent.VK_DOWN);
			selectMail.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
		}
		
		
		selectMail.keyPress(KeyEvent.VK_ENTER);
		selectMail.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		Robot copyMail = new Robot();
		
		for (int i = 1; i <= 4; i++) {
			
			copyMail.keyPress(KeyEvent.VK_DOWN);
			copyMail.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
		}
		
		
		copyMail.keyPress(KeyEvent.VK_ENTER);
		copyMail.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		WebElement Password = driver.findElement(By.xpath("(//input[contains(@class,'2IX')])[2]"));
		Password.click();
		Actions action2 = new Actions(driver);
		action2.contextClick(Password).perform();
		
		Robot pasteMail = new Robot();
		
		for (int i = 1; i <= 4; i++) {
			
			pasteMail.keyPress(KeyEvent.VK_DOWN);
			pasteMail.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
		}
		
		
		pasteMail.keyPress(KeyEvent.VK_ENTER);
		pasteMail.keyPress(KeyEvent.VK_ENTER);*/
		
		
		
		
		/*driver.get("https://www.flipkart.com/");


		WebElement Login = driver.findElement(By.xpath("(//input[contains(@class,'2IX')])[1]"));
		Login.sendKeys("muthu@gamail.com");
		
		Actions action1 = new Actions(driver);
		action1.doubleClick(Login).perform();

		Robot copyMail = new Robot();
		copyMail.keyPress(KeyEvent.VK_CONTROL);
		copyMail.keyPress(KeyEvent.VK_A);
		copyMail.keyRelease(KeyEvent.VK_CONTROL);
		copyMail.keyRelease(KeyEvent.VK_A);
		Thread.sleep(1000);
		copyMail.keyPress(KeyEvent.VK_CONTROL);
		copyMail.keyPress(KeyEvent.VK_X);
		copyMail.keyRelease(KeyEvent.VK_CONTROL);
		copyMail.keyRelease(KeyEvent.VK_X);*/

		/*WebElement Password = driver.findElement(By.xpath("(//input[contains(@class,'2IX')])[2]"));
		Password.click();
		
		Robot pasteMail = new Robot();
		pasteMail.keyPress(KeyEvent.VK_CONTROL);
		pasteMail.keyPress(KeyEvent.VK_V);
		pasteMail.keyRelease(KeyEvent.VK_CONTROL);
		pasteMail.keyRelease(KeyEvent.VK_V);*/
		
//		Password.sendKeys("Muthu@99");

		/*WebElement Loginbtn = driver.findElement(By.xpath("(//button[contains(@class,'_2K')])[2]"));
		Loginbtn.click();
		Thread.sleep(3000);

		driver.manage().window().maximize();

		WebElement Homemouseover = driver.findElement(By.xpath("(//img[contains(@class,'396')])[1]"));

		Actions actions1 = new Actions(driver);
		actions1.contextClick(Homemouseover).perform();
		Thread.sleep(3000);

		Robot OpenNewTab = new Robot();
		OpenNewTab.keyPress(KeyEvent.VK_DOWN);
		OpenNewTab.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		OpenNewTab.keyPress(KeyEvent.VK_DOWN);
		OpenNewTab.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		OpenNewTab.keyPress(KeyEvent.VK_ENTER);
		OpenNewTab.keyRelease(KeyEvent.VK_ENTER);*/
		
		/*driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement btnAlertWithTextbox = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		btnAlertWithTextbox.click();
		
		WebElement btnPromptBox = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		btnPromptBox.click();
	
		
		Alert alertText = driver.switchTo().alert();
		alertText.sendKeys("Muthu");
		Thread.sleep(2000);
		alertText.accept();
		Thread.sleep(2000);
		
		WebElement Text = driver.findElement(By.xpath("//p[@id='demo1']"));
		
		String text2 = Text.getText();
		System.out.println(text2);	*/
		
//		driver.get("http://demo.automationtesting.in/Register.html");
//		driver.manage().window().maximize();
//		
//		WebElement skillsDropDown = driver.findElement(By.xpath("//select[@id='Skills']"));
//		
//		Select select = new Select(skillsDropDown);
		
//		select.selectByIndex(10);
//		Thread.sleep(2000);
//		select.selectByValue("Art Design");
//		Thread.sleep(2000);
//		select.selectByVisibleText("AutoCAD");
//		Thread.sleep(2000);
		
//		List<WebElement> dropDownList = select.getOptions();
//		
//		int size = dropDownList.size();
//		System.out.println(size);
//		
//		for (WebElement allOptions : dropDownList) {
//			
//			System.out.println(allOptions.getText());
//		}
//		
//		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
//		
//		for (int i = 0; i < dropDownList.size(); i++) {
//			
//			WebElement list = dropDownList.get(i);
//			System.out.println(list.getText());
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		WebElement skillsDropDown = driver.findElement(By.id("cars"));
		
		Select select = new Select(skillsDropDown);
		
		boolean multiple = select.isMultiple();
		
		
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
