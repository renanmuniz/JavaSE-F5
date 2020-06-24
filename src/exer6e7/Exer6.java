package exer6e7;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Exer6 {

    private List<Fatura>getVendas() {
        return Arrays.asList(new Fatura(10,"CD"),
                             new Fatura(20,"dvd"),
                             new Fatura(30,"tenis"));
    }

    @Test
    public void exer6() {
        List<Fatura>vendas=getVendas();
        double total=0;
        for(int i=0;i<vendas.size();i++) {
            total += vendas.get(i).getValor();
        }
        double media = total / vendas.size();
        System.out.println(media);
    }

    // usando formato funcional:
    @Test
    public void exer7() {
        double total = getVendas().stream().mapToDouble(f -> f.getValor()).average().getAsDouble();
        System.out.println(total);
    }


}
