package exer18;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Exer18 {

    @Test
    public void exer18_criar() {
        //criacao agora
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        //criacao manual
        LocalDate d1 = LocalDate.of(2020,1,1);
        System.out.println(d1);

        //criacao manual
        LocalDate d2 = LocalDate.of(2020, Month.JUNE,25);
        System.out.println(d2);

        //gets
        System.out.println(d2.getMonth());
        System.out.println(d2.getYear());
        System.out.println(d2.getDayOfMonth());
        System.out.println(d2.getDayOfWeek());
        System.out.println(d2.getDayOfYear());

    }

    @Test
    public void exer18_adicionar_remover() {
        LocalDate h = LocalDate.now();
        System.out.println(h);

        //adicionar
        h = h.plusDays(2);
        System.out.println(h);

        //adicionar
        h = h.plusMonths(2);
        System.out.println(h);

        //adicionar
        h = h.plusYears(10);
        System.out.println(h);

        //adicionar
        h = h.plusWeeks(2);
        System.out.println(h);

        //remover
        h = h.minusDays(2);
        System.out.println(h);

        //remover
        h = h.minusMonths(2);
        System.out.println(h);

        //remover
        h = h.minusYears(10);
        System.out.println(h);

        //remover
        h = h.minusWeeks(2);
        System.out.println(h);

    }

    @Test
    public void exer18_comparacao() {
        LocalDate hoje = LocalDate.now();
        LocalDate amanha = hoje.plusDays(1);
        if(hoje.isBefore(amanha)) {
            System.out.println("Hoje é antes de amanha");
        }
        if(amanha.isAfter(hoje)) {
            System.out.println("Amanha é depois de hoje");
        }
        LocalDate hoje2=LocalDate.now();
        if(hoje.isEqual(hoje2)) {
            System.out.println("hoje é hoje mesmo");
        }
    }

    @Test
    public void exer18_Diferenca_Intervalo() {
        LocalDate dt1 = LocalDate.of(2015,1,1);
        LocalDate dt2 = LocalDate.of(2016,2,2);

        long dif = dt1.until(dt2, ChronoUnit.DAYS);
        System.out.println(dif);

        dif = dt1.until(dt2, ChronoUnit.MONTHS);
        System.out.println(dif);

        dif = dt1.until(dt2, ChronoUnit.YEARS);
        System.out.println(dif);

        //Period duracao = new Period.between(dt1,dt2);
        //System.out.println(duracao);
    }














}
