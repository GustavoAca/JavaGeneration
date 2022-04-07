public class Preguica extends Animais  {
    private boolean subiArvore;

public Preguica(String nome, int idade, String som, boolean subiArvore){
    this.setNome(nome);
  this.setIdade(idade);
  this.setNome(nome);
    this.setSubiArvore(subiArvore);
}

    public void Status(){
      System.out.println("Nome: " + this.getNome());
      System.out.println("Idade: " + this.getIdade());
      System.out.println("Som: " + this.getSom());
      System.out.println("Sobe em arvores: " + this.isSubiArvore());
      System.out.println("");
    }

    public boolean isSubiArvore(){
      return subiArvore;
    }

    public void setSubiArvore(boolean subiArvore){
      this.subiArvore = subiArvore;
    }
}
