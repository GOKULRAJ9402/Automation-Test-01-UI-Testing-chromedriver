package thiredwebsite;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class five {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.getcalley.com/see-a-demo/");
		
		Dimension d1 =new Dimension(414,896);
		driver.manage().window().setSize(d1);
		Thread.sleep(3000);
		driver.quit();
	}

}
