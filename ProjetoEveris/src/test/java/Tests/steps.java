package Tests;

import Elementos.elementos;
import Pages.metodos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps {
	
	metodos Met = new metodos();
	elementos El = new elementos();
	
@Given("^que eu esteja no site \"([^\"]*)\"$")
public void que_eu_esteja_no_site(String site) throws Throwable {
	Met.abrirSite(site, "CHROME");
	Met.pausa(2000);
	
}

@When("^eu clicar no botao de login$")
public void eu_clicar_no_botao_de_login() throws Throwable {
	Met.clicar(El.getBtnLogin());
	Met.prencher(El.getCpEmail() ,"email@email.email");
	Met.prencher(El.getCpSenha(), "tester123");
	Met.clicar(El.getBtnSingIn());
	
}

@When("^pesquisar o produto$")
public void pesquisar_o_produto() throws Throwable {
	Met.prencher(El.getCpSearch(), "T-Shirts");
	Met.clicar(El.getBtnLupa());

	
}

@When("^selecionar o produto pesquisado$")
public void selecionar_o_produto_pesquisado() throws Throwable {
	Met.clicar(El.getProdutoSelecionado());
	Met.clicar(El.getBtnAddCard());
	Met.pausa(2000);
	
}

@Then("^conclua a compra com sucesso$")
public void conclua_a_compra_com_sucesso() throws Throwable {
	Met.clicar(El.getBtnCheckout());
	Met.clicar(El.getBtnCheckout2());
	Met.clicar(El.getBtnCheckout3());
	Met.clicar(El.getCheckBox());
	Met.clicar(El.getBtnCheckout4());
	Met.clicar(El.getBtnCheckout5());
	Met.pausa(3000);
	Met.clicar(El.getBtnConfirm());
	Met.screnShoot("CT-Validar compra efetuada com sucesso");
	Met.fechar();
}



}
