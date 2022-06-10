package POOEx1;


import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class ProgramEx1 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    PessoaEx1 pessoa = new PessoaEx1();

    LocalDate data = LocalDate.now();

    int ano = data.getYear();


    System.out.println();
    System.out.println("EXERCICIO POO 3");
    System.out.println("Crie uma classe para representar uma Pessoa\n" +
            "com os atributos privados de nome, data de nascimento e altura.\n" +
            "Crie os métodos públicos necessários para getters e setters\n" +
            "e também um método para imprimir todos dados de uma pessoa.\n" +
            "Crie um método para calcular a idade da pessoa.");

    System.out.println();
    System.out.print("Digite o nome: ");
    pessoa.setNome(sc.nextLine());

    System.out.println();
    System.out.println("Digite a data de nascimento: ");
    System.out.print("Dia: ");
    pessoa.setDiaNascimento(sc.nextInt());
    System.out.print("Mês: ");
    pessoa.setMesNascimento(sc.nextInt());
    System.out.print("Ano: ");
    pessoa.setAnoNascimento(sc.nextInt());

    System.out.println();
    System.out.println("Digite a altura: ");
    pessoa.setAltura(sc.nextDouble());

    System.out.println();
    System.out.println(pessoa);

    System.out.println();
    System.out.print("A idade atual da pessoa é : " + pessoa.calcularIdade(ano));

  }
}
