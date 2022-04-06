import java.util.Scanner;

public class Aviao {

  /*
   * Crie uma classe avião e apresente os atributos e métodos referentes
   * esta classe, em seguida crie um objeto avião, defina as instancias deste
   * objeto e apresente as informações deste objeto no console.
   * 
   */
  private int numeroId;
  private String modelo;
  private int qtdVoos;

  public Aviao(int numeroId) {
    this.numeroId = numeroId;
  }

  public void CadastrarVoo() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Insira o Modelo: ");
    this.setModelo(sc.nextLine());

    System.out.println("Insira a qtd de voo: ");
    this.setQtdVoos(sc.nextInt());

    System.out.println();
  }

  public void Status() {
    System.out.println("___________________________________");
    System.out.printf("Numero id: %d \n", getNumeroId());
    System.out.printf("Quantidades de voos: %d\n", getQtdVoos());
    System.out.printf("Modelo: %s\n", getModelo());

  }

  // Metodos auxiliares
  public int getNumeroId() {
    return numeroId;
  }

  public void setNumeroId(int numeroId) {
    this.numeroId = numeroId;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getQtdVoos() {
    return qtdVoos;
  }

  public void setQtdVoos(int qtdVoos) {
    this.qtdVoos = qtdVoos;
  }

}
