import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
		 * final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
		 * 0(zero).(DO...WHILE)
		 */

		Scanner ler = new Scanner(System.in);
		int numero = 0, media = 0, soma = 0, cont = 0;
		boolean verdadeiro = true;

		do {
			System.out.print("Insira um numero: ");
			numero = ler.nextInt();

			if(numero % 3 == 0) {
				soma+=numero;
				cont++;
			}
			

			if (numero == 0) {
				verdadeiro = false;
			}
		} while (verdadeiro);
		
		media = soma / cont;
		System.out.printf("A m�dia de todos os numero multiplos de 3 � %d", media);

	}
}