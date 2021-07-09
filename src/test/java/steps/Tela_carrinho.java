package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.pt.Entao;
import pages.Metodos;
import pages.Util;
public class Tela_carrinho{  
	private WebDriver driver;	
	Util adriver = new Util();	
	Metodos metodos = new Metodos();

	@Entao("preciso verificar se o look {string} {string} encontra-se no carrinho de compras")
	public void verificar_se_o_look_está_no_carrinho_de_compras(String ExpectedTitle, String preço_esperado ) throws InterruptedException {
	
	metodos.esperarImplicita(pages.Tela_carrinho.txt_Validar_look_No_Carrinho,5000);
	metodos.ValidarElementos(ExpectedTitle,preço_esperado,pages.Tela_carrinho.txt_Validar_look_No_Carrinho,pages.Tela_carrinho.txt_Validar_Preço_look );
	

	}

}
