package br.com.fiap.loja;

/**
 * Classe respons�vel por converter moedas
 * 
 * @author RM44026
 * 
 */
public class MoedaEstrangeira {

	/**
	 * M�todo respons�vel por converter valorDolar em valorReal
	 * 
	 * @param valorDolar
	 *            int com o valor em dolar
	 * @return valarReal int
	 */
	public int converterDolar(int valorDolar) {
		return (valorDolar < 0) ? 0 : valorDolar * 2;
	}

}
