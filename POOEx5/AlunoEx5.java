package POOEx5;

public class AlunoEx5 {

  // ATRIBUTOS

  private String disciplina;
  private String nome;
  private double notaProva1;
  private final double PESO_PROVA_1 = 2.5;
  private double notaProva2;

  private final double PESO_PROVA_2 = 2.5;

  private double notaTrabalho;

  private final double PESO_TRABALHO = 5;

  private double mediaFinal;

  private final double MEDIA_APROVADO = 6;

  private double restanteMediaFinal;

  // CONSTRUTOR

  public AlunoEx5(){

  }

  // GETTERS E SETTERS


  public double getMEDIA_APROVADO() {
    return MEDIA_APROVADO;
  }

  public String getDisciplina() {
    return disciplina;
  }
  public void setDisciplina(String disciplina) {
    this.disciplina = disciplina;
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getNotaProva1() {
    return notaProva1;
  }

  public void setNotaProva1(double notaProva1) {
    this.notaProva1 = notaProva1;
  }

  public double getNotaProva2() {
    return notaProva2;
  }

  public void setNotaProva2(double notaProva2) {
    this.notaProva2 = notaProva2;
  }

  public double getNotaTrabalho() {
    return notaTrabalho;
  }

  public void setNotaTrabalho(double notaTrabalho) {
    this.notaTrabalho = notaTrabalho;
  }


  // METODOS

  public double media(){
    return (((notaProva1 * PESO_PROVA_1) +
             (notaProva2 * PESO_PROVA_2) +
             (notaTrabalho * PESO_TRABALHO)) / (PESO_PROVA_1 + PESO_PROVA_2 + PESO_TRABALHO));
  }

  public double restanteFinal(){
    if (mediaFinal >= MEDIA_APROVADO){
      return 0;
    } else {
      return (MEDIA_APROVADO - media());
    }
  }

  // TO STRING


  @Override
  public String toString() {
    return "----- NOTAS FINAIS -----" +
         "\nAluno:          " + nome +
         "\nNota Prova 1:   " + notaProva1 +
         "\nNota Prova 2:   " + notaProva2 +
         "\nNota Trabalho:  " + notaTrabalho +
         "\n------------------------"   ;
  }
}
