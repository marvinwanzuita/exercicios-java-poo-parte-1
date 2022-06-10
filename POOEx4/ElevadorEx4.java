package POOEx4;

public class ElevadorEx4 {

  private int andarAtual;
  private int totalAndares;
  private int capacidadeTotal;
  private int quantidadePessoas;

  public ElevadorEx4(int totalAndares, int capacidadeTotal){
    this.totalAndares = totalAndares;
    this.capacidadeTotal = capacidadeTotal;
    this.andarAtual = 0;
    this.quantidadePessoas = 0;
  }

  // GETTERS AND SETTERS

  public int getAndarAtual() {
    return andarAtual;
  }

  public void setAndarAtual(int andarAtual) {
    this.andarAtual = andarAtual;
  }

  public int getTotalAndares() {
    return totalAndares;
  }

  public void setTotalAndares(int totalAndares) {
    this.totalAndares = totalAndares;
  }

  public int getCapacidadeTotal() {
    return capacidadeTotal;
  }

  public void setCapacidadeTotal(int capacidadeTotal) {
    this.capacidadeTotal = capacidadeTotal;
  }

  public int getQuantidadePessoas() {
    return quantidadePessoas;
  }

  public void setQuantidadePessoas(int quantidadePessoas) {
    this.quantidadePessoas = quantidadePessoas;
  }

  // TOSTRING

  @Override
  public String toString() {
    return  "     ANDAR ATUAL: " + andarAtual + " de " + totalAndares +
            "\nCAPACIDADE ATUAL: " + quantidadePessoas + " de " + capacidadeTotal;
  }

  // METODOS

  public void entra(){
    ++quantidadePessoas;
  }

  public void sai(){
    --quantidadePessoas;
  }

  public void sobe(){
    ++andarAtual;
  }

  public void desce(){
    --andarAtual;
  }

}
