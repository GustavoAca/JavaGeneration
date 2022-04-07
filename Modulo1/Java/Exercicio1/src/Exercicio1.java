
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se
		 * este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo;
		 * se for �mpar exiba o n�mero elevado ao quadrado.
		 */

		Scanner leia = new Scanner(System.in);
		int numero = 0, elevado = 0;
		float raiz = 0;
		System.out.print("Insira o numero: ");
		numero = leia.nextInt();

		if (numero % 2 == 0) {
			// essa fun��o pega o numero e descobre sua raiz
			raiz = (float) Math.sqrt(numero);
			System.out.printf("O numero %d � par, e sua raiz � %f", numero, raiz);
		} else {
			// essa fun��o faz o numero recebido ser elevado ao expoente desejado
			elevado = (int) Math.pow(numero, 2);
			System.out.println("O numero " + numero + " � impar, se elevado �: " + elevado);
		}
	}
}
