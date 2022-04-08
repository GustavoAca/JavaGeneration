public class Preguica extends Animais  {
    private boolean subiArvore;

public Preguica(String nome, int idade,  boolean subiArvore){
    this.setNome(nome);
  this.setIdade(idade);
  this.setNome(nome);
    this.setSubiArvore(subiArvore);
}

    public void Status(){
      System.out.println("Nome: " + this.getNome());
      System.out.println("Idade: " + this.getIdade());
      this.emitirSom();
      System.out.println("Sobe em arvores: " + this.isSubiArvore());
      System.out.println("");
    }

    @Override
    public void emitirSom(){
      System.out.println("Barulho de preguiça");
    }

    public boolean isSubiArvore(){
      return subiArvore;
    }

    public void setSubiArvore(boolean subiArvore){
      this.subiArvore = subiArvore;
    }
}
