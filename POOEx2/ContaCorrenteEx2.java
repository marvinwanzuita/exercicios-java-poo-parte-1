package POOEx2;

public class ContaCorrenteEx2 {

  //  ATRIBUTOS
  private int numeroConta;
  private String nomeCorrentista;
  private double saldo;

  // CONSTRUTORES
  public ContaCorrenteEx2(int numeroConta){
    this.numeroConta = numeroConta;
    this.saldo = 0;
  }

  // SETTERS E GETTERS

  public int getNumeroConta() {
    return numeroConta;
  }

  public String getNomeCorrentista() {
    return nomeCorrentista;
  }
  public double getSaldo() {
    return saldo;
  }

  public void setNomeCorrentista(String nomeCorrentista) {
    this.nomeCorrentista = nomeCorrentista;
  }

  // MÉTODOS

  public void alterarNome(String novoNome){
    nomeCorrentista = novoNome;
  }
  public void deposito(double deposito){
    saldo += deposito;
  }

  public void saque(double saque){
    saldo -= saque;
  }

  @Override
  public String toString() {
    return "Nome do correntista: " + nomeCorrentista +
           "  \nNúmero da conta: " + numeroConta +
           "            \nSaldo: " + saldo;
  }
}
