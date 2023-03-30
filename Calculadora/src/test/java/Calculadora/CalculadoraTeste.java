package Calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {
	
	
	private Calculadora calculadora;
	
	@BeforeEach
	public void inicializar() {
		this.calculadora = new Calculadora();
		
	}
	
	@Test
    void testSomar() {
		
		
		int a=3;
		int b = 2;
		int resultado = calculadora.somar(a,b);
		
		assertEquals(a+b, resultado);
		
	}
	@Test
    void testSubtrair() {
		
		int a=3;
		int b = 2;
		int resultado = calculadora.subtrair(a,b);
		
		assertEquals(a-b, resultado);
	}
	@Test
	void testMultiplicar() {
		
		int a=3;
		int b = 2;
		int resultado = calculadora.multiplicar(a,b);
		
		assertEquals(a*b, resultado);

}
	@Test
	void testDividir() {
	
		int a=3;
		int b = 2;
		int resultado = calculadora.dividir(a,b);
		
		assertEquals(a/b, resultado);
	}
}