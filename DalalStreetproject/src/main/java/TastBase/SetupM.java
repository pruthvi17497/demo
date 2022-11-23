package TastBase;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pageLayer.Dashboard;
import com.pageLayer.Loginpage;
import com.pageLayer.Profile;
import com.pageLayer.exchanges;

public class SetupM {
	String  key1 ="webdriver.chrome.driver";
	String value1 ="D:\\pruthviraj\\chromeselinium107\\chromedriver.exe";
    public static  WebDriver w;
    public static Loginpage L;
    public static Dashboard Dash;
    public static exchanges ex;
    public static Profile pro;
@BeforeMethod
public void browserLunch() throws InterruptedException {

	System.setProperty(key1,value1);
	
	String browser ="chrome";
	if(browser.equalsIgnoreCase("chrome")) {
		 w =new ChromeDriver();
		w.manage().window().maximize();
	}else  if (browser.equalsIgnoreCase("firefox")) {
		w =new FirefoxDriver();
		w.manage().window().maximize();
	}else {
		System.out.println("invalid valu browser");
	}
	
	w.get("https://apps.dalalstreet.ai/login");
	Thread.sleep(3000);
	
	L= new Loginpage ();
	Dash= new Dashboard();
     ex = new exchanges ();
     pro = new Profile();
	//-------------------*-----------
	L.enter_username("kadampruthvi17@gmail.com");
	L.enter_password("sangramsangram");
	L.Login_btn();
	
	
	
	
}


@AfterMethod
public void browserQuit() {
	w.quit();
}


}
