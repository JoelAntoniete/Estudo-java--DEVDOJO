package Aula112ate115.Format;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        //É uma classe que trabalha com formato de dado de maneira mais flexivel
        String mascara = "yyy.MM.dd G 'at' HH:mm:ss z"; //o at esta com aspas simples, tudo que vc quer que o simpleDateFormat ignore
        String mascara2 = "'Brasil' dd 'de' MMMM 'de' yyyy ";
        SimpleDateFormat sdf = new SimpleDateFormat(mascara); //instaciamos um SimpleDateFormat com a mascara que queiramos
        //depois printamos com a data
        System.out.println(sdf.format(new Date()));  //esse metodo retorna uma string, logo podemos ja imprimilo direto


        //Podemos usar tbem a classe calendario, e esse exemplo mostra outra formatação
        Calendar calendario = Calendar.getInstance();
        SimpleDateFormat sdf1 = new SimpleDateFormat(mascara2);
        System.out.println(sdf1.format(calendario.getTime()));

    }
}
