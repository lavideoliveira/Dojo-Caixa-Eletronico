package dojoCaixaEletrinico;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaixaEletronicotest {

	@Test
	public void testSaquePossivel2() {
		boolean resultadoTeste = CaixaEletronico.Saque(2);
		assertEquals(false, resultadoTeste);
		
	}
	
	@Test
	public void testSaquePossivel10() {
		boolean resultadoTeste = CaixaEletronico.Saque(10);
		assertEquals(true, resultadoTeste);
		
	}
	
	@Test
	public void testSaquePossivel555() {
		boolean resultadoTeste = CaixaEletronico.Saque(555);
		assertEquals(false, resultadoTeste);
		
	}
}
