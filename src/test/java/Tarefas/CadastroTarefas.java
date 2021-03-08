package Tarefas;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import PageObjects.PaginaCadastro;
import Utilitarios.InteragirCombo;


public class CadastroTarefas {
	
	private static WebDriver driver;
	private static PaginaCadastro paginaCadastro;
	private static InteragirCombo interagirCombo;
	
	public CadastroTarefas(WebDriver driver) {
		
		this.driver = driver;
		paginaCadastro = new PaginaCadastro(driver);
		interagirCombo = new InteragirCombo(driver);
	}
	
	public void criarConta(String email) {
		paginaCadastro.adicionaEmail().sendKeys(email);
		paginaCadastro.botaoCriarConta().click();
	}
	
	public void preencherCadastro(String primeiro_nome, String segundo_nome,
			String senha, String dia, String mes, String ano, String endereco,
			String cidade, String estado, String CEP, String telefone) {
		paginaCadastro.radioButtonMrs().click();
		paginaCadastro.CampoPrimeiroNome().sendKeys(primeiro_nome);
		paginaCadastro.CampoUltimoNome().sendKeys(segundo_nome);
		paginaCadastro.CampoSenha().sendKeys(senha);
		interagirCombo.selecionarCombo("days" , dia);
		interagirCombo.selecionarCombo("months" , mes);
		interagirCombo.selecionarCombo("years" , ano);
		paginaCadastro.Endereco().sendKeys(endereco);
		paginaCadastro.EnderecoCidade().sendKeys(cidade);
		interagirCombo.selecionarCombo("id_state" , estado);
	    paginaCadastro.EnderecoCEP().sendKeys(CEP);
	    paginaCadastro.EnderecoTelefone().sendKeys(telefone);
	    paginaCadastro.BotaoRegistar().click();
				
	}
	public void finalizaCadastro() {
		paginaCadastro.botaoCheckoutFinalizaCadastro().click();
	}
	
	public void validaEnderecoEntrega(String rua) {
		Assertions.assertEquals(paginaCadastro.enderecoEntregaRua().getText(), rua);
	}
	
	public void aceitaTermo() {
		paginaCadastro.checkBoxTermo().click();
	}
	
	public void confirmaEntrega() {
		paginaCadastro.botaoCheckoutFinalizaEntrega().click();
	}
	
	public void validaValorFinal(String valorTotal) {
		Assertions.assertEquals(paginaCadastro.precoFinal().getText(), valorTotal);
	}
	
	public void selecionaTipoDePagamento() {
		paginaCadastro.pagamentoBankWire().click();
	}
	
	public void confirmaPagamento() {
		paginaCadastro.botaoConfirmaPagamento().click();
	}
	
	public void validaConfirmacaoDeCompra(String mensagem) {
		Assertions.assertEquals(paginaCadastro.confirmaCompra().getText(), mensagem );
	}

	

}
