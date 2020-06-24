package exer14;

import org.junit.Test;

public class Exer14 {

    @Test
    public void exer14() {
        Show show = new Show();

        //lambda1
        show.palco((t) -> System.out.println(t));

        //referencia para metodo estatico
        show.palco(System.out::println);

        // referencia para metodo estatico 2
        show.palco(Fazer::maiusculo1);

        //referencia para metodo de instancia
        Fazer f = new Fazer();
        show.palco(f::maiusculo2);
    }
}
