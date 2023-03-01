package Aula112ate115.Dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        //É uma mistura do LocalDate e LocalTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //Todos os metodos da LocalDate e LocalTime estao nessa Classe
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());

        //Podemos pegar informaçoes de string
        LocalDate date = LocalDate.parse("2028-08-06");
        LocalTime time = LocalTime.parse("09:45:00");
        System.out.println(date);
        System.out.println(time);

        //Podemos transformar um LocalDate e um LocalTime em um LocalDateTime
        LocalDateTime ldt = date.atTime(time); //podemos colocar uma hora na classe LocalDate desta forma
        LocalDateTime ldt1 = date.atTime(12,45,13); //podemos colocar uma hora na classe LocalDate usando string
        LocalDateTime ldt2 = time.atDate(date); //Podemos fazer o mesmo usando o DateTime

        System.out.println(ldt);
        System.out.println(ldt1);
        System.out.println(ldt2);



    }
}
