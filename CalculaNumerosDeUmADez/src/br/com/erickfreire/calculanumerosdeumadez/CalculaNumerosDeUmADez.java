package br.com.erickfreire.calculanumerosdeumadez;

/**
 * Crie um programa em Java que calcula a soma dos números de um a dez
 * @author Erick Freire
 * @version 1 - Criado em 07-04-2021 as 17:44
 */

public class CalculaNumerosDeUmADez {

	public static void main(String[] args) {
		int soma = 0;
		int x = 1;
		
		while(x <= 10) {
			soma += x;
			++x;
		}
		
		System.out.printf("A soma é de: %d", soma);

	}

}
