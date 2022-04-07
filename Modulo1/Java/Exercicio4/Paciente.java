public class Paciente {
    private boolean doente;
    private String nome;
    private String nSus;
    private String receita;


    public Paciente(boolean doente, String nome, String nSus, String receita){
    this.doente = doente;             
        this.nome = nome;
        this.nSus = nSus;
        this.receita = receita;
    }

    public void Status(){
      System.out.println("Nome: " + this.getNome());
      System.out.println("Numero do SUS: " + this.getnSus());
      if(this.isDoente() == true){
        System.out.println("Receita: " + this.getReceita());
      }
     
    }

    //AUXILIAR
    public boolean isDoente() {
      return doente;
    }
    public void setDoente(boolean doente) {
      this.doente = doente;
    }
    public String getNome() {
      return nome;
    }
    public void setNome(String nome) {
      this.nome = nome;
    }
    public String getnSus() {
      return nSus;
    }
    public void setnSus(String nSus) {
      this.nSus = nSus;
    }
    public String getReceita() {
      return receita;
    }
    public void setReceita(String receita) {
      this.receita = receita;
    }

    
}
