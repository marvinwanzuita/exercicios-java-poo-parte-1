package POOEx6;

import java.util.Scanner;

public class ProgramaEx6 {
  public static void main(String[] args) {
    System.out.println();
    System.out.println("EXERCICIO POO 6");
    System.out.println("Crie uma classe chamada Invoice que possa ser\n" +
            "utilizado por uma loja de suprimentos de informática para\n" +
            "representar uma fatura de um item vendido na loja. Uma fatura\n" +
            "deve incluir as seguintes informações como atributos:\n" +
            "a. o número do item faturado,\n" +
            "b. a descrição do item,\n" +
            "c. a quantidade comprada do item e\n" +
            "d. o preço unitário do item.\n" +
            "Sua classe deve ter um construtor que inicialize os quatro atributos.\n" +
            "Se a quantidade não for positiva, ela deve ser configurada como 0.\n" +
            "Se o preço por item não for positivo ele deve ser configurado como 0.0.\n" +
            "Forneça os métodos getters e setters para cada variável de instância.\n" +
            "Além disso, forneça um método chamado getInvoiceAmount que calcula\n" +
            "o valor da fatura (isso é, multiplica a quantidade pelo preço por item)\n" +
            "e depois retorna o valor como um double. Escreva um aplicativo de teste\n" +
            "que demonstra as capacidades da classe Invoice.");

    Scanner sc = new Scanner(System.in);
    int respostaPergunta;

    do {

      InvoiceEx6 item = new InvoiceEx6();

      System.out.println();
      System.out.println("----- CADASTRO DA COMPRA -----");

      System.out.print("Digite o número do item faturado: ");
      item.setNumeroItem(sc.nextInt());

      System.out.print("Digite a descrição do item: ");
      sc.nextLine();
      item.setDescricaoItem(sc.nextLine());

      System.out.print("Digite a quantidade comprada do item: ");
      item.setQuantidadeItem(sc.nextInt());

      System.out.print("Digite o preço unitário do item: ");
      item.setPreçoItem(sc.nextDouble());

      System.out.println();
      System.out.println("----- DESCRIÇÃO DA COMPRA -----");
      System.out.println("     Número do item: " + item.getNumeroItem() +
                         "\n  Descrição do item: " + item.getDescricaoItem() +
                         "\nQuantidade comprada: " + item.getQuantidadeItem() +
                         "\n     Preço unitário: " + item.getPreçoItem() +
                         "\n        Valor total: " + String.format("%.2f", item.getInvoiceAmount()));
      System.out.println("-------------------------------");

      System.out.println();
      System.out.println("Deseja cadastrar um novo item? " +
              "\n1 = Sim" +
              "\n2 = Não");
      respostaPergunta = sc.nextInt();
      System.out.println("-------------------------------------------");

    } while (respostaPergunta != 2);


  }
}
