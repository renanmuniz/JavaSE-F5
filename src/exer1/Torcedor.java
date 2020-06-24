package exer1;

public interface Torcedor {

    String getNomeTime();

    default void torcer() {
        System.out.println("Torcendo para meu time " + getNomeTime());
    }

}
