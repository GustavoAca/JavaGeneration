package Produtos;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
  private ArrayList<String> produto = new ArrayList<>();
  Scanner le = new Scanner(System.in);

  public void cadastrarPro() {
    // Para cadastrar 6 produtos
    for (int i = 0; i < 6; i++) {
      Scanner ler = new Scanner(System.in);
      System.out.println("Insira o produto");
      String pro = ler.nextLine();
      //função para add na lista
      produto.add(pro);
    }

    System.out.println("Deseja alterar ou remover algo?\n 1-REMOVER\n 2-ALTERAR");
    int opcao = le.nextInt();
    switch (opcao) {
      case 1:
        this.removerPro();
        break;
      case 2:
        this.atualizarPro();
      default:
        break;
    }
  }

  public void removerPro() {
    System.out.println(produto);
    System.out.println("Insira qual produto quer excluir: ");
    int opcao = le.nextInt();
    //função que remove o index da lista, a opção vai escolher quanl vai de 0 até o ultimo indice da lista
    produto.remove(opcao);
    //vai mostrar a lista atualizada
    this.Status();
  }

  public void atualizarPro() {
    //Vai mostrar toda a lsita
    System.out.println(produto);

    System.out.println("Insira qual produto quer alterar: ");
    int opcao = le.nextInt();

    System.out.println("O que vc quer adicionar: ");
    String troca = le.next();
    //set.(index, objeto inserido) ele vai perguntar qual numero do index vai ser alterado da lista
    produto.set(opcao, troca);
    //chama o metodo que mostra toda a listas
    this.Status();
  }

  public void Status() {
    System.out.println(produto);
  }

  public ArrayList<String> getProduto() {
    return produto;
  }

  public void setProduto(ArrayList<String> produto) {
    this.produto = produto;
  }

}
