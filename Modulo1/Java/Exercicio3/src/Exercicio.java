import java.util.Random;
public class Exercicio {
  public static void main(String[] args) {
    /*
     Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
		a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
		das matrizes N1 e N2;
		b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
		posição das matrizes N1 e N2.
     */
    int[][] N1 = new int [4][6];
    int[][] N2 = new int [4][6];
    int[][] M1 = new int [4][6];
    int[][] M2 = new int [4][6];

    Random ale = new Random();
    //prencher a matriz N1
    System.out.println("__________Matriz N1_________");
    for(int i = 0; i< 4; i++){
      for(int j = 0; j< 6; j++){
          N1[i][j] = ale.nextInt(100);
          System.out.print( N1[i][j] + " | ");
      }
      System.out.println("\n");
    }

    System.out.println("____________________________");
    System.out.println("\n");

    //prencher a matriz N2
    System.out.println("__________Matriz N2_________");
    for(int i = 0; i< 4; i++){
      for(int j = 0; j< 6; j++){
          N2[i][j] = ale.nextInt(100);
          System.out.print( N2[i][j] + " | ");
      }
      System.out.println("\n");
    }

    System.out.println("____________________________");
    System.out.println("\n");
      
    //Somando N1 E N2
    System.out.println("__________Matriz M1_________");
    for(int i = 0; i< 4; i++){
      for(int j = 0; j< 6; j++){
          M1[i][j] = N1[i][j] + N2[i][j] ;
          System.out.print( M1[i][j] + " | ");
      }
      System.out.println("\n");
    }

    System.out.println("____________________________");
    System.out.println("\n");
    
    //Subtraindo N1 E N2
    System.out.println("__________Matriz M2_________");
    for(int i = 0; i< 4; i++){
      for(int j = 0; j< 6; j++){
        M2[i][j] = N1[i][j] - N2[i][j] ;
        System.out.print( M2[i][j] + " | ");
      }
      System.out.println("\n");
    }


  
  }
}
