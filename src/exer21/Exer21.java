package exer21;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Exer21 {

    @Test
    public void ajustadores_tempo() {
        LocalDateTime hoje = LocalDateTime.now();
        System.out.println(hoje);

        LocalDateTime proximaSexta = hoje.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(proximaSexta);

        LocalDateTime ultimoMes = hoje.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(ultimoMes);

        LocalDateTime primeiroDiaMesQueVem = hoje.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(primeiroDiaMesQueVem);

        LocalDateTime primeiroDiaDoAno = hoje.with(TemporalAdjusters.firstDayOfYear());
        System.out.println(primeiroDiaDoAno);
    }
}
