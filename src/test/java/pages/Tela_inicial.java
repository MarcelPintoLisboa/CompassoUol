package pages;

import org.openqa.selenium.By;

public class Tela_inicial {


	
	public static By inp_Busca = By.id("search_query_top");
	public static By btn_Busca = By.xpath("//*[@id='searchbox']/button");
	public static By slc_look = By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img");
	public static By btn_Add_to_Cart = By.xpath("//a[contains(@class, 'button ajax_add_to_cart_button btn btn-default')]");
	public static By getValueProduto = By.xpath("#layer_cart_product_title");
    public static By btn_Proceed_To_Checkout = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a");
    
    
	
}
