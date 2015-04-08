package br.senai.sc.util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.TestCase;

public class CalcTest extends TestCase {

	public CalculaTest() {
    }
 
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
 
    @AfterClass
    public static void tearDownClass() throws Exception {
    }
 
    @Before
    public void setUp() {
    }
 
    @After
    public void tearDown() {
    }

    //testes calc
    @Test
    public void testSomar() {
        int valor1 = 8;
        int valor2 = 2;
        Calcular instance = new Calcular();
        double expResult = 10.0;
        double result = instance.somar(n1, n2);
        assertEquals(expResult, result, 0);
    }
 
    @Test
    public void testSubtrair() {
        int valor1 = 10;
        int valor2 = 5;
        Calcular instance = new Calcular();
        double expResult = 5;
        double result = instance.subtrair(valor1, valor2);
        assertEquals(expResult, result, 0);
    }
 
    @Test
    public void testMultiplicar() {
        int valor1 = 2;
        int valor2 = 5;
        Calcular instance = new Calcular();
        double expResult = 10;
        double result = instance.multiplicar(valor1, valor2);
        assertEquals(expResult, result, 0);
    }
 
    @Test
    public void testDividir() {
        int valor1 = 5;
        int valor2 = 2;
        Calcular instance = new Calcular();
        double expResult = 2.5;
        double result = instance.dividir(valor1, valor2);
        assertEquals(expResult, result, 0);
    }
 
}