package december2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Isenabled {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://www.leafground.com/pages/checkbox.html");
	
	
	//To check the element is enabled or not
	//note:it generally shows true for everything but disables the input
	
	boolean enabled = driver.findElement(By.xpath("//input[@type='checkbox']")).isEnabled();
	System.out.println(enabled);
}
}
