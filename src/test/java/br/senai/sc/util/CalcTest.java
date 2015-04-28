package br.senai.sc.util;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTest extends TestCase {

	private Calc instance;
	private Calc instance2;
	private Calc instance3;

	public void CalculaTest() {
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
        double expResult = 10.0;
        double result = Calc.somar(valor1, valor2);
        assertEquals(expResult, result, 0);
    }
 
    @Test
    public void testSubtrair() {
        int valor1 = 10;
        int valor2 = 5;
        setInstance(new Calc());
        double expResult = 5;
        double result = Calc.subtrair(valor1, valor2);
        assertEquals(expResult, result, 0);
    }
 
    @Test
    public void testMultiplicar() {
        int valor1 = 2;
        int valor2 = 5;
        setInstance2(new Calc());
        double expResult = 10;
        double result = Calc.multiplica(valor1, valor2);
        assertEquals(expResult, result, 0);
    }
 
    @Test
    public void testDividir() {
        int valor1 = 5;
        int valor2 = 2;
        setInstance3(new Calc());
        double expResult = 2.5;
        double result = Calc.dividir(valor1, valor2);
        assertEquals(expResult, result, 0);
    }

	public Calc getInstance() {
		return instance;
	}

	public void setInstance(Calc instance) {
		this.instance = instance;
	}

	public Calc getInstance2() {
		return instance2;
	}

	public void setInstance2(Calc instance2) {
		this.instance2 = instance2;
	}

	public Calc getInstance3() {
		return instance3;
	}

	public void setInstance3(Calc instance3) {
		this.instance3 = instance3;
	}
 
}