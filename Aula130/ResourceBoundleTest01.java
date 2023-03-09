package Aula130;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBoundleTest01 {
    public static void main(String[] args) {
        //ResourceBoundle é uma maneira que o java tem de pegar o idioma local e mudar o que ta escrito

        System.out.println(Locale.getDefault()); //Lingua do sistema operacional

        //precisamo associar o nome do arquivo com a lingua padrao do sistema operacional
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt","BR"));
        boolean teste = bundle.containsKey("sas");// verifica de existe alguma chave com esse valor
        System.out.println(teste);
        System.out.println(bundle.getString("hello")); //obtem o valor da chave

        bundle = ResourceBundle.getBundle("messages", new Locale("en","US"));
        System.out.println(bundle.getString("hello")); //obtem o valor da chave



    }
}
