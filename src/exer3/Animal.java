package exer3;

public class Animal implements Gato, Rato {
    //um jeito de resolver é sobrescrevendo o metodo das interfaces:
    //@Override
    //public void comer() {
    //    System.out.println("Animal comendo");
    //}

    //outro jeito é referenciando de qual interface usara o metodo:
    public void comer() {
        //Rato.super.comer();
          Gato.super.comer();
    }
}
