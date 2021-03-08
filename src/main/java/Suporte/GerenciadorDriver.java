package Suporte;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;

import io.github.bonigarcia.wdm.*;

public class GerenciadorDriver {
	
	private static WebDriver driver;

	private static  WebDriver pegarGerenciadorDriver (TipoDriver navegador) {
		
		switch (navegador) {
		
		case CHROME:
			
			WebDriverManager.chromedriver().setup();
			ChromeOptions opcoesChrome = new ChromeOptions();
			opcoesChrome.addArguments("--start-maximized");
			driver = new ChromeDriver(opcoesChrome);
			break;
			
		case FIREFOX:
			
			 WebDriverManager.firefoxdriver().setup();
             FirefoxOptions opcoesFirefox = new FirefoxOptions();
             opcoesFirefox.addArguments("--incognito");
             driver = new FirefoxDriver(opcoesFirefox);
             break;
             
		 default:
             break;
				
		}
		
		return driver;
	}
	
	public static WebDriver pegarDriver(TipoDriver navegador) {
        if(driver == null){

            driver = pegarGerenciadorDriver(navegador);
        }

        return driver;
	}
	
    public static void encerrarDriver(){

        if (driver != null) {

            driver.quit();
            driver = null;
        }

    }


}

