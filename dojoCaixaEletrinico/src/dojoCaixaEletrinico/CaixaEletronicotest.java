package dojoCaixaEletrinico;

import static org.junit.Assert.assertEquals;

import java.util.Map;

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
	
	@Test
	public void testNumeroDeCedulas500(){
		int resultadoTeste = CaixaEletronico.NumeroCedulas(500);//2 de 100 + 1 de 50 + 1 de 20 + 1 de 10
		assertEquals(5, resultadoTeste);
}
	@Test
	public void testNumeroDeCedulas550(){
		Map<String, Object> resultado = CaixaEletronico.SaquePossivelEQtdCedulas(550);//2 de 100 + 1 de 50 + 1 de 20 + 1 de 10
		boolean saqueValido = (boolean) resultado.get("valido");
		int numCedulas = (int) resultado.get("numCedulas");
		assertEquals(true, saqueValido);
		assertEquals(6, numCedulas);
	}
	
//	@Test
//	public void testNumeroDeCedulas255(){
//		boolean resultadoTeste = CaixaEletronico.SaquePossivelEQtdCedulas(255);
//		assertEquals(false, resultadoTeste);
//	}	
//		@Test
//		public void testNumeroDeCedulas251(){
//			boolean resultadoTeste = CaixaEletronico.SaquePossivelEQtdCedulas(251);
//			assertEquals(false, resultadoTeste);
//	}
	@Test 
	public void testNumeroDeCedulas100(){
		int resultadoTeste = CaixaEletronico.NumeroCedulas(100);
		assertEquals(1, resultadoTeste);
	}
	@Test 
	public void testNumeroDeCedulas200(){
		int resultadoTeste = CaixaEletronico.NumeroCedulas(200);
		assertEquals(2, resultadoTeste);
	}
}
