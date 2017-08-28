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
	@Test
	public void testNumeroDeCedulas280(){
		int resultadoTeste = CaixaEletronico.NumeroCedulas(280);//2 de 100 + 1 de 50 + 1 de 20 + 1 de 10
		assertEquals(5, resultadoTeste);
}
	
	public void testNumeroDeCedulas500(){
		int resultadoTeste = CaixaEletronico.NumeroCedulas(500);//2 de 100 + 1 de 50 + 1 de 20 + 1 de 10
		assertEquals(5, resultadoTeste);
}
	public void testNumeroDeCedulas550(){
		boolean resultadoTeste = CaixaEletronico.SaquePossivelEQtdCedulas(500);//2 de 100 + 1 de 50 + 1 de 20 + 1 de 10
		assertEquals(true, resultadoTeste);
	}
	
	public void testNumeroDeCedulas255(){
		boolean resultadoTeste = CaixaEletronico.SaquePossivelEQtdCedulas(255);
		assertEquals(false, resultadoTeste);
	}
}
