public class Cachorro extends Animais {
  private boolean corre;

  public Cachorro(String nome, int idade, String som, boolean corre){
      this.setNome(nome);
    this.setIdade(idade);
    this.setSom(som);
      this.setCorre(corre);
  }

  public void Status(){
    System.out.println("Nome: " + this.getNome());
    System.out.println("Idade: " + this.getIdade());
    System.out.println("Som: " + this.getSom());
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
