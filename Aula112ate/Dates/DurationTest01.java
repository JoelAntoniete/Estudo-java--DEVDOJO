package Aula112ate115.Dates;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        //Ela é uma classe que foi criada pra quando vc quiser pegar um intervalo entre duas datas e é baseada em segundos e nanosegundos
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime afterTowYears = LocalDateTime.now().plusYears(2);

        LocalTime timeNow = LocalTime.now();
        LocalTime timeAfteTowHour = LocalTime.now().plusHours(2);


        Duration duration = Duration.between(now,afterTowYears);
        Duration duration1 = Duration.between(timeNow,timeAfteTowHour);
        Duration duration2 = Duration.between(Instant.now(),Instant.now().plusSeconds(1000));

        Duration d4 = Duration.ofDays(20); //ele mostra quantas horas tem em 20 dias
        Duration d5 = Duration.ofMinutes(5);


        System.out.println(duration);  //ela usa a ISO8601, ele mostra as horas de diferenca
        System.out.println(duration1);
        System.out.println(duration2);

        System.out.println(d4);
        System.out.println(d5);

        //Duration nao aceita LocalDate, por que ela nao tem segundos

    }
}
