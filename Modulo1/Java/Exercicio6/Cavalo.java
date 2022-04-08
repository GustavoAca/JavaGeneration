public class Cavalo extends Animais  {
  private boolean corre;

  public Cavalo(String nome, int idade,  boolean corre){
    this.setNome(nome);
    this.setIdade(idade);
    this.setCorre(corre);
    
  }

  public void Status(){
    System.out.println("Nome: " + this.getNome());
    System.out.println("Idade: " + this.getIdade());
    this.emitirSom();
    System.out.println("Corre: " + this.isCorre());
    System.out.println("");
  }

  @Override
  public void emitirSom(){
    System.out.println("Rilincho");
  }

//sobrecarga
  public void filho(String  mae, String pai){
    System.out.println("Mae é:" + mae);
    System.out.println("pai é:" + pai);

}
//sobrecarga
public void filho(String mae){
    System.out.println("Mae é: " + mae);
}

  //sobrecarga
public void filho(){
    System.out.println("sem mae e pai ");
}

  
  
  public Cavalo(boolean corre) {
    this.corre = corre;
  }

  public boolean isCorre() {
    return corre;
  }

  public void setCorre(boolean corre) {
    this.corre = corre;
  }

}
