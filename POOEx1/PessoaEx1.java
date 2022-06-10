package POOEx1;

public class PessoaEx1 {

  // Atributos

  private String nome;
  private int diaNascimento;
  private int mesNascimento;
  private int anoNascimento;
  private double altura;

  // Construtor

  public PessoaEx1(){

  }
  public PessoaEx1(String nome, int diaNascimento, int mesNascimento, int anoNascimento, double altura) {
    this.nome = nome;
    this.diaNascimento = diaNascimento;
    this.mesNascimento = mesNascimento;
    this.anoNascimento = anoNascimento;
    this.altura = altura;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getDiaNascimento() {
    return diaNascimento;
  }

  public void setDiaNascimento(int diaNascimento) {
    this.diaNascimento = diaNascimento;
  }

  public int getMesNascimento() {
    return mesNascimento;
  }

  public void setMesNascimento(int mesNascimento) {
    this.mesNascimento = mesNascimento;
  }

  public int getAnoNascimento() {
    return anoNascimento;
  }

  public void setAnoNascimento(int anoNascimento) {
    this.anoNascimento = anoNascimento;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public int calcularIdade(int anoAtual){
    return anoAtual - anoNascimento;
  }


  @Override
  public String toString() {
    return  "Nome: " + nome +
            "\nData de nascimento: " + diaNascimento +
            "/" + mesNascimento +
            "/" + anoNascimento +
            "\nAltura: " + altura;
  }




}
