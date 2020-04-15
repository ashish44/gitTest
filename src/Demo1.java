
	 import java.util.Iterator; 
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1{

public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse\\chromedriver_win32\\chromedriver.exe"); 
WebDriver driver =new ChromeDriver();


driver.get("https://ksrtc.in/oprs-web/guest/home.do");

driver.findElement(By.xpath("//input[@id='fromPlaceName']")).click();
driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("ben");
Thread.sleep(4000L);
driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);

JavascriptExecutor js= (JavascriptExecutor)driver;

String script="return document.getElementById(\"fromPlaceName\").value;";
String text=(String) js.executeScript(script);

for(int i=0;text.contains("airport");i++)
{
	driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
	String script2="return document.getElementById(\"fromPlaceName\").value;";
	String text2=(String) js.executeScript(script2);
		
}

}
}

