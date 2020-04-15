import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

/*
		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Action;
		import org.openqa.selenium.interactions.Actions;
		import org.openqa.selenium.support.ui.Select;

		public class Demo1 {


		  public static void main(String[] args) throws InterruptedException {
		  // TODO Auto-generated method stub

		   System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver =new ChromeDriver();
		       
		  
		  driver.get("https://www.cleartrip.com/");
		  Select adult = new Select(driver.findElement(By.xpath("(//dl[@class='vertical'])[4]/dd[1]/select[1]")));
		  
		adult.selectByVisibleText("4");
		Select child = new Select(driver.findElement(By.xpath("(//dl[@class='vertical'])[5]/dd[1]/select[1]")));
		child.selectByVisibleText("2");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-active')]")).click();
		driver.findElement(By.linkText("More options: Class of travel, Airline preference")).click();
		driver.findElement(By.xpath("//input[@id='AirlineAutocomplete']")).sendKeys("indigo");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		  
		  
		 
		  //driver.get("http://spicejet.com"); //URL in the browser
		  
		  /*
		  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		  driver.findElement(By.xpath("//a[@value='DEL']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		  driver.findElement(By.xpath("//a[contains(@class,'highlight')]")).click();
		     Thread.sleep(2000L);
		  
		     driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		  Thread.sleep(3000L);
		  driver.findElement(By.xpath("//div[@id='divpaxOptions']/div[2]/p[1]/select[1]")).click();                          
		  driver.findElement(By.xpath("//div[@id='divpaxOptions']/div[2]/p[1]/select[1]/option[4]")).click();                          
		 
		  
		  
		  
		  
		  //Select s=new Select(driver.findElement(By.xpath("(//select[@class='wMed1s required guests'])[1]")));
		        //s.selectByValue("4");
		       
		       
		 
		  
		  
		  
		  
		  /*if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		  {
		  System.out.println("its disabled");
		  Assert.assertTrue(true);
		  }
		  else
		  {
		  Assert.assertTrue(false);
		  }
		  //driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		  
		     Thread.sleep(2000L);
		  for(int i=1;i<5;i++)
		  {
		  driver.findElement(By.id("hrefIncAdt")).click();
		  }
		  driver.findElement(By.id("btnclosepaxoption")).click();
		  Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		  System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		  // driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		  driver.findElement(By.cssSelector("input[value='Search']")).click();
		  // driver.findElement(By.xpath("//input[@value='Search']")).click();
		  // driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		  */
		  
		  
		  
		  
		  //String s=new String(driver.findElement(By.xpath("//li[@id='header-vacations']/a[1]")).getAttribute("href"));
		      //WebElement ab= driver.findElement(By.xpath("//li[@id='header-vacations']/a[1]"));
		  
		    
		  // driver.findElement(By.xpath("//li[@id='header-vacations']/a[1]")).sendKeys(Keys.);
		  
		  //WebElement newLocator= driver.findElement(By.xpath("//li[@id='header-vacations']/a[1]"));
		  
		  
		  //Actions a= new Actions(driver).moveToElement(newLocator);
		  //a.contextClick().perform();
		  //Thread.sleep(3000);
		  //String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		 
		  
		   
		  //String selectLinkOpeninNewTabs = Keys.chord(Keys.CONTROL,"t");
		  
		 
		  //driver.findElement(By.linkText("DEALS")).sendKeys(selectLinkOpeninNewTabs);
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  //driver.switchTo();
		  
		  //Thread.sleep(3000);
		  
		  
		  //driver.findElement(By.xpath("//input[@type='submit']")).click();
		  //a.keyDown(Keys.CONTROL).sendKeys("t").build().perform();
		  
		  
		  //a.contextClick().sendKeys(Keys.ARROW_DOWN).perform();
		  
		  //a.moveToElement(driver.findElement(By.xpath("//li[@id='header-vacations']/a[1]"))).perform();
		        //WebElement sa = driver.findElement(By.xpath("//li[@id='header-vacations']/a[1]"));
		          
		  
		 
		 /*
		  * package seleniumIntro;
		  import org.openqa.selenium.By;
		  import org.openqa.selenium.WebDriver;
		  import org.openqa.selenium.chrome.ChromeDriver;
		  import org.testng.Assert;

		  public class TestCase3 {

		  public static void main(String[] args) throws InterruptedException {
		  // TODO Auto-generated method stub

		  System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		  WebDriver driver =new ChromeDriver();
		  driver.get("http://spicejet.com"); //URL in the browser
		  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		  driver.findElement(By.xpath("//a[@value='DEL']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		  driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		  if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		  {
		  System.out.println("its disabled");
		  Assert.assertTrue(true);
		  }
		  else
		  {
		  Assert.assertTrue(false);
		  }
		  driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		  driver.findElement(By.id("divpaxinfo")).click();
		     Thread.sleep(2000L);
		  for(int i=1;i<5;i++)
		  {
		  driver.findElement(By.id("hrefIncAdt")).click();
		  }
		  driver.findElement(By.id("btnclosepaxoption")).click();
		  Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		  System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		  // driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		  driver.findElement(By.cssSelector("input[value='Search']")).click();
		  // driver.findElement(By.xpath("//input[@value='Search']")).click();
		  // driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		  }
		 
		 }
		  */
		 
		 
		 
		 /*
		  * package seleniumIntro;
		import java.util.Arrays;
		import java.util.List;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;
		import org.testng.Assert;

		public class TestCase3 {
		 public static void main(String[] args) throws InterruptedException {
		  // TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\Selenium_eclipse\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		 
		 String[] items = {"Carrot","Beans","Raspberry","Tomato"};
		 List itemsList=Arrays.asList(items);
		 
		 int i=0;
		   int j=0;
		 List<WebElement> list = driver.findElements(By.cssSelector("h4.product-name"));
		 
		 
		    int a= list.size();
		    int b=itemsList.size();
		    System.out.println(a);
		    System.out.println(b);
		    System.out.println(itemsList.get(0).toString());
		   
		   // driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(2).click();
		   
		   for(j=0;j<b;j++)
		{
		    for(i=0;i<a;i++)
		 {
		  
		  String itemsListitem=itemsList.get(j).toString();
		    String listname= list.get(i).getText();
		 
		   
		 if(listname.contains(itemsListitem))
		 {
		  driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		  Thread.sleep(2000); 
		 }
		 
		 }
		 
		}
		//driver.findElement(By.xpath("(//div[@class='product']"));
		  
		 
		 }
		}

		  */
		 
		}
		 
		  /*
		   *   package seleniumIntro;
		import java.util.Arrays;
		import java.util.List;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;
		import org.testng.Assert;

		public class Test1 {
		 public static void main(String[] args) throws InterruptedException {
		  // TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\Selenium_eclipse\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		 
		 String[] items = {"Pumpkin","Carrot","Onion","Raspberry"};
		 List itemsList=Arrays.asList(items);
		 
		 List<WebElement> list = driver.findElements(By.cssSelector("h4.product-name"));
		 
		 
		   // driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(2).click();
		   
		   for(int j=0;j<itemsList.size();j++)
		{
		    for(int i=0;i<list.size();i++)
		 {
		  
		  String itemsListitem=itemsList.get(j).toString();
		    String listname= list.get(i).getText();
		 
		   
		 if(listname.contains(itemsListitem))
		 {
		  System.out.println(itemsListitem);
		  driver.findElements(By.xpath("//button[@type='button']")).get(i+1).click();
		  Thread.sleep(2000);
		  
		 }
		 
		 }
		 
		}
		//driver.findElement(By.xpath("(//div[@class='product']"));
		  
		 
		 }
		}
		/*
		 * package seleniumIntro;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;
		import org.testng.Assert;
		public class TestCase2 {
		 public static void main(String[] args) {
		  // TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\Selenium_eclipse\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		   //driver.get("https://www.google.com/");
		   //System.out.println(driver.getCurrentUrl());
		   //System.out.println(driver.getTitle());
		   //driver.get("http://yahoo.com");
		   //driver.navigate().back();
		      
		  //driver.get("https://secure.yatra.com/social/common/yatra/signin.htm");
		  //driver.findElement(By.xpath("//*[@id=\'login-input\']")).sendKeys("Hello...its meee!!!");
		        //driver.findElement(By.cssSelector("#login-continue-btn")).click();    
		        //System.out.println(driver.findElement(By.cssSelector("#login-error")).getText());
		    
		  /*driver.get("https://www.zoomcar.com/madurai");
		  driver.findElement(By.xpath("//a[@class='commute icon-img']/following-sibling::a[1]")).click();
		  */
		  /*  driver.get("https://www.spicejet.com/");
		  Select s= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		  //s.selectByValue("AED");
		  //s.selectByVisibleText("USD");
		  s.selectByIndex(3);
		 */
		  /*
		  driver.get("http://qaclickacademy.com/practice.php");
		  System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		  Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		  driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		  System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		  Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		  driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		  System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		  Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		  
		  System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		  
		  
		  
		 }
		}
		
		*/
		  /*
		    package seleniumIntro;
		import java.util.Arrays;
		import java.util.List;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;
		import org.testng.Assert;

		public class TestCase3 {
		 public static void main(String[] args){
		  // TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\Selenium_eclipse\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		 
		 String[] items = {"Carrot","Beans","Mango","Raspberry","Tomato"};
		 List itemsList=Arrays.asList(items);
		 List<WebElement> list = driver.findElements(By.cssSelector("h4.product-name"));
		 
		   
		    for(int i=0;i<list.size();i++)
		 {
		  
		    String[] listname= list.get(i).getText().split("-");
		    String itemsListitem=listname[0].trim();
		   
		 if(itemsList.contains(itemsListitem))
		 {
		  
		   System.out.println(itemsList);
		   System.out.println(itemsListitem);
		   driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		 }
		 
		 }
		 
		//driver.findElement(By.xpath("(//div[@class='product']"));
		  
		 
		 }
		}






		package seleniumIntro;
		import java.util.Arrays;
		import java.util.List;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;
		import org.testng.Assert;

		public class TestCase3 {
		 public static void main(String[] args){
		  // TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\Selenium_eclipse\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		 
		 String[] items = {"Carrot","Beans","Mango","Raspberry","Tomato"};
		 List itemsList=Arrays.asList(items);
		 List<WebElement> list = driver.findElements(By.cssSelector("h4.product-name"));
		 
		   
		    for(int i=0;i<list.size();i++)
		 {
		  
		    String[] listname= list.get(i).getText().split("-");
		    String itemsListitem=listname[0].trim();
		   
		 if(itemsList.contains(itemsListitem))
		 {
		  
		   System.out.println(itemsList);
		   System.out.println(itemsListitem);
		   driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		 }
		 
		 }
		 
		//driver.findElement(By.xpath("(//div[@class='product']"));
		  

		  
		 }
		 
		}

	}

}
*/

		
		
		
		
		
		/*
		  
		  System.out.println(driver.getTitle());
		  driver.findElement(By.xpath("//a[@class='h-c-button h-c-button--primary hero-carousel__cta hero-carousel__cta--reg']")).click();
		  Set <String>ids = driver.getWindowHandles();
		  Iterator <String> it = ids.iterator();
		  String firsttab=it.next();
		  String secondtab=it.next();
		  driver.switchTo().window(secondtab);
		  System.out.println(driver.getTitle());
			
		
		 
		  driver.switchTo().frame(0);
		  driver.switchTo().frame(1);
		  
		  
		  System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
		  
		   driver.get("https://the-internet.herokuapp.com/windows");
		  driver.findElement(By.xpath("//div[@class='example']/a")).click();
		  Set <String> ids=driver.getWindowHandles();
		  Iterator<String> it = ids.iterator();
		  String parent =it.next();
		  String child=it.next();
		  driver.switchTo().window(child);
		  System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		  driver.switchTo().window(parent);
		  System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		  
	
			
			*/
		
		
		
		
		
