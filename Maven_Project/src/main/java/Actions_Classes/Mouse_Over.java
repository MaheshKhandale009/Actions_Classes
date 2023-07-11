package Actions_Classes;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Over
{

	public static void main(String[] args) 
	{
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		d.get("https://www.flipkart.com/");
		By X=By.xpath("//button[text()='✕']");
		WebElement XRef=d.findElement(X);
		XRef.click();
		
        
		By Fashion=By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[1]/div/img");
		WebElement FashionRef=d.findElement(Fashion);
		
		
		Actions action=new Actions(d);
		action.moveToElement(FashionRef).perform();
	}

}
