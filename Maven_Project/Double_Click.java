package Actions_Classes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click 
{

	public static void main(String[] args)
	{
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		d.get("http://omayo.blogspot.com/");
		
		By Doubleclick=By.xpath("//button[text()=' Double click Here   ']");
		WebElement DoubleclickRef=d.findElement(Doubleclick);
		
		
		//ObjectForActionsClass
		Actions act=new Actions(d);
		act.doubleClick(DoubleclickRef).build().perform();

	}

}
