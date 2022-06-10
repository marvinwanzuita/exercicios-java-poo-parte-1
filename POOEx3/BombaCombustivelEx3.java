package POOEx3;

public class BombaCombustivelEx3 {

  private String tipoCombustivel;
  private double valorLitro;

  private double quantidadeCombustivel;

  public BombaCombustivelEx3(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
    this.tipoCombustivel = tipoCombustivel;
    this.valorLitro = valorLitro;
    this.quantidadeCombustivel = quantidadeCombustivel;
  }

  // SETTERS E GETTERS

  public String getTipoCombustivel() {
    return tipoCombustivel;
  }

  public void setTipoCombustivel(String tipoCombustivel) {
    this.tipoCombustivel = tipoCombustivel;
  }

  public double getValorLitro() {
    return valorLitro;
  }

  public void setValorLitro(double valorLitro) {
    this.valorLitro = valorLitro;
  }

  public double getQuantidadeCombustivel() {
    return quantidadeCombustivel;
  }

  public void setQuantidadeCombustivel(double quantidadeCombustivel) {
    this.quantidadeCombustivel = quantidadeCombustivel;
  }

  @Override
  public String toString() {
    return "  ------- STATUS ATUAL BOMBA DE COMBUSTÍVEL -------" +
            "\n           Tipo de combustível: " + tipoCombustivel +
            "\n                Valor do litro: " + valorLitro +
            "\n Quantidade de litros na bomba: " + String.format("%.2f", quantidadeCombustivel);
  }

  // MÉTODOS

  public double abastacerPorValor(double valor){
    double quantidadeAbastecido = valor / valorLitro;
    quantidadeCombustivel -= quantidadeAbastecido;
    return quantidadeAbastecido;
  }
  public double abastecerPorLitro(double litro){
    quantidadeCombustivel -= litro;
    return litro * valorLitro;
  }



}
