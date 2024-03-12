package runners;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import drivers.Driver;

public class Execulta extends Driver {

	public static void iniciarTest() {

		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless"); //Execulta sem abrir o navegador
		options.addArguments("--start-maximized"); // Maximizar o navegador
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com");
	}
	
	public static void finalizar () {
		
		driver.quit();
		
	}
}