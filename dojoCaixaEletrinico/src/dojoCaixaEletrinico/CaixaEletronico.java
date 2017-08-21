package dojoCaixaEletrinico;

public class CaixaEletronico {

	public static int Saque30(int valor) {
		if (valor % 10 == 0){
			return 20 + 10;
		}
		return 0;
	}
	
	public static boolean Saque80 (int valor) {
		if (valor % 10 == 0){
			return true;
		} 
		return false;
	}
/*	float notas;

	public static int saquePossivel(int notas) {
		if (notas == 100|| notas == 50 || notas == 20 || notas == 10)
			return notas;
		else {
			throw new IllegalArgumentException("Saque Inválido!");
			}
	}*/

	
}
