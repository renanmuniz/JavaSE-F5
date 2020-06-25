package exer19;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Exer19 {

    @Test
    public void exer19_criar() {
        //criacao agora
        LocalDateTime hoje = LocalDateTime.now();
        System.out.println(hoje);

        //get localtime
        System.out.println(hoje.getHour());
        System.out.println(hoje.getMinute());
        System.out.println(hoje.getDayOfMonth());
        System.out.println(hoje.getDayOfWeek());
        System.out.println(hoje.getDayOfYear());

        //criacao manual
        LocalDateTime d1 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(d1);

        //criacao manual só com dias
        LocalDateTime d2 = LocalDateTime.of(2015,2,2,20,30,11);
        System.out.println(d2);
    }






}
