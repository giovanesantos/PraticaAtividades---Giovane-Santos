package br.senai.sc.util;
 
public class Calc {
 
	private int retorno = 0;
	
	// adição
	public double soma (int valor1, int valor2){
		retorno = valor1 + valor2;
		return retorno;
	}
	
	// subtração
	public double subtrair (int valor1, int valor2){
		retorno = valor1 - valor2;
		return retorno;
	}
	
	// multiplica
	public double multiplica (int valor1, int valor2){
		retorno = valor1 * valor2;
		return retorno;
	}
	
	// dividir
	public double dividir (int valor1, int valor2){
		double n1 = Double.valueOf(valor1);
		double n2 = Double.valueOf(valor2);
		double retorno = valor1 / valor2;
		return retorno;
	}
}