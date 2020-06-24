package exer6e7;

public class Fatura {
    private double valor;
    private String produto;

    public Fatura (double valor, String produto) {
        this.valor = valor;
        this.produto = produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }


}
