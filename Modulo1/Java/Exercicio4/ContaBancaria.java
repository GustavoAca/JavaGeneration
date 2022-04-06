public class ContaBancaria {
    private  int saldo;
    private boolean contaCorrente;
    private boolean contaPoupanca;
  private int numeroConta;

  public ContaBancaria(boolean contaCorrente, boolean contaPoupanca, int saldo, int numeroConta){
    this.contaCorrente = contaCorrente;
    this.contaPoupanca = contaPoupanca;
    this.numeroConta= numeroConta;
    this.saldo = saldo;

  }

  

  public void Status(){
    System.out.println("Numero da conta: " + this.getNumeroConta());
    System.out.println("Saldo na conta: " + this.getSaldo());
  }


  //AUXILIARES
  public int getSaldo() {
    return saldo;
  }
  public void setSaldo(int saldo) {
    this.saldo = saldo;
  }
  public boolean isContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(boolean contaCorrente) {
    this.contaCorrente = contaCorrente;
  }
  public boolean isContaPoupanca() {
    return contaPoupanca;
  }
  public void setContaPoupanca(boolean contaPoupanca) {
    this.contaPoupanca = contaPoupanca;
  }
  public int getNumeroConta() {
    return numeroConta;
  }
  public void setNumeroConta(int numeroConta) {
    this.numeroConta = numeroConta;
  }

  

  
  
  
  
    
}
