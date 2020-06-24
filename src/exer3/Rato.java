package exer3;

public interface Rato {
    default void comer() {
        System.out.println("Rato comendo");
    }
}
