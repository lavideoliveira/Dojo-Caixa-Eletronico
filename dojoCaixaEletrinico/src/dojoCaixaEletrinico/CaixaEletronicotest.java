package dojoCaixaEletrinico;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

public class CaixaEletronicotest {
	
	
	@Test
	public void testNumeroDeCedulas5(){
		Map<String, Object> resultado = CaixaEletronico.SaquePossivelEQtdCedulas(5);
		boolean saqueValido = (boolean) resultado.get("valido");
		int numCedulas = (int) resultado.get("numCedulas");
		assertEquals(false, saqueValido);
		assertEquals(0, numCedulas);
	}
	@Test
	public void testNumeroDeCedulas52(){
		Map<String, Object> resultado = CaixaEletronico.SaquePossivelEQtdCedulas(52);
		boolean saqueValido = (boolean) resultado.get("valido");
		int numCedulas = (int) resultado.get("numCedulas");
		assertEquals(false, saqueValido);
		assertEquals(0, numCedulas);
	}
	@Test
	public void testNumeroDeCedulas55(){
		Map<String, Object> resultado = CaixaEletronico.SaquePossivelEQtdCedulas(55);
		boolean saqueValido = (boolean) resultado.get("valido");
		int numCedulas = (int) resultado.get("numCedulas");
		assertEquals(false, saqueValido);
		assertEquals(0, numCedulas);
	}

	@Test
	public void testNumeroDeCedulas2(){
		Map<String, Object> resultado = CaixaEletronico.SaquePossivelEQtdCedulas(2);
		boolean saqueValido = (boolean) resultado.get("valido");
		int numCedulas = (int) resultado.get("numCedulas");
		assertEquals(false, saqueValido);
		assertEquals(0, numCedulas);
	}
	
	@Test
	public void testNumeroDeCedulas10(){
		Map<String, Object> resultado = CaixaEletronico.SaquePossivelEQtdCedulas(10);
		boolean saqueValido = (boolean) resultado.get("valido");
		int numCedulas = (int) resultado.get("numCedulas");
		assertEquals(true, saqueValido);
		assertEquals(1, numCedulas);
	}
	
	@Test
	public void testNumeroDeCedulas555(){
		Map<String, Object> resultado = CaixaEletronico.SaquePossivelEQtdCedulas(555);
		boolean saqueValido = (boolean) resultado.get("valido");
		int numCedulas = (int) resultado.get("numCedulas");
		assertEquals(false, saqueValido);
		assertEquals(0, numCedulas);
	}
	@Test
	public void testNumeroDeCedulas280(){
		Map<String, Object> resultado = CaixaEletronico.SaquePossivelEQtdCedulas(280);
		boolean saqueValido = (boolean) resultado.get("valido");
		int numCedulas = (int) resultado.get("numCedulas");
		assertEquals(true, saqueValido);
		assertEquals(5, numCedulas);
	}
	
	@Test
	public void testNumeroDeCedulas500(){
		Map<String, Object> resultado = CaixaEletronico.SaquePossivelEQtdCedulas(500);
		boolean saqueValido = (boolean) resultado.get("valido");
		int numCedulas = (int) resultado.get("numCedulas");
		assertEquals(true, saqueValido);
		assertEquals(5, numCedulas);
	}
	@Test
	public void testNumeroDeCedulas550(){
		Map<String, Object> resultado = CaixaEletronico.SaquePossivelEQtdCedulas(550);
		boolean saqueValido = (boolean) resultado.get("valido");
		int numCedulas = (int) resultado.get("numCedulas");
		assertEquals(true, saqueValido);
		assertEquals(6, numCedulas);
	}
	@Test
	public void testNumeroDeCedulas100(){
		Map<String, Object> resultado = CaixaEletronico.SaquePossivelEQtdCedulas(100);
		boolean saqueValido = (boolean) resultado.get("valido");
		int numCedulas = (int) resultado.get("numCedulas");
		assertEquals(true, saqueValido);
		assertEquals(1, numCedulas);
	}
	@Test
	public void testNumeroDeCedulas200(){
		Map<String, Object> resultado = CaixaEletronico.SaquePossivelEQtdCedulas(200);
		boolean saqueValido = (boolean) resultado.get("valido");
		int numCedulas = (int) resultado.get("numCedulas");
		assertEquals(true, saqueValido);
		assertEquals(2, numCedulas);
	}
}
