package br.com.fiap.loja;

import java.util.Scanner;

public class LojaFreeShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MoedaEstrangeira moeda = new MoedaEstrangeira();

		System.out.println("Digite o valor em Dolar, $");

		Scanner teclado = new Scanner(System.in);

		int valorDolar = teclado.nextInt();

		int valorReal = moeda.converterDolar(valorDolar);

		System.out.println("Valor em Real, R$ " + valorReal);

		teclado.close();
	}

}
