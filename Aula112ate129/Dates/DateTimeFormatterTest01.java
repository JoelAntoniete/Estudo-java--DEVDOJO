package Aula112ate129.Dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        //Professor pediu sempre que ouvimos formatt em alguma classe, ela transforma de um objeto para uma String

        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE); // '20111203'
        String s2 = date.format(DateTimeFormatter.ISO_DATE); //'2011-12-03' ele tbem aceita offSet
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE); //'2011-12-03'
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //para transformar de uma string para um objeto, quando colocarmos a String é impotante colocar o formato correto
        LocalDate parse1 = LocalDate.parse("20230301", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse1);

        //podemos colocar o format em uma LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        String format = localDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(format);

        //caso queiramos fazer o parse do LocalDateTime , lembrar que ele já usa o padrao ISO_DATE_TIME
        // logo nao e necessario colocar formatt se ja estiver  no formato ISO_DATE_TIME

        LocalDateTime parse = LocalDateTime.parse("2023-03-01T20:37:04.4028256");
        System.out.println(parse);

        //tbem podemos mudar o formato caso desejamos
        LocalDateTime parse2 = LocalDateTime.parse("2023-03-01T20:37:04.4028256", DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(parse2);

        //podemos escrever qual formato desejamos tbem
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyy");
        String formatbr = LocalDate.now().format(formatterBR);
        System.out.println(formatbr);

        //podemos parsear quando , basta usarmos o formato feito no parse
        LocalDate parse3 = LocalDate.parse("01/03/2023", formatterBR);
        System.out.println(parse3);

        //podemos tbem colocar local
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String format1 = LocalDate.now().format(dateTimeFormatter);
        System.out.println(format1);

        //podemos fazer o parse
        LocalDate parse4 = LocalDate.parse("01.März.2023", dateTimeFormatter);//podemos colocar um formato ja com local
        System.out.println(parse4);

    }
}
