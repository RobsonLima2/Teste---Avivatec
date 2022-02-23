package cadastro.testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import cadastro.metodos.Metodos;

public class CadastroTeste {
	
	Metodos metodo = new Metodos();

	@Before
	public void setUp() throws Exception {
		metodo.abrirNavegador();
		Thread.sleep(3000);
	}

	@After
	public void tearDown() throws Exception {
		
		
		metodo.clicar(By.cssSelector("#onetrust-close-btn-container > button"));
		Thread.sleep(1000);
		
		metodo.clicar(By.cssSelector("#modalLoginDefault > div > div > div > form > div.rnk-group-buttons > div > a:nth-child(2)"));
		metodo.screenShot("Tela link Cadastre-se Agora");
		metodo.escrever(By.cssSelector("#rnk-input-email-create-account"), "tester_user@outlook.com.br");
		metodo.screenShot("Tela Inserir email para cadastro");
		Thread.sleep(2000);
		metodo.clicar(By.cssSelector("#modalLoginCreateAccount > div > div > div > form > div.rnk-group-buttons > button.btn.rnk-btn-primary"));
		Thread.sleep(1000);
		metodo.escrever(By.cssSelector("#input-nome-form"), "Zeani");
		Thread.sleep(1000);
		metodo.escrever(By.cssSelector("#input-sobrenome-form"), "da Silva");
		Thread.sleep(1000);
		metodo.escrever(By.cssSelector("#input-cpf-form"), "240.638.820-47");
		Thread.sleep(1000);
		metodo.escrever(By.cssSelector("#input-telefone-form"), "11978540758");
		Thread.sleep(1000);
		metodo.escrever(By.cssSelector("#show-password-input"), "T3ste2oo2");
		Thread.sleep(1000);
		metodo.escrever(By.cssSelector("#show-password-confirmation"), "T3ste2oo2");
		metodo.screenShot("Tela dados cadastrados");
		Thread.sleep(1000);
		metodo.clicar(By.cssSelector("#modalLoginCreateAccountForm > div > div > div > form > div.rnk-group-buttons > button.btn.rnk-btn-primary"));
		Thread.sleep(1000);
		metodo.clicar(By.cssSelector("#modalLoginConfirmCod > div > div > div > form > div.rnk-group-buttons > button.btn.rnk-btn-primary"));
	
		Thread.sleep(1000);
		metodo.clicar(By.cssSelector("#modalLoginConfirmCod > div > div > a > span:nth-child(1)"));
		Thread.sleep(1000);
		metodo.clicar(By.cssSelector("body > header > div.container-fluid.container-header.d-flex.align-items-center > div > div > div.col-5.col-lg-3.d-flex.align-items-center.justify-content-end.container-multi > div.container-minha-conta.d-none.d-lg-block > a > span > span:nth-child(2)"));
		metodo.clicar(By.cssSelector("#input-floating-logar-email"));
		metodo.escrever(By.cssSelector("#input-floating-logar-email"), "tester_user@outlook.com.br");
		metodo.escrever(By.cssSelector("#initial-show-password"), "T3ste2oo2");
		metodo.screenShot("Tela login e senha");
		metodo.clicar(By.cssSelector("#modalLoginDefault > div > div > div > form > div.rnk-group-buttons > button"));
		metodo.screenShot("Tela login realizado");
		Thread.sleep(10000);
		metodo.fecharNavegador();
	}

	@Test
	public void test() {
		
	}

}
