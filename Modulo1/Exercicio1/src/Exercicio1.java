import java.math.*;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		Faça um programa em que permita a entrada de um número qualquer e exiba se este
		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		ímpar exiba o número elevado ao quadrado.	
		*/	
		
	Scanner in = new Scanner(System.in);
	int Numero = 0, raiz, elevado;
	
	System.out.print("Insira um numer qualquer: ");
	Numero = in.nextInt();
	
	if(Numero % 2 == 0) {
		raiz = (int) Math.sqrt(Numero);
		System.out.println("Esse numero é par, e sua raiz quadrada é : " + raiz);
	}
	
	else {
		elevado = (int) Math.pow(Numero,2);
		System.out.print("Esse numero é impar, e seu numero ao quadrado é: " + elevado);
	}
	
	
	}

}
