package Capture_ScreenShot_Scripts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Screenshot
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		d.get("https://www.flipkart.com/");

		By ClickOnCross=By.xpath("//button[text()='✕']");
		WebElement ClickOnCrossRef=d.findElement(ClickOnCross);
		ClickOnCrossRef.click();
		//CaptureForFullScreenShot
		/*File f=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(f, new File("E:\\Screenshots\\Flipkart.jpg"));*/
		//div[@class='InyRMC _3Il5oO']
        
		//CaptureParticularBox
		/*	By OptionBlock=By.xpath("//div[@class='InyRMC _3Il5oO']");
		WebElement OptionBlockRef =d.findElement(OptionBlock);
		WebElement section=OptionBlockRef;

		File f=section.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(f, new File("E:\\Screenshots\\Flipkart1.jpg"));*/

        //CaptureParticularElements
		By logo=By.xpath("//img[@title='Flipkart']");
		WebElement logoRef=d.findElement(logo);
		WebElement flipkartlogo=logoRef;

		File f=flipkartlogo.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(f, new File("E:\\Screenshots\\FlipkartLogo.jpg"));






	}

}
