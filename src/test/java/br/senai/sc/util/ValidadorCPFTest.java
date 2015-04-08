package br.senai.sc.util;

import org.junit.Test;

import junit.framework.TestCase;

public class ValidadorCPFTest extends TestCase {

	@Test
	public static void testRetiraCaracteresInvalidosComLetras() {
		String cpfParaValidar = "04776773473brbrbrbrbrbr";
		String cpfApenasNumeros = ValidadorCPF.retiraCaracteresInvalidos(cpfParaValidar);
		assertEquals("04776773473", cpfApenasNumeros);
	}
	
	public static void testRetiraCaracteresInvalidosComPontoHifen() {
		String cpfParaValidar = "047.767.734-73";
		String cpfApenasNumeros = ValidadorCPF.retiraCaracteresInvalidos(cpfParaValidar);
		assertEquals("04776773473", cpfApenasNumeros);
	}
	
	public static void testRetiraCaracteresInvalidosComSimbolosEspeciais() {
		String cpfParaValidar = "04776773473@#$#$%@#@_()";
		String cpfApenasNumeros = ValidadorCPF.retiraCaracteresInvalidos(cpfParaValidar);
		assertEquals("04776773473", cpfApenasNumeros);
	}
	
}
