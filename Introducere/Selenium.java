import org.openqa.selenium.chrome.ChromeDriver;

public class IntroduceSelenium {
	
	public static void main(String[]args) {
	//Invoking Browser
	//chromedriver.exe -> Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gbalcanu\\Downloads\\eclipse\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	
	}

}
