package Suporte;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import Utilitarios.GerenciadorDeArquivos;

public class TesteBase extends GerenciadorDriver{
	
	private static WebDriver driver;
    public static WebDriver pegarDriver() {
		
		driver = pegarDriver(TipoDriver.CHROME);
		return driver;
	}
	
	@BeforeEach
	public void setUp() throws IOException{
		String index = GerenciadorDeArquivos.getProperties("url").getProperty("url");
		pegarDriver().get(index);
	}
	
	@AfterEach
	public void encerraDriver() {
		
		encerrarDriver();
	}

}
