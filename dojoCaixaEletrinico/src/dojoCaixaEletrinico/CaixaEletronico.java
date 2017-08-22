package dojoCaixaEletrinico;

public class CaixaEletronico {

	public static boolean Saque(int valor) {
		if (valor % 10 == 0) {
			return true;
		}
		return false;
	}
}
