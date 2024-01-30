package velocity.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
		WebElement firstname=driver.findElement(By.name("firstname"));
		firstname.sendKeys("IshuBoy");
		
		WebElement lastname=driver.findElement(By.name("lastname"));
		lastname.sendKeys("Badshah");
		
		WebElement email=driver.findElement(By.name("reg_email__"));
		email.sendKeys("aa@gmail");
		
		
		
		//by partial link  text
		
		WebElement cookiepolicy=driver.findElement(By.partialLinkText("Coo"));
		cookiepolicy.click();
		
		//by xpath selecting textbutton
		
		WebElement fn=driver.findElement(By.xpath("//input[@name='firstname']"));
		fn.sendKeys("typed by xpath");
		
		//by xpath radio button
		
		//WebElement femaleradiobutton=driver.findElement(By.xpath("//input[@value='1']"));
		WebElement f=driver.findElement(By.xpath("//input[@value='1']"));
		f.click();
		
		//customisation of xpath by 1..contains
		
		
		WebElement fname=driver.findElement(By.xpath("//input[contains(@id,'u_0_d_')]"));
		fname.sendKeys("typing using xpsath customisation");
		
		
		//2..indexing for age //index starts form 1 for element

		WebElement age=driver.findElement(By.xpath("//input[@type='text'][1]"));
		age.sendKeys("rao");
		
		//3..starts wioth
		WebElement mail=driver.findElement(By.xpath("//input[starts-with(@name,'reg')][1]"));
		mail.sendKeys("rao@gmail");
		
		
		//driver.navigate().refresh();
	//	driver.close();
	}

}
