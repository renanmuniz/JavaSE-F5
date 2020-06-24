package exer9;

import exer8.Forno;
import org.junit.Test;

public class Exer9 {
    //Pizzaria com lambda
    @Test
    public void exer9() {
        Forno forno = new Forno();
        forno.assar(() -> System.out.println("Pizza Lambda"));
        forno.assar(()->{
            System.out.println("molho");
            System.out.println("queijo");
            System.out.println("azeitona");
        });
    }


}
