package exer2;

public interface Pessoa {
    default void falar() {
        System.out.println("Pessoa falando...");
    }
}
