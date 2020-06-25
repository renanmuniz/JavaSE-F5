package exer16;

public class Compra {

    private String nome;

    public Compra(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
