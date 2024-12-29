package Automationtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement a1= driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		a1.click();
		Alert a= driver.switchTo().alert();
		a.accept();
		 WebElement alert1=driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
		alert1.click();
		WebElement a2=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		a2.click();
		driver.switchTo().alert();
		a.dismiss();
		WebElement a3=driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']"));
		a3.click();
		WebElement alert3=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		alert3.click();
		driver.switchTo().alert();
		a.sendKeys("Saurabh sharma");
		a.accept();
		

	}

}
