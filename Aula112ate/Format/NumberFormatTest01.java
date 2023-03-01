package Aula112ate115.Format;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        //formatação de numeros

        Locale localePT = new Locale("pt", "BR");
        Locale localeDefault = Locale.getDefault(); //ele pega o Locale configurado no sistema operacional

        //Alguns paises tem ja a função programada, basta fazer desta forma
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];  //NUmberformat é uma classe abstrata
        nfa[0] = NumberFormat.getInstance();  //aqui ele pega o default padrao do sistema operacional
        nfa[1] = NumberFormat.getInstance(localePT);
        nfa[2] = NumberFormat.getInstance(localeJP);
        nfa[3] = NumberFormat.getInstance(localeIT);

        Double valor = 10000.1234;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }


    }
}
