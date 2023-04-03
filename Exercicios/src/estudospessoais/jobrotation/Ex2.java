package estudospessoais.jobrotation;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
// Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
		int numero = entrada.nextInt();

		int anterior = 0;
		int atual = 1;
		boolean pertence = false;

		while (atual <= numero) {
			if (atual == numero) {
				pertence = true;
				break;
			}

			int proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
		}

		if (pertence) {
			System.out.println(numero + " pertence a sequência de Fibonacci.");
		} else {
			System.out.println(numero + " não pertence a sequência de Fibonacci.");
		}
		entrada.close();
	}
}
