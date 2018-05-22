package br.com.ahgora.Inicializacao;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AbrirBrowser {
	
	private WebDriver driver;
	
	public WebDriver abrirNavegador(String site){
		System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "chromedriver/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		// chromeOptions.addArguments("--start-fullscreen");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(site);
		return driver;
	}
}
