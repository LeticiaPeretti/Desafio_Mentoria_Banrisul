package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilitarios.Esperas;

public class PaginaHome {

	private WebDriver driver;

	public PaginaHome(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement detalhaProduto() {
		return driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/h5/a"));

	}

	public WebElement botaoCarrinho() {
		return driver.findElement(By.id("add_to_cart"));
	}

}
	