public class Cachorro extends Animais {
  private boolean corre;

  public Cachorro(String nome, int idade, boolean corre){
      this.setNome(nome);
      this.setIdade(idade);
      this.setCorre(corre);
  }

  @Override
  public void emitirSom() {
    System.out.println("AuaAU");
  }

  public void Status() {
    System.out.println("Nome: " + this.getNome());
    System.out.println("Idade: " + this.getIdade());
    this.emitirSom();
    System.out.println("Corre: " + this.isCorre());
    System.out.println("");
  }

  public Cachorro(boolean corre) {
    this.corre = corre;
  }

  public boolean isCorre() {
    return corre;
  }

  public void setCorre(boolean corre) {
    this.corre = corre;
  }

}
