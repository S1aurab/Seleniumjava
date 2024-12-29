package Automationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Form {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		WebElement Fname= driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		Fname.sendKeys("Saurabh");
		WebElement Lname=driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		Lname.sendKeys("Sharma");
		WebElement Add= driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]"))	;
		Add.sendKeys("California");
		WebElement email=driver.findElement(By.xpath("//input[@type=\"email\"]"));
		email.sendKeys("ghwewhb@gmail.com");
		WebElement phn=driver.findElement(By.xpath("//input[@type=\"tel\"]"));
		phn.sendKeys("5467778");
		WebElement gender=driver.findElement(By.xpath("//input[@type=\"radio\"][1]"));
		gender.click();
		WebElement hobbies=driver.findElement(By.xpath("//input[@type=\"checkbox\"][1]"));
		hobbies.click();
		WebElement Lang=driver.findElement(By.xpath("//div[@id='msdd']"));
		Select se= new Select(Lang);
		se.selectByVisibleText("French");
		
		
		
		
		
		}

}
