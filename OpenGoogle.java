package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Jars\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new 	ChromeDriver();
		driver.get("http:\\www.google.co.in");
		
		driver.findElement(By.name("q")).sendKeys("POWER RANGERS"+Keys.ENTER);
		driver.findElement(By.linkText("Wikipedia")).click();
		
		
		Forking this code to add new feautures


			lets learn to resolve a merge conflict
		
			
			
			This is  Jawahar's Commit to Learn Merge conflict 
			
			
			fixed the click operation bug


		
		

	}

}
