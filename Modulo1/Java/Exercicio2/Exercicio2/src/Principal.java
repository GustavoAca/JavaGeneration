import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * /*
		 * Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
		 * final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
		 * 0(zero).(DO...WHILE)
		 */
		 

		Scanner ler = new Scanner(System.in);
		int numero = 0, soma = 0;

		do {
			System.out.println("Insira o numero: ");
			numero = ler.nextInt();
			
			soma+=numero;
		} while (numero != 0);
		
		System.out.printf("A soma é: %d " + soma);
	}
}