public class Patinete {

  private int valor;
  private String descricao;
  private int tamanhoRoda;
  private String modelo;
  private String nome;

  public Patinete(int valor, String descricao, int tamanhoRoda, String modelo, String nome) {
    this.valor = valor;
    this.descricao = descricao;
    this.tamanhoRoda = tamanhoRoda;
    this.modelo = modelo;
    this.nome = nome;

  }

  public void Status() {
    System.out.println("Nome: " + this.getNome());
    System.out.println("Descrição: " + this.getDescricao());
    System.out.println("Valor: " + this.getValor());
    System.out.println("Tamanho da Roda: " + this.getTamanhoRoda());
    System.out.println("Modelo: " + this.getModelo());

  }

  // AUXILIARES
  public int getValor() {
    return valor;
  }

  public void setValor(int valor) {
    this.valor = valor;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getTamanhoRoda() {
    return tamanhoRoda;
  }

  public void setTamanhoRoda(int tamanhoRoda) {
    this.tamanhoRoda = tamanhoRoda;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

}
