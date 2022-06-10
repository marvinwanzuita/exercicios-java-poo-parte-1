package POOEx3;

import java.util.Scanner;

public class ProgramaEx3 {
  public static void main(String[] args) {

    System.out.println();
    System.out.println("EXERCICIO POO 3");
    System.out.println("Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os seguintes atributos: tipo de combustível, valor por litro e quantidade de combustível. Além desses atributos a classes deve conter os seguintes métodos.\n" +
            "a. abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra a quantidade de litros que foi colocada no veículo\n" +
            "b. abastecerPorLitro; // método onde é informado a quantidade em litros de combustível e mostra o valor a ser pago pelo cliente.\n" +
            "c. alterarValor; //altera o valor do litro do combustível.\n" +
            "d. alterarCombustivel; //altera o tipo do combustível.\n" +
            "e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba.\n" +
            "Crie uma classe que contenha um método main para testar sua classe BombaCombustível");


    Scanner sc = new Scanner(System.in);
    int respostaPergunta;

    System.out.println();
    System.out.print("Digite o tipo de combustível: ");
    String tipoCombustivel = sc.nextLine();

    System.out.print("Valor do litro de combustível: R$ ");
    double valorLitro = sc.nextDouble();

    System.out.print("Quantidade de combustível na bomba: ");
    double quantidadeCombustivelBomba = sc.nextDouble();

    BombaCombustivelEx3 combustivel = new BombaCombustivelEx3(tipoCombustivel, valorLitro, quantidadeCombustivelBomba);


    do{
      System.out.println();
      System.out.println("------------------------------------");
      System.out.println("Qual operação deseja realizar na bomba de combustível?\n" +
              "1 = Abastecer pelo valor total a ser pago;\n" +
              "2 = Abastecer pela quantidade de litros solicitada;\n" +
              "3 = Alterar valor do combustível;\n" +
              "4 = Alterar o tipo do combustível;\n" +
              "5 = Status da quantidade de combustivel da bomba;\n" +
              "6 = Sair.");
      respostaPergunta = sc.nextInt();
      System.out.println("------------------------------------");

      switch (respostaPergunta){
        case 1:
          System.out.println();
          System.out.print("Digite o valor total a ser abastecido: R$ ");
          double valorAbastecido = sc.nextDouble();
          System.out.println("Total de litros abastecidos: " +
                  String.format("%.2f", combustivel.abastacerPorValor(valorAbastecido)));
          break;
        case 2:
          System.out.println();
          System.out.print("Digite a quantidade de litros a ser abastecido: ");
          double totalLitros = sc.nextDouble();
          System.out.print("Valor total abastecido: R$ " +
                  String.format("%.2f", combustivel.abastecerPorLitro(totalLitros)));
          break;
        case 3:
          System.out.println();
          System.out.print("Digite o novo valor do combustível: R$ ");
          combustivel.setValorLitro(sc.nextDouble());
          break;
        case 4:
          System.out.println();
          System.out.print("Digite o novo tipo de combustível: ");
          sc.nextLine();
          combustivel.setTipoCombustivel(sc.nextLine());
          break;
        case 5:
          System.out.println();
          System.out.println(combustivel);
          break;
        case 6:
          System.out.println();
          System.out.println("Encerrando programa.");
          break;
        default:
          System.out.println();
          System.out.println("!!! Comando inválido !!!");
      }


    }while(respostaPergunta != 6);












  }
}
