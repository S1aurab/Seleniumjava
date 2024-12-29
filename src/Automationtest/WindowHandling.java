package Automationtest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement instalink = driver.findElement(By.xpath("//a[@title='Take a look at Instagram']"));
		instalink.click();
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		String pw=driver.getWindowHandle();
		Set<String> aw=driver.getWindowHandles();
		for(String i:aw) {
			if(!(pw.equals(i))) {
				driver.switchTo().window(i);
			}
		}
		


		Thread.sleep(5000);
		
		
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys("saurabh");

	}

}
