import java.math.*;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		�mpar exiba o n�mero elevado ao quadrado.	
		*/	
		
	Scanner in = new Scanner(System.in);
	int Numero = 0, raiz, elevado;
	
	System.out.print("Insira um numer qualquer: ");
	Numero = in.nextInt();
	
	if(Numero % 2 == 0) {
		raiz = (int) Math.sqrt(Numero);
		System.out.println("Esse numero � par, e sua raiz quadrada � : " + raiz);
	}
	
	else {
		elevado = (int) Math.pow(Numero,2);
		System.out.print("Esse numero � impar, e seu numero ao quadrado �: " + elevado);
	}
	
	
	}

}
