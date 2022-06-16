package MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver= new ChromeDriver();
driver.get("https://demoapp.skillrary.com/");
Thread.sleep(3000);
          driver.findElement(By.partialLinkText("munit")).click();
          Thread.sleep(3000);
          driver.findElement(By.id("add")).click();
          driver.findElement(By.id("add")).click();
         
          
          Thread.sleep(3000);
          driver.findElement(By.className(" fa fa-shopping-cart")).click();
          
		

	}

}
