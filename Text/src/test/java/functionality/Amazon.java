package functionality;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.Elements;

public class Amazon {

	@Test(priority=0)
	public void registrationPage() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dilip\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1 = new ChromeDriver();
		d1.get("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fdp%2FB07Z8PWC6R%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		d1.manage().window().maximize();
		Elements.name(d1).sendKeys("gokulavani");
		Elements.mobile(d1).sendKeys("gokielayarani@gmail.com");
		Elements.pwd(d1).sendKeys("Nagu@123");
		Elements.rePwd(d1).sendKeys("Nagu@123");
		Elements.cont(d1).click();

		d1.close();	
	}
	
	@Test(priority=1)
	public void loginPage() throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dilip\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1 = new ChromeDriver();
		d1.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		d1.manage().window().maximize();
		Elements.signin(d1).sendKeys("9384155571");
		Elements.signCont(d1).click();

		Elements.password(d1).sendKeys("Nagu@123");
		Elements.signinSubmit(d1).click();
		
		Robot r1=new Robot();
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(dim);
		BufferedImage source=r1.createScreenCapture(rect);
		File destination=new File("C:\\Users\\Dilip\\Desktop\\login\\loginn.jpg");
		ImageIO.write(source, "png", destination);
	
		
		d1.close();

	}
	
	@Test(priority=2)
	public void searchPage() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dilip\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1= new ChromeDriver();

		//d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d1.get("https://www.amazon.in/");
		d1.manage().window().maximize();

		//WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
		Elements.searchbox(d1).sendKeys("Iphone x");
		//searchBox.submit();
		Elements.Submit(d1).click();
		Elements.link(d1).click();
	    d1.close();
	}
	
	@Test(priority=3)
	public void addCart() throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dilip\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1= new ChromeDriver();
		d1.get("https://www.amazon.in/New-Apple-iPhone-XR-64GB/dp/B08L8D44ZM/ref=sr_1_1_sspa?crid=2IC0DKBZ0EJ1P&keywords=Iphone+x&qid=1642405655&sprefix=iphone+x%2Caps%2C1041&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEyMkhKTEZSRjFaNDk5JmVuY3J5cHRlZElkPUEwMTk0NDM2TUxFT0I4M0oyOFI5JmVuY3J5cHRlZEFkSWQ9QTA0Nzg4NjkzTzdBWVg4NENLU0pEJndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==");
		d1.manage().window().maximize();	
	    
		JavascriptExecutor jse1=(JavascriptExecutor) d1;
		jse1.executeScript("scroll(0,250)");
		Elements.cart(d1).click();
		Robot r1=new Robot();
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(dim);
		BufferedImage source=r1.createScreenCapture(rect);
		File destination=new File("C:\\Users\\Dilip\\Desktop\\login\\cart.jpg");
		ImageIO.write(source, "png", destination);
	}

}
