package december2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerificationBrowser {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://www.leafground.com/");
		
		//To get the Title
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//To get the currenturl
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//To get the pagesource
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	
	
	
	
	
	
	
	
	}
	
		

}
