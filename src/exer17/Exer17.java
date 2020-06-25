package exer17;

import org.junit.Test;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;


public class Exer17 {

    @Test
    public void exer17_criar() {
        //Criacao agora
        LocalTime agora = LocalTime.now();
        System.out.println(agora);

        //Criacao manual
        LocalTime h1 = LocalTime.of(9,00);
        System.out.println(h1);

        //Criacao manual
        LocalTime h2 = LocalTime.of(9,30,33);
        System.out.println(h2);

        //Criacao manual
        LocalTime h3 = LocalTime.of(9,33,33,88);
        System.out.println(h3);

        System.out.println(h3.getHour());
        System.out.println(h3.getMinute());
        System.out.println(h3.getSecond());
    }

    @Test
    public void exer17_adicionar_remover(){
        LocalTime h = LocalTime.now();
        System.out.println(h);

        //adicionar
        h=h.plusHours(2);
        System.out.println(h);

        h=h.plusMinutes(2);
        System.out.println(h);

        h=h.plusSeconds(10);
        System.out.println(h);

        //remover
        h=h.minusHours(2);
        System.out.println(h);

        h=h.minusMinutes(2);
        System.out.println(h);

        h=h.minusSeconds(10);
        System.out.println(h);
    }

    @Test
    public void exer17_Diferenca_Intervalo() {
        LocalTime cedo  = LocalTime.of(8,00,00);
        LocalTime noite = LocalTime.of(18,33,44);

        long dif = cedo.until(noite, ChronoUnit.HOURS);
        System.out.println(dif);

        dif = cedo.until(noite, ChronoUnit.MINUTES);
        System.out.println(dif);

        dif = cedo.until(noite, ChronoUnit.SECONDS);
        System.out.println(dif);

        Duration duracao = Duration.between(cedo,noite);
        System.out.println(duracao);

    }



}
