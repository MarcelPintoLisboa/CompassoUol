package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.Tela_inicial;
public class Tela_inicialSteps{  
private WebDriver driver;	
	
	@Dado("Abrir navegador teste")
	   public void abrir_navegador_teste() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver/chromedriver.exe");
			
			driver = new ChromeDriver();
	        driver.manage().window().maximize();
	       // driver.getCapabilities();
	        driver.get("http://automationpractice.com/");
	                      
		}
	@Dado("como comprador quero buscar um look {string} no sistema")
	public void como_comprador_quero_buscar_um_look_no_sistema (String look) {

		 driver.findElement(Tela_inicial.inp_Busca).isDisplayed();	
		 driver.findElement(Tela_inicial.inp_Busca).sendKeys(look);
		 driver.findElement(Tela_inicial.btn_Busca).click();
	}

	@Quando("adiciono no carrinho de compras")
	public void adiciono_no_carrinho_de_compras() throws InterruptedException {
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(Tela_inicial.slc_look);
		action.moveToElement(we).build().perform();
		driver.findElement(Tela_inicial.btn_Add_to_Cart).isDisplayed();
		driver.findElement(Tela_inicial.btn_Add_to_Cart).click();
	    Thread.sleep(4000);
		driver.findElement(Tela_inicial.btn_Proceed_To_Checkout).isDisplayed();
	    driver.findElement(Tela_inicial.btn_Proceed_To_Checkout).click();

	}
	@Entao("preciso verificar se o look {string} {string} encontra-se no carrinho de compras")
	public void verificar_se_o_look_está_no_carrinho_de_compras(String ExpectedTitle, String preço_esperado ) throws InterruptedException {
	driver.findElement(pages.Tela_carrinho.txt_Validar_look_No_Carrinho).isDisplayed();
	String ActualTitle = driver.findElement(pages.Tela_carrinho.txt_Validar_look_No_Carrinho).getText();
	String Actualpreço = driver.findElement(pages.Tela_carrinho.txt_Validar_Preço_look).getText();
	Assert.assertEquals(ExpectedTitle,ActualTitle);
	Assert.assertEquals(preço_esperado,Actualpreço);

	}


}
