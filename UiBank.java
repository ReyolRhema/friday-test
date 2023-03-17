package seleniumclasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class UiBank {
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://uibank.uipath.com/register-account'");
		
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//small[text()='Register For Account']")).click();
		driver.findElement(By.id("firstName")).sendKeys("reyol");
		
		WebElement before = driver.findElement(By.name("title"));
       Select dropdown = new Select(before);
       dropdown.selectByVisibleText("Mr");
       
       driver.findElement(By.id("middleName")).sendKeys("rio");
       driver.findElement(By.id("lastName")).sendKeys("rhema");
        WebElement choose= driver.findElement(By.name("gender"));
       Select dropdown1 = new Select (choose);
       dropdown1.selectByVisibleText("Male");
       
       driver.findElement(By.id("employmentStatus")).sendKeys("fresher");
       driver.findElement(By.name("username")).sendKeys("reyolrhema");
       
       driver.findElement(By.name("email")).sendKeys("reyol@gmail.com");
       driver.findElement(By.name("password")).sendKeys("reyol");
       
       driver.close();
	
	}

}
