package december2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttribute {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://www.leafground.com/pages/Button.html");
		
		
		
		
		  //To get the value filled in the text box--use getAttribute
		  
		  String attribute =driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");
		  System.out.println(attribute);
		 
		 
		
		
	}

}
