package december2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	public static ChromeDriver driver;
	
	public void selectAgeGroup(int age) {
		if (age>=1 && age<=20) {
			driver.findElement(By.xpath("(//label[@for='java'])[3]/following-sibling::input[1]")).click();
			System.out.println("The age group 1-20 is selected");
		}else if(age>40) {
			driver.findElement(By.xpath("(//label[@for='java'])[3]/following-sibling::input[3]")).click();
			System.out.println("The age group 40 and above is selected");
		}else {
			boolean selected2 = driver.findElement(By.xpath("(//label[@for='java'])[3]/following-sibling::input[3]")).isSelected();
		if (selected2) {
			System.out.println("The Default age group 21-40 is selected");
		}else {
			System.out.println("The Default age group 21-40 is selected");
		}
		}
	}
	
	public void selectRadioButton(String value) {
		
		if (value.equalsIgnoreCase("yes")) {
			driver.findElement(By.id("yes")).click();
			System.out.println("The button Yes is selected");
		}else if (value.equalsIgnoreCase("no")) {
			driver.findElement(By.id("no")).click();
			System.out.println("The button No is selected");
			
		}

	}
	
	public void defaultRadiobutton() {
		boolean selected = driver.findElement(By.xpath("//label[@for='Unchecked']/input")).isSelected();
		if (selected) {
			System.out.println("The Default Radio button is Unchecked button ");
		} else {
			System.out.println("The Default Radio button is Checked button ");
		}
	}
	public static void main(String[] args) {
        RadioButton radioButton = new RadioButton();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("http://www.leafground.com/");
		driver.findElement(By.xpath("//h5[text()='Radio Button']")).click();

		radioButton.selectRadioButton("yes");
		radioButton.defaultRadiobutton();
		radioButton.selectAgeGroup(18);
		
	}

}
