package steps;

import org.junit.Test;

import elementos.Elements;
import metodos.Metodos;
import runners.Execulta;

public class LoginTeste {

	String usuario = "standard_user";
	String senha = "secret_sauce";
	
	String urlLogado = "https://www.saucedemo.com/inventory.html";
	
	Elements elements = new Elements();
	
	@Test
	public void iniciarTeste () {
		Execulta.iniciarTest();
		Metodos.escrever(elements.usuario, this.usuario);
		Metodos.escrever(elements.senha, this.senha);
		Metodos.clicar(elements.btnLogin);
		Metodos.validarUrl(urlLogado);
		
		Execulta.finalizar();
	}
	
}
