package br.senai.sc.util;
 
public class Calc {
 
	private static int retorno = 0;
	
	// adicao
	public static double somar(int valor1, int valor2) {
		retorno = valor1 + valor2;
		return retorno;
	}
	
	// subtracao
	public static double subtrair (int valor1, int valor2){
		retorno = valor1 - valor2;
		return retorno;
	}
	
	// multiplica
	public static double multiplica (int valor1, int valor2){
		retorno = valor1 * valor2;
		return retorno;
	}
	
	// dividir
	public static double dividir (int valor1, int valor2){
		double valorx = Double.valueOf(valor1);
		double valory = Double.valueOf(valor2);
		double retorno = valorx / valory;
		return retorno;
	}


}