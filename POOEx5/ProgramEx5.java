package POOEx5;

import java.util.Scanner;

public class ProgramEx5 {
  public static void main(String[] args) {

    System.out.println();
    System.out.println("EXERCICIO POO 5");
    System.out.println("Escreva uma classe cujos objetos representam alunos\n" +
            "matriculados em uma disciplina. Cada objeto dessa classe\n" +
            "deve guardar os seguintes dados do aluno: matrícula, nome,\n" +
            "2 notas de prova e 1 nota de trabalho.\n" +
            "Escreva os seguintes métodos para esta classe:\n" +
            "a. media: calcula a média final do aluno (cada prova\n" +
            "   tem peso 3,5 e o trabalho tem peso 3)\n" +
            "b. final: calcula quanto o aluno precisa para a prova final\n" +
            "   (retorna zero se ele não for para a final)");

    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    int respostaPergunta;



    do {

      AlunoEx5 aluno = new AlunoEx5();

      System.out.println();
      System.out.print("Digite a disciplina: ");
      aluno.setDisciplina(sc2.nextLine());

      System.out.print("Digite o nome do aluno: ");
      aluno.setNome(sc2.nextLine());

      System.out.print("Digite a nota da primeira prova: ");
      aluno.setNotaProva1(sc.nextDouble());

      System.out.print("Digite a nota da segunda prova: ");
      aluno.setNotaProva2(sc.nextDouble());

      System.out.print("Digite a nota do trabalho: ");
      aluno.setNotaTrabalho(sc.nextDouble());

      System.out.println();
      System.out.println(aluno);
      System.out.println("Média final do aluno: " +
                          String.format("%.2f",aluno.media()));
      if(aluno.media() < aluno.getMEDIA_APROVADO()){
        System.out.println("ALUNO REPROVADO.\nRestante de nota para a prova final: "
                         + String.format("%.2f", aluno.restanteFinal()));
      } else {
        System.out.println("ALUNO APROVADO.");
      }

      System.out.println();
      System.out.println("Deseja cadastrar um novo aluno? " +
                         "\n1 = Sim" +
                         "\n2 = Não");
      respostaPergunta = sc.nextInt();
      System.out.println("-------------------------------------------");

    } while (respostaPergunta != 2);



  }
}
