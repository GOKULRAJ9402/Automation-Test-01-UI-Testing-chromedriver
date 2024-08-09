package secondwebsite;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class six {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.getcalley.com/calley-lifetime-offer-expired/");
		
		Dimension d1 =new Dimension(375,667);
		driver.manage().window().setSize(d1);
		Thread.sleep(3000);
//		driver.quit();
	}

}
