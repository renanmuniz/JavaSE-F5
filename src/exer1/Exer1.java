package exer1;

import org.junit.Test;

public class Exer1 {

    @Test
    public void exer1() {
        Torcedor t1 = new Corinthians();
        t1.torcer();
        t1=new Londrina();
        t1.torcer();
    }

}
