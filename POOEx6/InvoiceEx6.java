package POOEx6;

public class InvoiceEx6 {

  private int numeroItem;
  private String descricaoItem;
  private int quantidadeItem;
  private double preçoItem;

  public InvoiceEx6() {}


  public int getNumeroItem() {
    return numeroItem;
  }

  public void setNumeroItem(int numeroItem) {
    this.numeroItem = numeroItem;
  }

  public String getDescricaoItem() {
    return descricaoItem;
  }

  public void setDescricaoItem(String descricaoItem) {
    this.descricaoItem = descricaoItem;
  }

  public int getQuantidadeItem() {
    return quantidadeItem;
  }

  public void setQuantidadeItem(int quantidadeItem) {
    if (quantidadeItem < 0) {
      this.quantidadeItem = 0;
    } else {
      this.quantidadeItem = quantidadeItem;
    }
  }

  public double getPreçoItem() {
    return preçoItem;
  }

  public void setPreçoItem(double preçoItem) {
    if (preçoItem < 0) {
      this.preçoItem = 0;
    } else {
      this.preçoItem = preçoItem;
    }
  }

  public double getInvoiceAmount(){
    return quantidadeItem * preçoItem;
  }



}
