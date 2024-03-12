package metodos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;

import drivers.Driver;

public class Metodos extends Driver {

	public static void clicar(By Elements) {

		driver.findElement(Elements).click();
	}

	public static void escrever(By Elements, String texto) {

		driver.findElement(Elements).sendKeys(texto);
	}

	public static void validarTexto(By Elements, String textoEsperado) {

		String textoCapturado = driver.findElement(Elements).getText();
		assertEquals(textoCapturado, textoEsperado);
	}

	public static void validarUrl( String textoEsperado) {

		String textoCapturado = driver.getCurrentUrl();
		assertEquals(textoCapturado, textoEsperado);
	}
}
