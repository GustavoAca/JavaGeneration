public class Funcionario {
  private String nome;
  private String setor;
  private String empresa;
  private int codigo;

  public Funcionario(String nome, String setor, String empresa, int codigo){
    this.nome = nome;     
      this.setor = setor;
      this.empresa = empresa;
      this.codigo = codigo;
  }

  public void Status(){
    System.out.println("Nome: " + this.getNome());
    System.out.println("Setor: " + this.getSetor());
    System.out.println("Empresa: " + this.getEmpresa());
    System.out.println("Codigo: " + this.getCodigo());

  }

  //AUXILIADORES
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getSetor() {
    return setor;
  }
  public void setSetor(String setor) {
    setor = setor;
  }
  public String getEmpresa() {
    return empresa;
  }
  public void setEmpresa(String empresa) {
    this.empresa = empresa;
  }
  public int getCodigo() {
    return codigo;
  }
  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }


}
