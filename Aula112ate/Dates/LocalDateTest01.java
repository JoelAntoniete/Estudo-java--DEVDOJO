package Aula112ate115.Dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023,1,27); // aqui podmeos passar a data que queiramos ano, mes e dia
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth()); //Quantidade dos dias do mes
        System.out.println(date.lengthOfYear()); //Quantidade de dias do ano
        System.out.println(date.isLeapYear()); //Retorna true se o ano for bisexto

        //Podemos usar o ChronoField
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date.get(ChronoField.YEAR));

        //ele ja retorna na formatacao pro banco de dados
        System.out.println(date);

        //pegar a data de agora
        LocalDate agora = LocalDate.now();
        System.out.println(agora);

        //Mudar a data,como a classe é imutavel, e necessario associar a uma variavel de referencia
        LocalDate dias = agora.plusDays(2);
        LocalDate mes = agora.plusMonths(2);
        LocalDate ano = agora.plusYears(2);

        System.out.println(dias);
        System.out.println(mes);
        System.out.println(ano);
    }
}
