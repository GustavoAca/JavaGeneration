
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		/*
		 * Faça um programa em que permita a entrada de um número qualquer e exiba se
		 * este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo;
		 * se for ímpar exiba o número elevado ao quadrado.
		 */

		Scanner leia = new Scanner(System.in);
		int numero = 0, elevado = 0;
		float raiz = 0;
		System.out.print("Insira o numero: ");
		numero = leia.nextInt();

		if (numero % 2 == 0) {
			// essa função pega o numero e descobre sua raiz
			raiz = (float) Math.sqrt(numero);
			System.out.printf("O numero %d é par, e sua raiz é %f", numero, raiz);
		} else {
			// essa função faz o numero recebido ser elevado ao expoente desejado
			elevado = (int) Math.pow(numero, 2);
			System.out.println("O numero " + numero + " é impar, se elevado é: " + elevado);
		}
	}
}
