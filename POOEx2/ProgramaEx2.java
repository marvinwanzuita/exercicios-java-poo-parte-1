package POOEx2;

import java.util.Random;
import java.util.Scanner;

public class ProgramaEx2 {
  public static void main(String[] args) {

    System.out.println();
    System.out.println("EXERCICIO POO 2");
    System.out.println("Crie uma classe para implementar uma ContaCorrente.\n" +
            "A classe deve possuir os seguintes atributos: número da conta,\n" +
            "nome do correntista e saldo. Os métodos são os seguintes: alterarNome,\n" +
            "depósito e saque; No construtor, saldo é opcional, com valor default zero\n" +
            "e os demais atributos são obrigatórios.");

    Scanner sc = new Scanner(System.in);

    Random random = new Random();

    int respostaPergunta;

    ContaCorrenteEx2 conta = new ContaCorrenteEx2(random.nextInt(1000));

    System.out.println();
    System.out.print("Digite o nome do titular da conta: ");
    conta.setNomeCorrentista(sc.nextLine());

    do {
      System.out.println();
      System.out.println("------------------------------------");
      System.out.println("Qual operação deseja realizar?\n" +
              "1 = Deposito\n" +
              "2 = Saque\n" +
              "3 = Saldo Disponível\n" +
              "4 = Alterar Nome do Correntista\n" +
              "5 = Dados da Conta\n" +
              "6 = Sair");
      respostaPergunta = sc.nextInt();


      switch (respostaPergunta){
        case 1:
          System.out.println();
          System.out.print("Digite o valor do depósito: ");
          conta.deposito(sc.nextInt());
          break;
        case 2:
          System.out.println();
          System.out.print("Digite o valor do saque: ");
          int saque = sc.nextInt();
          if ((saque > conta.getSaldo()) || (saque < 0)){
            System.out.println("Saldo Insuficiente.");
          } else {
            conta.saque(saque);
          }
          break;
        case 3:
          System.out.println();
          System.out.println("Saldo: " + conta.getSaldo());
          break;
        case 4:
          System.out.println();
          System.out.println("Digite no novo nome do correntista: ");
          sc.nextLine();
          conta.alterarNome(sc.nextLine());
          break;
        case 5:
          System.out.println();
          System.out.println(conta);
          break;
        default:
          System.out.println();
          System.out.println("Dígito incorreto.");
      }

    } while (respostaPergunta != 6);

  }
}
