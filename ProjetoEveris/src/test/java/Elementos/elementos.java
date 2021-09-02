package Elementos;

import org.openqa.selenium.By;



public class elementos {

	private By btnLogin = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");

	private By cpEmail = By.id("email");
	
	private By cpSenha = By.id("passwd");
	
	private By btnSingIn = By.xpath("//*[@id=\"SubmitLogin\"]/span");
	
	private By cpSearch = By.id("search_query_top");
	
	private By btnLupa = By.name("submit_search");
	
	private By produtoSelecionado = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img");
	
	private By btnAddCard = By.name("Submit");
	
	private By btnCheckout = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
	
	private By btnCheckout2 = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span");
	
	private By btnCheckout3 = By.xpath("//*[@id=\"center_column\"]/form/p/button/span");
	
	private By checkBox = By.name("cgv");
	
	private By btnCheckout4 = By.xpath("//*[@id=\"form\"]/p/button/span");
	
	private By btnCheckout5 = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a");
	
	private By btnConfirm = By.xpath("//*[@id=\"cart_navigation\"]/button");

	public By getBtnLogin() {
		return btnLogin;
	}

	public By getCpEmail() {
		return cpEmail;
	}

	public By getCpSenha() {
		return cpSenha;
	}

	public By getBtnSingIn() {
		return btnSingIn;
	}

	public By getCpSearch() {
		return cpSearch;
	}

	public By getBtnLupa() {
		return btnLupa;
	}

	public By getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public By getBtnAddCard() {
		return btnAddCard;
	}

	public By getBtnCheckout() {
		return btnCheckout;
	}

	public By getBtnCheckout2() {
		return btnCheckout2;
	}

	public By getBtnCheckout3() {
		return btnCheckout3;
	}

	public By getCheckBox() {
		return checkBox;
	}

	public By getBtnCheckout4() {
		return btnCheckout4;
	}

	public By getBtnCheckout5() {
		return btnCheckout5;
	}


	public By getBtnConfirm() {
		return btnConfirm;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
