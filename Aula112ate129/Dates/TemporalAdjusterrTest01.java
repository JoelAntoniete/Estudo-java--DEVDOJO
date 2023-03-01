package Aula112ate129.Dates;

import java.time.LocalDate;

public class TemporalAdjusterrTest01 {
    public static void main(String[] args) {
        //Classe que mostra qual é o proximo dia util

        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        LocalDate now1 = LocalDate.now().with(new ObterProximoDiaUtil());
        System.out.println(now1);
        System.out.println(now1.getDayOfWeek());


    }
}