/*		import java.util.Iterator;	
		import java.util.Set;

		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Demo3{

			public static void main(String[] args)
			{
			

				System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse\\chromedriver_win32\\chromedriver.exe");
				  WebDriver driver =new ChromeDriver();
				  
				  driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22650/rsa-vs-eng-3rd-test-england-tour-of-south-africa-2019-20");
		          
				  WebElement table=driver.findElement(By.xpath("//div[@id='innings_2']/div[1]"));
				  
				  int rowcount= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
				 // System.out.println(rowcount);
					int j=0;
				 
					for(int i=0;i<rowcount-3;i++)
				  {
						System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
					  String temp=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
				     
					  int sum = Integer.parseInt(temp);
				     
				     j=j+sum;
				    
				  } 
				 
					String k=table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
					 int ki = Integer.parseInt(k);
					 j=j+ki;
				 System.out.println("loop total "+j);
				 String t=table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
				 int ti = Integer.parseInt(t);
				 System.out.println("total shown "+ti);
				 if(j==ti)
				 {
					 System.out.println("Amount Matches");
				 }
				 else {

					 System.out.println("Amount misMatches");
				 }
				 
				 
				
			}
			}
			*/	  
		
		
		
		/*
		 * import java.util.Iterator; import java.util.Set;
		 * 
		 * import org.openqa.selenium.By; import org.openqa.selenium.Keys; import
		 * org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import
		 * org.openqa.selenium.chrome.ChromeDriver;
		 * 
		 * public class Demo2 {
		 * 
		 * public static void main(String[] args) throws InterruptedException {
		 * 
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\DELL\\eclipse\\chromedriver_win32\\chromedriver.exe"); WebDriver
		 * driver =new ChromeDriver();
		 * 
		 * 
		 * driver.get("https://www.flipkart.com/"); Thread.sleep(5000L);
		 * 
		 * driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		 * WebElement footerpart =
		 * driver.findElement(By.xpath("//div[@class='_2NHqR1 row']/div[1]"));
		 * 
		 * for(int i=0;i<footerpart.findElements(By.tagName("a")).size();i++) { String
		 * press=Keys.chord(Keys.CONTROL,Keys.ENTER);
		 * System.out.println(footerpart.findElements(By.tagName("a")).get(i).getText())
		 * ; footerpart.findElements(By.tagName("a")).get(i).sendKeys(press); } Set
		 * <String> ids=driver.getWindowHandles(); Iterator<String> it= ids.iterator();
		 * System.out.println(driver.getWindowHandles().size());
		 * 
		 * for(int j=0;j<driver.getWindowHandles().size();j++) { String one=it.next();
		 * driver.switchTo().window(one); System.out.println(driver.getTitle()); }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * }
		 * 
		 * }
		 */
		
		
		
		/*
		 * import java.util.Iterator; import java.util.Set; import
		 * org.openqa.selenium.By; import org.openqa.selenium.Keys; import
		 * org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import
		 * org.openqa.selenium.chrome.ChromeDriver;
		 * 
		 * public class Demo1 {
		 * 
		 * public static void main(String[] args) throws InterruptedException {
		 * 
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\DELL\\eclipse\\chromedriver_win32\\chromedriver.exe"); WebDriver
		 * driver =new ChromeDriver();
		 * 
		 * 
		 * driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 * 
		 * WebElement table=driver.findElement(By.xpath("//table[@id='product']"));
		 * 
		 * int rowtotal=
		 * driver.findElements(By.xpath("//table[@id='product']/tbody[1]/tr")).size();
		 * System.out.println(rowtotal); int columntotal=
		 * driver.findElements(By.xpath("//table[@id='product']/tbody[1]/tr[1]/th")).
		 * size(); System.out.println(columntotal); for(int i=0;i<columntotal;i++) {
		 * System.out.println(table.findElements(By.xpath(
		 * "//table[@id='product']/tbody[1]/tr[3]/td")).get(i).getText());
		 * 
		 * }
		 * 
		 * } }
		 */
		
		
		
		
		
