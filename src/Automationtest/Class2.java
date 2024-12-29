package Automationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

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
		submit.click();
		Thread.sleep(2000);
		WebElement bz= driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[12]"));
		bz.click();
		Thread.sleep(5000);
		WebElement comment= driver.findElement(By.xpath("//textarea[@class=\"oxd-buzz-post-input\"]"));
		comment.click();
		comment.sendKeys("My name is saurabh sharma");
		WebElement post= driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main\"]"));
		post.submit();
		

	}

}
