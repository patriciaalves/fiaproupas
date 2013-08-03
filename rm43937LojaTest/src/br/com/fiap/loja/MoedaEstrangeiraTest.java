package br.com.fiap.loja;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoedaEstrangeiraTest {

	@Test
	public void testConverterDolarValorPositivo() {
		
		MoedaEstrangeira converter = new MoedaEstrangeira();
		int valorReal = converter.converterDolar(5);
		assertEquals("Calcular valor com 5 d�lares" , 10, valorReal);
	}
	
	@Test
	public void testConverterDolarValorZerado() {
		
		MoedaEstrangeira converter = new MoedaEstrangeira();
		int valorReal = converter.converterDolar(0);
		assertEquals("Calcular valor com 0 d�lares" , 0, valorReal);
	}

	@Test
	public void testConverterDolarValorNegativo() {
		
		MoedaEstrangeira converter = new MoedaEstrangeira();
		int valorReal = converter.converterDolar(-1);
		assertEquals("Calcular valor com -1 d�lares" , 0, valorReal);
	}	
}
