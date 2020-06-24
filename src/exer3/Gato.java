package exer3;

public interface Gato {
    default void comer() {
        System.out.println("Gato comendo");
    }
}
