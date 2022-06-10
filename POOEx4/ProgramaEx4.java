package POOEx4;

import java.util.Scanner;

public class ProgramaEx4 {
  public static void main(String[] args) {

    System.out.println();
    System.out.println("EXERCICIO POO 4");
    System.out.println("Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também disponibilizar os seguintes métodos:\n" +
            "a. Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);\n" +
            "b. Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);\n" +
            "c. Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);\n" +
            "d. Sobe: para subir um andar (não deve subir se já estiver no último andar);\n" +
            "e. Desce: para descer um andar (não deve descer se já estiver no térreo);");

    Scanner sc = new Scanner(System.in);
    int respostaPergunta;

    System.out.println();
    System.out.print("Digite o total de andares do prédio:   ");
    int andares = sc.nextInt();

    System.out.print("Digite a capacidade total do elevador: ");
    int capacidade = sc.nextInt();

    ElevadorEx4 elevador = new ElevadorEx4(andares, capacidade);

    do {

      System.out.println();
      System.out.println("Qual operação deseja realizar no elevador?\n" +
              "1 = Entrar uma pessoa no elevador;\n" +
              "2 = Sair uma pessoa do elevador;\n" +
              "3 = Subir um andar;\n" +
              "4 = Descer um andar;\n" +
              "5 = Encerrar programa.");
      respostaPergunta = sc.nextInt();

      switch (respostaPergunta){
        case 1:
          if((elevador.getQuantidadePessoas() + 1) > (elevador.getCapacidadeTotal())){
            System.out.println("!!! Lotação máxima. Aguarde esvaziar o elevador. !!!");
          } else {
            elevador.entra();
          }
          break;
        case 2:
          if((elevador.getQuantidadePessoas() - 1) < 0){
            System.out.println("!!! Elevador vazio. Aguarde entrar mais pessoas. !!!");
          } else {
            elevador.sai();
          }
          break;
        case 3:
          if((elevador.getAndarAtual() + 1) > (elevador.getTotalAndares())){
            System.out.println("!!! Elevador já está no último andar. !!!");
          } else {
            elevador.sobe();
          }
          break;
        case 4:
          if((elevador.getAndarAtual() - 1) < 0){
            System.out.println("!!! Elevador já está no térreo. !!!");
          } else {
            elevador.desce();
          }
          break;
        case 5:
          System.out.println("Encerrando programa...");
          break;
        default:
          System.out.println("Comando inválido.");
      }
      System.out.println("---------------------------");
      System.out.println(elevador);
      System.out.println("---------------------------");

    } while (respostaPergunta != 5);



  }
}
