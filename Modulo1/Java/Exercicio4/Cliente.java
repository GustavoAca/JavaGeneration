import java.util.Scanner;

public class Cliente {
  /**
   * Crie uma classe cliente e apresente os atributos e métodos referentes
   * esta classe, em seguida crie um objeto cliente, defina as instancias deste
   * objeto e apresente as informações deste objeto no console.
   */

  private int idade;
  private String cpf;
  private String nome;
  private String tipoServico;

  public void CadastrarCLiente() {
    String tex;
    int inteiro;

    Scanner ler = new Scanner(System.in);

    System.out.print("Insira o nome: ");
    tex = ler.nextLine();
    this.setNome(tex);

    System.out.print("Insira o CPF: ");
    tex = ler.nextLine();
    this.setCpf(tex);

    System.out.print("Insira o serviço solicitado: ");
    tex = ler.nextLine();
    this.setTipoServico(tex);

    System.out.print("Insira a idade: ");
    inteiro = ler.nextInt();
    this.setIdade(inteiro);

  }

  public void Status() {
    System.out.println("-----------------------------------");
    System.out.println("Nome: " + this.nome);
    System.out.println("CPF: " + this.cpf);
    System.out.println("Idade " + this.idade);
    System.out.println("Serviço solicitado: " + this.tipoServico);
  }

  // Auxilires
  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTipoServico() {
    return tipoServico;
  }

  public void setTipoServico(String tipoServico) {
    this.tipoServico = tipoServico;
  }

}
