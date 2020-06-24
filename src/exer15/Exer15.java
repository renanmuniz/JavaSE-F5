package exer15;

import org.junit.Test;

import java.util.Optional;

public class Exer15 {

    @Test
    public void exer15_1() {
        Optional<Carro> c1 = Optional.of(new Carro("bmw"));
        if(c1.isPresent()) {
            System.out.println("Tem referência: " + c1.get().getMarca());
        } else {
            System.out.println("não tem referência");
        }
    }

    @Test
    public void exer15_2() {
        Optional<Carro> c1 = Optional.empty();
        if(c1.isPresent()) {
            System.out.println("Tem referência: " + c1.get().getMarca());
        } else {
            System.out.println("não tem referência");
        }
    }

    @Test
    public void exer15_3() {
        Carro x = null;
        Optional<Carro> c1 = Optional.ofNullable(x);
        if(c1.isPresent()) {
            System.out.println("Tem referência: " + c1.get().getMarca());
        } else {
            System.out.println("não tem referência");
        }
    }

    @Test
    public void exer15_4() {
        Carro x = new Carro("VW");
        Optional<Carro> c1 = Optional.ofNullable(x);
        if(c1.isPresent()) {
            System.out.println("Tem referência: " + c1.get().getMarca());
        } else {
            System.out.println("não tem referência");
        }
    }

    @Test
    public void exer15_5() {
        Carro x = new Carro("toyota");
        Optional<Carro> c1 = Optional.ofNullable(x);
        c1.ifPresent((c) -> System.out.println(c.getMarca()));

        x = null;
        c1 = Optional.ofNullable(x);
        c1.ifPresent((c) -> System.out.println(c.getMarca()));
    }

    @Test
    public void exer15_6() {
        Carro x = new Carro("ford");
        Optional<Carro> c1 = Optional.ofNullable(x);
        c1.ifPresent((c) -> System.out.println(c.getMarca()));

        x = null;
        c1 = Optional.ofNullable(x);
        System.out.println(c1.orElse(new Carro("outro 2")).getMarca());
    }

    @Test
    public void exer15_7() {
        Carro x = new Carro("audi");
        Optional<Carro> c1 = Optional.ofNullable(x);
        System.out.println(c1.orElseThrow(()->new IllegalArgumentException("Obrigatorio")).getMarca());

        x = null;
        c1 = Optional.ofNullable(x);
        try{
            System.out.println(c1.orElseThrow(()->new IllegalArgumentException("Obrigatorio2")).getMarca());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
