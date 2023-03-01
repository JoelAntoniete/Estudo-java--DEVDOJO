package Aula112ate115.Dates;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        //ela pega intervalo de dias

        //A Classe period so aceita um LocalDate, nao um LocalDateTime
        LocalDate ld = LocalDate.now();
        LocalDate ld1 = LocalDate.now().plusDays(200);

        Period periodo = Period.between(ld, ld1);
        Period periodo1 = Period.ofDays(10);
        Period periodo2 = Period.ofWeeks(20); //como ele nao trabalha com semanas ele retorna em dias
        Period periodo3 = Period.ofMonths(3);
        Period periodo4 = Period.ofYears(3);


        System.out.println(periodo);
        System.out.println(periodo1);
        System.out.println(periodo2);
        System.out.println(periodo3);
        System.out.println(periodo4);

        //saber quantos meses tem em um periodo de dias
        System.out.println(ld.until(ld.plusDays(periodo2.getDays()), ChronoUnit.MONTHS));
    }
}
