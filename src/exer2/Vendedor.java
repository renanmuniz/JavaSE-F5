package exer2;

public interface Vendedor {
    default void vendendo(String coisa) {
        System.out.println("Vendendo: " + coisa);
    }
}
