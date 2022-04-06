public class ProdutoElet {

  /*
  Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.
  */

  private int id;
  private String nome;
  private String categoria;
  private int valor;

  public ProdutoElet(int id, String nome, String categoria, int valor){
    this.id = id;
    this.nome = nome;
    this.categoria = categoria;
    this.valor = valor;
  }

  public void Status(){
    System.out.println("Nome: " + this.getNome());
    System.out.println("Id: " + this.getId());
    System.out.println("Categoria: " + this.getCategoria());
    System.out.println("Valor: " + this.getValor());
  }


  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getCategoria() {
    return categoria;
  }
  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }
  public int getValor() {
    return valor;
  }
  public void setValor(int valor) {
    this.valor = valor;
  }


  

}
