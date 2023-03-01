package Aula112ate115.Dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        // LocalTime lct = LocalTime.of();  //podemos colocar a hora da mesma forma que o LocalDate
        LocalTime lct = LocalTime.now();
        System.out.println(lct);
        System.out.println(lct.getHour());
        System.out.println(lct.getMinute());
        System.out.println(lct.getSecond());
        System.out.println(lct.getNano());

        //Podemos usar o ChronoField
        System.out.println(lct.get(ChronoField.HOUR_OF_DAY));

        System.out.println(LocalTime.MIN); //Mostra meia noite
        System.out.println(LocalTime.MAX); //Hora Maxima

    }



}
