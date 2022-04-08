public class Main {
    public static void main(String[] args) {
       Cachorro c = new Cachorro("nome", 6, true);
       Cavalo ca = new Cavalo("nome", 6, true);
       Preguica pe = new Preguica("nome",5,true);

       c.Status();

       ca.Status();

       pe.Status();
    }
}
