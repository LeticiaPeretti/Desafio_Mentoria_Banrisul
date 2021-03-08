package Tarefas;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import PageObjects.PaginaCarrinho;
import Suporte.Relatorio;
import Suporte.Screenshot;

public class CarrinhoTarefas {
	
	private static WebDriver driver;
	private static PaginaCarrinho paginaCarrinho;
	
	public CarrinhoTarefas (WebDriver driver) {
		
		this.driver = driver;
		paginaCarrinho = new PaginaCarrinho(driver);
	}
	
	public void realizaChekoutAdicionaCarrinho() {
		paginaCarrinho.botaoProsseguirCheckoutAdicionaCarrinho().click();
	}
	
	public void validaItemCarrinho(String produto) {
		try{
			Assertions.assertEquals(paginaCarrinho.pegarTituloDoProduto().getText(), produto);
            Relatorio.log(Status.PASS, "Produto correto no carrinho", Screenshot.fullPageBase64(driver));
        }catch (Exception e){

            Relatorio.log(Status.FAIL,"Produto errado no carrinho", Screenshot.fullPageBase64(driver));
        }
		

	}
	
	public void validaValorCarrinho() {
		Assertions.assertEquals(paginaCarrinho.pegarValorProduto().getText(), "$29.00");

	}
	
	public void realizaChekoutFinalizaCompra() {
		paginaCarrinho.botaoProsseguirCheckouFinalizaCompra().click();
	}
	
/*	System.out.println("1");
	System.out.println(paginaCarrinho.pegarValorProduto().getText());
	System.out.println("2");
	*/
}
