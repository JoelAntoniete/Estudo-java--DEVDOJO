package Aula112ate115.Format;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault()); //aqui sabemos como nosso sistema operacional esta configurado


        //Isso mostra todos as linguas e paises suportados pelo sistema operacional
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();
        for (String IsoLanguage: isoLanguages) {
            System.out.println(IsoLanguage);
        }
        for (String isoCountrie:isoCountries) {
            System.out.println(isoCountrie);
        }
    }
}
