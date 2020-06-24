package exer4;

import java.math.BigDecimal;

public interface Venda {

    static boolean vazio(Object o) {
        return o == null;
    }

    default void vender(BigDecimal valor) {
        if(vazio(valor)) {
            System.out.println("Valor não deve ser vazio.");
        } else {
            System.out.println("Vendendo R$" + valor);
        }
    }
}
