package dojoCaixaEletrinico;

public class CaixaEletronico {

	public static boolean Saque(int valor) {
		if (valor % 10 == 0) {
			return true;
		}
		return false;
	}

	public static int NumeroCedulas(int valor) {
		int contador = 0;
		if (valor % 100 == 0){
			contador ++;
		} else if (valor % 50 == 0){
			contador ++;
		} else if (valor % 20 == 0){
			contador ++;
		}else if (valor % 10 == 0){
			contador ++;
		}
		return contador;
	}
	
	public static boolean SaquePossivelEQtdCedulas(int valor) {
		boolean resultadoTeste = CaixaEletronico.Saque(valor);
		int resultado = CaixaEletronico.NumeroCedulas(valor);
		return resultadoTeste;
	}
	
}
