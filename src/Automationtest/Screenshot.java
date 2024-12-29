package Automationtest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement username= driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username.sendKeys("Admin");
		WebElement pwd= driver.findElement(By.xpath("//input[@name=\"password\"]"));
		pwd.sendKeys("admin123");
		WebElement submit= driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File ds=new File("C:\\Users\\LENOVO\\Downloads\\Screenshot\\img.png");
		FileUtils.copyFile(src, ds);	
		submit.click();
		Thread.sleep(3000);
		WebElement Buzz=driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Buzz']"));
		Buzz.click();
		Thread.sleep(2000);
		WebElement text=driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
		text.sendKeys("Saurabh  sharma");
		File src1=ts.getScreenshotAs(OutputType.FILE);
		File ds1=new File("C:\\Users\\LENOVO\\Downloads\\Screenshot\\img1.png");
		FileUtils.copyFile(src1, ds1);
		
		
		

	}

}
