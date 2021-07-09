package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pages.Metodos;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.Tela_inicial;
import pages.Util;
public class Tela_inicialSteps{  
private ChromeDriver driver;	
Metodos metodos = new Metodos();

	@Dado("Abrir navegador teste")
	   public void abrir_navegador_teste() throws InterruptedException {
		 Util.abrirNavegador("http://automationpractice.com/");
                   
		}
	@Dado("como comprador quero buscar um look {string} no sistema")
	public void como_comprador_quero_buscar_um_look_no_sistema (String look) throws InterruptedException {
		
		 metodos.esperarImplicita(Tela_inicial.inp_Busca,4000);
		 metodos.escrever(Tela_inicial.inp_Busca, look);
		 metodos.clicar(Tela_inicial.btn_Busca);
		
	}

	@Quando("adiciono no carrinho de compras")
	public void adiciono_no_carrinho_de_compras() throws InterruptedException {
		Thread.sleep(2000);
		metodos.mouseselect(Tela_inicial.slc_look);		
		metodos.esperarImplicita(Tela_inicial.btn_Add_to_Cart,4000);
		metodos.clicar(Tela_inicial.btn_Add_to_Cart);
		metodos.esperarImplicita(Tela_inicial.btn_Proceed_To_Checkout,5000);
		metodos.clicar(Tela_inicial.btn_Proceed_To_Checkout);
	  
	}
	



}
