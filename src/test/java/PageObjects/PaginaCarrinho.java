package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilitarios.Esperas;

public class PaginaCarrinho {
	
	private WebDriver driver;
	private Esperas espera;
	
	
	public PaginaCarrinho(WebDriver driver) {
				this.driver = driver;
				this.espera = new Esperas(driver);
	}
		
	public WebElement botaoProsseguirCheckoutAdicionaCarrinho() {
		return driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
	}
	
    public WebElement pegarTituloDoProduto(){
    	return espera.visibilidadeDoElemento(By.id("layer_cart_product_title"));
    	
    }
    
    public WebElement pegarValorProduto(){
    	return espera.visibilidadeDoElemento(By.id("total_price"));
	
    }
    
    public WebElement botaoProsseguirCheckouFinalizaCompra() {
		return espera.visibilidadeDoElemento(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
	}
}
