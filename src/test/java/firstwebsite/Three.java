package firstwebsite;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Three {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.getcalley.com/");
		
		Dimension d1 =new Dimension(1536,864);
		driver.manage().window().setSize(d1);
		driver.quit();

	}

}
