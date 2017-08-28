package dojoCaixaEletrinico;

import java.util.HashMap;
import java.util.Map;

public class CaixaEletronico {

	public static boolean SaqueValido(int valor) {
		if (valor % 10 == 0) {
			return true;
		}
		return false;
	}

	public static int NumeroCedulas(int valor) {
		int contador = 0;
		
		contador += valor / 100;
		valor = valor % 100;
		contador += valor / 50;
		valor = valor% 50;
		contador += valor / 20;
		valor = valor% 20;
		contador += valor / 10;
		valor = valor% 10;
		return contador;
		
		
	}	
	
	public static Map<String, Object> SaquePossivelEQtdCedulas(int valor) {
		Map <String, Object> result = new HashMap<String, Object>();
		boolean saqueEhValido = CaixaEletronico.SaqueValido(valor);
		int resultado = 0;
		if (saqueEhValido) resultado = CaixaEletronico.NumeroCedulas(valor);
		result.put("valido", saqueEhValido);
		result.put("numCedulas", resultado);
		return result;
	}
	
}
