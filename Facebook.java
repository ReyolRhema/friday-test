package seleniumclasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/'");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("reyol");
		driver.findElement(By.name("lastname")).sendKeys("rhema");
		driver.findElement(By.name("reg_email__")).sendKeys("reyol@gmail");
		driver.findElement(By.name("reg_passwd__")).sendKeys("reyolrhema");
		

		
	WebElement totaldays= driver.findElement(By.id("day"));
			Select dropdown = new Select(totaldays);
	dropdown.selectByVisibleText("2");
	
	WebElement totalmonths= driver.findElement(By.name("birthday_month"));
	 Select dropdown1 = new Select(totalmonths);
	 dropdown1.selectByVisibleText("Aug");
	 
	WebElement totalyears =driver.findElement(By.name("birthday_year"));
	Select dropdown2 =new Select(totalyears);
	dropdown2.selectByVisibleText("2000");
	
	driver.findElement(By.xpath("//label[text()='Male']")).click();
	
	driver.close();
	
	 
	 
	
	
	
	
	
	
	
		
		
		
	}

}
