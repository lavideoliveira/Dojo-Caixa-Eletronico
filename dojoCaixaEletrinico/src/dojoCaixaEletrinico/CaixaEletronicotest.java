package dojoCaixaEletrinico;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaixaEletronicotest {

	/*@Test
	public void testSaquePossivel() {
		int valor = CaixaEletronico.saquePossivel(100, 50, 20, 10);
		
	}*/
	@Test
	public void testSaque30(){
		int valor = CaixaEletronico.Saque30(30);
		assertEquals(30,valor);
	}
	
	@Test
	public void testSaque80(){
		boolean valor = CaixaEletronico.Saque80(80);
		assertEquals(true, valor);
	}
}
