package december2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTagname {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://www.leafground.com/pages/Alert.html");
	
	//To get the Tagname
	
	String tagName = driver.findElement(By.xpath("//button[text()='Alert Box']")).getTagName();
	System.out.println(tagName);
}
}
