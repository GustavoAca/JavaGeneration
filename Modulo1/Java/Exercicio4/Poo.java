public class Poo {
  public static void main(String[] args) {
    /*
     * ex 3
     * ProdutoElet pd = new ProdutoElet(1,"Gustavo", "PC Gamer", 1700);
     * 
     * pd.Status();
     */
    /*
     * ex 4
     * Funcionario fun = new Funcionario("Guilherme brigs", "Manutenção", "Itau",
     * 156 );
     * 
     * fun.Status();
     */

    // Ex5
    /*
     * Patinete pat = new Patinete(170, "descricao", 5, "P582", "Patinete simples");
     * pat.Status();
     */
    /**
     * Crie uma classe conta bancaria e apresente os atributos e métodos
     * referentes esta classe, em seguida crie um objeto conta bancaria, defina
     * as instancias deste objeto e apresente as informações deste objeto no
     * console.
     * 
     */
/*
    ContaBancaria cb = new ContaBancaria(false, true, 1750, 115484);
    ContaBancaria cc = new ContaBancaria(true, false, 184, 115254);

      cc.Status();
      cb.Status();
      */

      Paciente pc = new Paciente(true, "Geralt", "6589874514", "Amoxilina e dipirona de 8h/8h");
      Paciente pc2 = new Paciente(false, "Giratina", "6589874514", "Amoxilina e dipirona de 8h/8h");

      pc.Status();

      pc2.Status();
  }
}
