package dojoCaixaEletrinico;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaixaEletronicotest {

	/*@Test
	public void testSaquePossivel() {
		int valor = CaixaEletronico.saquePossivel(100, 50, 20, 10);
		
	}*/
	@Test
	public void testSaque(){
		int valor = CaixaEletronico.Saque(30);
		assertEquals(30,valor);
	}
}
