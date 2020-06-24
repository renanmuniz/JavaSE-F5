package exer13;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exer13 {
    @Test
    public void exer13_1() {
        Runnable r1 = () -> System.out.println("Rodando em outra thread");
        Runnable r2 = () -> {
            for(int i=0;i<5;i++) {
                System.out.println(i);
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        Thread t2 = new Thread(r2);
        t2.start();
        new Thread(() -> System.out.println("outra thread")).start();
    }

    @Test
    public void exer13_2() {
        List<String> colecao1 = new ArrayList<>();
        colecao1.add("1");
        colecao1.add("2");
        colecao1.add("3");
        colecao1.add("4");
        colecao1.add("5");
        colecao1.forEach(s -> System.out.println(s));
    }

    @Test
    public void exer13_3() {
        Map<String, Integer> items=new HashMap<>();
        items.put("A",10);
        items.put("B",20);
        items.put("C",30);
        items.put("D",40);
        items.put("E",50);
        items.put("F",60);
        items.forEach((k,v)-> System.out.println("Chave:" + k + ",valor: " + v));
    }
}
