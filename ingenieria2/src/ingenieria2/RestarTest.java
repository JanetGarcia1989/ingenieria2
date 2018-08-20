package ingenieria2;

import static org.junit.Assert.*;

import org.junit.Test;

public class RestarTest {

	@Test
	public void test1() 
	{
		Calculadora c = new Calculadora();
		int resultado = c.restar(3, 2);
		int esperado = 1;
		assertEquals(resultado, esperado);
	
	}
	
	@Test
	public void test2()
	{
		Calculadora c = new Calculadora();
		int resultado = c.restar(2, 2);
		int esperado = 0;
		assertEquals(resultado, esperado);
	}

}
