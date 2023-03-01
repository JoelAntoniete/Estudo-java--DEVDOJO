package Aula112ate129.Dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        // É uma classe pra fazer ajustes no tempo
        LocalDate now = LocalDate.now();
        System.out.println(now);

        //o metodo with ele muda apenas o que queiramos mudar, sem alterar o mes.
        now = now.withDayOfMonth(20); //muda apenas o dia
        now = now.withMonth(5); //muda apenas o mes
        now = now.withYear(2027);  //muda apenas o ano
        System.out.println(now);

        LocalDate now1 = LocalDate.now();
        //Ele ira mostrar que dia é a proxima quarta feira
        now1 = now1.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println(now1);

        LocalDate now2 = LocalDate.now();
        //Ele ira mostrar que dia é a quarta feira anterior
        now2 = now2.with(TemporalAdjusters.previous(DayOfWeek.WEDNESDAY));
        System.out.println(now2);

        LocalDate now3 = LocalDate.now();
        //Ele ira mostrar primeiro dia do mes
        now3 = now3.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now3);

        LocalDate now4 = LocalDate.now();
        //Ele ira mostrar o primeiro dia do ano
        now4 = now4.with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now4);
        System.out.println(now4.getDayOfWeek());

        LocalDate now5 = LocalDate.now();
        //Ele ira mostrar o primeiro dia do proximo mes
        now5 = now5.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(now5);
        System.out.println(now5.getDayOfWeek());

    }
}
