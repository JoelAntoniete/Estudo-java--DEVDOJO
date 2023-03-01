package Aula112ate115.Format;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        //Formatação de moedas

        Locale localePT = new Locale("pt", "BR");
        Locale localeDefault = Locale.getDefault(); //ele pega o Locale configurado no sistema operacional

        //Alguns paises tem ja a função programada, basta fazer desta forma
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];  //NUmberformat é uma classe abstrata
        nfa[0] = NumberFormat.getCurrencyInstance();  //aqui ele pega o default padrao do sistema operacional

        //Semelhande a formatar numero, mas e necessario o uso do eto getCurrencyInstance()
        nfa[1] = NumberFormat.getCurrencyInstance(localePT);
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);

        Double valor = 10000.1234;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }


    }
}
