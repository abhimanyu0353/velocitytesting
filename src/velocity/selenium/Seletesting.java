package velocity.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Seletesting {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); //this will launch browser
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.close();
	}

}
