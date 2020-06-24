package exer4;

import org.junit.Test;

import java.math.BigDecimal;

public class Exer4 {

    @Test
    public void exer4() {
        //Referencia estatica somente pela interface
        System.out.println(Venda.vazio(null));
        System.out.println(Venda.vazio("Renan"));
        System.out.println(Venda.vazio(10));

        //Sendo usada pela classe
        Fornecedor f = new Fornecedor();
        f.vender(null);
        f.vender(BigDecimal.TEN);

        //Metodos que nao sao default nao sao herdados da interface
        //Fornecedor.vazio(null);
    }
}
