package exer20;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exer20 {

    @Test
    public void localTime_Parsing() {
        //String to LocalTime
        String hora = "10:33:22";
        LocalTime nova = LocalTime.parse(hora, DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(nova);

        //localTime to string
        nova = nova.plusHours(2);
        hora = nova.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(hora);


    }

    @Test
    public void localDate_Parsing() {
        String data = "15/11/2015";
        LocalDate nova = LocalDate.parse(data,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(nova);

        //LocalTime to String
        nova = nova.plusDays(2);
        data = nova.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(data);
    }

    @Test
    public void localDateTime_Parsing() {
        //String to LocalTime
        String data="15/11/2015 10:50:10";
        LocalDateTime nova = LocalDateTime.parse(data,DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println(data);
    }
}
