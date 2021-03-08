package CasosDeTeste;

import Suporte.*;
import Tarefas.*;
import Utilitarios.EsperaFixa;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import static Suporte.Relatorio.log;

public class Desafio extends TesteBase {
	private WebDriver driver = this.pegarDriver();

	HomeTarefas homeTarefas = new HomeTarefas(driver);
	CarrinhoTarefas carrinhoTarefas = new CarrinhoTarefas(driver);
	CadastroTarefas cadastroTarefas = new CadastroTarefas(driver);

	@Test
	public void desafio() throws InterruptedException {

		try {
			Relatorio.createTest("Realizar Compra com Sucesso", TipoRelatorio.INDIVIDUAL);
			
			EsperaFixa.aguardaEmSegundos(2);
			homeTarefas.SelecionarProduto();
			homeTarefas.AdicionarProduto();
			carrinhoTarefas.validaItemCarrinho("Blouse");

		} catch (Exception e) {
			log(Status.ERROR, e.getMessage(), Screenshot.fullPageBase64(driver));
		}
		/*
		 * carrinhoTarefas.realizaChekoutAdicionaCarrinho();
		 * carrinhoTarefas.validaValorCarrinho();
		 * carrinhoTarefas.realizaChekoutFinalizaCompra();
		 * cadastroTarefas.criarConta("lefelephsilva@hotmail.com");
		 * cadastroTarefas.preencherCadastro("Leticia", "Peretti", "12345", "22", "12",
		 * "1987", "Madre Adelia 64", "São Jeronimo", "12", "00000", "51995829800");
		 * EsperaFixa.aguardaEmSegundos(5);
		 * cadastroTarefas.validaEnderecoEntrega("Madre Adelia 64");
		 * cadastroTarefas.finalizaCadastro(); cadastroTarefas.aceitaTermo();
		 * cadastroTarefas.confirmaEntrega();
		 * cadastroTarefas.validaValorFinal("$29.00");
		 * cadastroTarefas.selecionaTipoDePagamento();
		 * cadastroTarefas.confirmaPagamento(); cadastroTarefas.
		 * validaConfirmacaoDeCompra("Your order on My Store is complete.");
		 */

	}

}
