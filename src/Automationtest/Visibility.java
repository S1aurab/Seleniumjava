package Automationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Visibility {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(2000);
			WebElement username= driver.findElement(By.xpath("//input[@name=\"username\"]"));
			username.sendKeys("Admin");
			WebElement pwd= driver.findElement(By.xpath("//input[@name=\"password\"]"));
			pwd.sendKeys("admin123");
			WebElement submit= driver.findElement(By.xpath("//button[@type=\"submit\"]"));
			if(submit.isDisplayed()) {
			submit.click();
	}
			WebElement Myinfo=driver.findElement(By.xpath("//span[normalize-space()='My Info']"));
			Myinfo.click();
			WebElement Male=driver.findElement(By.xpath("//label[normalize-space()='Male']//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']"));
			WebElement Female=driver.findElement(By.xpath("//label[normalize-space()='Female']//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']"));
      if(Female.isSelected()) {
    	  Male.click();
      }
      else {
    	  Female.click();
    	  
      }
}}
