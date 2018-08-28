package ingenieria2;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumarTest {

	@Test
	public void test1() 
	{
		Calculadora c = new Calculadora();
		int resultado = c.sumar(2,3);
		int esperado = 5;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void test2() 
	{
		/* 
		sumo dos numeros, uno positivo y otro negativo
		resultado nulo
		*/
		Calculadora c = new Calculadora ();
		int resultado = c.sumar(2,-2);
		int esperado = 0;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void test3() 
	{
		Calculadora c = new Calculadora ();
		int resultado = c.sumar(2,0);
		int esperado = 2;
		assertEquals(esperado, resultado);
	}

	@Test
	public void test4() 
	{ /* 
		sumo dos numeros, uno positivo y otro negativo
		resultado negativo
		*/
		Calculadora c = new Calculadora ();
		int resultado = c.sumar(2,-3);
		int esperado = -1;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void test5() 
	{ //sumo dos numeros negativos
		Calculadora c = new Calculadora ();
		int resultado = c.sumar(-2,-3);
		int esperado = -5;
		assertEquals(esperado, resultado);
		
	}
}

