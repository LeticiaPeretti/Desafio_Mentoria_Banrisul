package Tarefas;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjects.PaginaHome;

public class HomeTarefas {
	
	private PaginaHome homePage;
	private WebDriver driver;
	
	
	public HomeTarefas(WebDriver driver) {
		this.homePage = new PaginaHome(driver);
	}
	
	public void SelecionarProduto() {
		this.homePage.detalhaProduto().click();
	}
	
	public void AdicionarProduto() {
		homePage.botaoCarrinho().click();
	}
	
	public void pegaNomeProduto() {
		homePage.detalhaProduto().getText();
	}

	}



