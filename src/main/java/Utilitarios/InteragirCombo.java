package Utilitarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InteragirCombo {
	
	private WebDriver driver;
	
	public InteragirCombo(WebDriver driver) {
		this.driver = driver;
	}
	public void selecionarCombo(String id, String valor) {
		 WebElement element = driver.findElement(By.id(id));
		    Select combo = new Select(element);
		    combo.selectByValue(valor);
		    //combo.selectByVisibleText(valor);
	}

}
