package objectRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements {
	public static WebElement name(WebDriver d1) {
		
		return d1.findElement(By.id("ap_customer_name"));
		
	}
	
	public static WebElement mobile(WebDriver d1) {
		return d1.findElement(By.id("ap_email"));
	}
	
	public static WebElement pwd(WebDriver d1) {
		return d1.findElement(By.id("ap_password"));
	}
	
	public static WebElement rePwd(WebDriver d1) {
		return d1.findElement(By.id("ap_password_check"));
	}
	
	public static WebElement cont(WebDriver d1) {
		return d1.findElement(By.xpath(" //*[@id=\'continue\'] "));
	}
	
	
	public static WebElement signin(WebDriver d1) {
		return d1.findElement(By.id("ap_email"));
	}
	public static WebElement signCont(WebDriver d1) {
		return d1.findElement(By.xpath("//*[@id=\'continue\']"));
	}
	
	public static WebElement password(WebDriver d1) {
		return d1.findElement(By.id("ap_password"));
	}
	public static WebElement signinSubmit(WebDriver d1) {
		return d1.findElement(By.xpath("//*[@id=\'signInSubmit\']"));
	}
	
	public static WebElement searchbox(WebDriver d1) {
		return d1.findElement(By.id("twotabsearchtextbox"));
	}
	public static WebElement Submit(WebDriver d1) {
		return d1.findElement(By.id("nav-search-submit-button"));
	}
	public static WebElement link(WebDriver d1) {
		return d1.findElement(By.linkText("Apple iPhone XR (64GB) - White"));
	}
	
	public static WebElement cart(WebDriver d1) {
		return d1.findElement(By.id("add-to-cart-button"));
	}

}
