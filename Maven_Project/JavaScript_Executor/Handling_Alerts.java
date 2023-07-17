package Actions_Classes;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alerts 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		d.get("https://the-internet.herokuapp.com/javascript_alerts");
		//ClickJSAlert
		By ClickJsAlert=By.xpath("//button[text()='Click for JS Alert']");
		WebElement ClickJsAlertRef=d.findElement(ClickJsAlert);
		ClickJsAlertRef.click();
		d.switchTo().alert().accept();
		Thread.sleep(2000);
		
		//ClickToConfirm
		By ClickConfirm=By.xpath("//button[text()='Click for JS Confirm']");
		WebElement ClickConfirmRef=d.findElement(ClickConfirm);
		ClickConfirmRef.click();
		d.switchTo().alert().accept();
		//d.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		//ClickToJSPromat
		By ClickPromat=By.xpath("//button[text()='Click for JS Prompt']");
		WebElement ClickPromatRef=d.findElement(ClickPromat);
		ClickPromatRef.click();
		Alert AlertWindow=d.switchTo().alert();
		System.out.println("Message Displyed :"+AlertWindow.getText());
		AlertWindow.sendKeys("Welcome");
		AlertWindow.accept();
		
		
		
		
	}

}
