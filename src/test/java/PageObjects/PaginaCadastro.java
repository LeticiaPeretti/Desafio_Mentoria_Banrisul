package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilitarios.Esperas;

public class PaginaCadastro {
	private WebDriver driver;
	private Esperas espera;
	
	
	public PaginaCadastro(WebDriver driver) {
				this.driver = driver;
				this.espera = new Esperas(driver);
	}
	public WebElement adicionaEmail(){
    	return espera.visibilidadeDoElemento(By.id("email_create"));
	
    }
	public WebElement botaoCriarConta() {
		return espera.visibilidadeDoElemento(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
	}
	
	public WebElement radioButtonMrs(){
    	return espera.visibilidadeDoElemento(By.id("id_gender2"));
	
    }
	public WebElement CampoPrimeiroNome(){
    	return espera.visibilidadeDoElemento(By.id("customer_firstname"));
	
    }
	public WebElement CampoUltimoNome(){
    	return espera.visibilidadeDoElemento(By.id("customer_lastname"));
	
    }
	public WebElement CampoSenha(){
    	return espera.visibilidadeDoElemento(By.id("passwd"));
	
    }
	public WebElement CampoDiaNascimento(){
    	return espera.visibilidadeDoElemento(By.id("days"));
	
    }
	public WebElement CampoMesNascimento(){
    	return espera.visibilidadeDoElemento(By.id("months"));
	
    }
	public WebElement CampoAnoNascimento(){
    	return espera.visibilidadeDoElemento(By.id("years"));
	
    }
	public WebElement EnderecoPrimeiroNome(){
    	return espera.visibilidadeDoElemento(By.id("firstname"));
	
    }
	public WebElement EnderecoUltimoNome(){
    	return espera.visibilidadeDoElemento(By.id("lastname"));
	
    }
	public WebElement Endereco(){
    	return espera.visibilidadeDoElemento(By.id("address1"));
	
    }
	public WebElement EnderecoCidade(){
    	return espera.visibilidadeDoElemento(By.id("city"));
	
    }
	public WebElement EnderecoEstado(){
    	return espera.visibilidadeDoElemento(By.id("id_state"));
	
    }
	public WebElement EnderecoCEP(){
    	return espera.visibilidadeDoElemento(By.id("postcode"));
	
    }
	public WebElement EnderecoTelefone(){
    	return espera.visibilidadeDoElemento(By.id("phone_mobile"));
	
    }
	public WebElement EnderecoAlternativo(){
    	return espera.visibilidadeDoElemento(By.id("alias"));
	
    }
	
	public WebElement BotaoRegistar(){
    	return espera.visibilidadeDoElemento(By.id("submitAccount"));
	
    }
	
	public WebElement botaoCheckoutFinalizaCadastro() {
		return espera.visibilidadeDoElemento(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
	}
	
	public WebElement enderecoEntregaRua() {
		return espera.visibilidadeDoElemento(By.xpath("//*[@id=\"address_delivery\"]/li[3]"));
	}
	
	public WebElement enderecoEntregaCidadeEstadoCep() {
		return espera.visibilidadeDoElemento(By.className("address_city address_state_name address_postcode"));
	}
	public WebElement enderecoEntregaPais() {
		return espera.visibilidadeDoElemento(By.className("address_country_name"));
	}
	
	public WebElement checkBoxTermo(){
    	return espera.visibilidadeDoElemento(By.id("uniform-cgv"));
	
    }
	public WebElement botaoCheckoutFinalizaEntrega() {
		return espera.visibilidadeDoElemento(By.xpath("//*[@id=\"form\"]/p/button/span"));
		                                               
	}
	
	public WebElement precoFinal(){
    	return espera.visibilidadeDoElemento(By.id("total_price"));
	
    }
	
	public WebElement pagamentoBankWire() {
		return espera.visibilidadeDoElemento(By.className("bankwire"));
	}
	
	public WebElement botaoConfirmaPagamento() {
		return espera.visibilidadeDoElemento(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
		
	}
	
	public WebElement confirmaCompra() {
		return espera.visibilidadeDoElemento(By.xpath("//*[@id=\"center_column\"]/div/p/strong"));
	}
	
	
	

	
	
	
	
	
	

}
