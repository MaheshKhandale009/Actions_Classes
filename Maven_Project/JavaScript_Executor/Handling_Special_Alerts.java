package Actions_Classes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Special_Alerts 
{

	public static void main(String[] args) 
	{
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		d.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
