          import java.util.Iterator; 
          import java.util.Set;
          import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys; 
		  import org.openqa.selenium.WebDriver; 
		  import org.openqa.selenium.WebElement; 
		  import org.openqa.selenium.chrome.ChromeDriver;
		  
		  public class Demo2{
		  
		  public static void main(String[] args) throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse\\chromedriver_win32\\chromedriver.exe"); 
		  WebDriver driver =new ChromeDriver();
		  
		  
		  driver.get("https://www.makemytrip.com/");
		  driver.findElement(By.id("fromCity")).click();
		  Thread.sleep(5000L);
		  driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("mum");
		  Thread.sleep(5000L);

		  driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.DOWN);
		  driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.DOWN);
		  System.out.println();
		//div[@class='hsw_autocomplePopup autoSuggestPlugin']/div[1]/input
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  String script="return document.getElementsByClassName(\"react-autosuggest__input react-autosuggest__input--open\").value;";
		  String out=(String) js.executeScript(script);
		  System.out.println(out);
		  }
		  }
		  