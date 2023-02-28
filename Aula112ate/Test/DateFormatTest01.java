package Aula112ate.Test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        //DateFormat é uma classe para formatamos as datas

        Calendar c = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7]; //ele tbem é ma classe abstrata, as o professor no exemplo vai colocar ele como um array
        df[0] = DateFormat.getInstance();//como no calendar, é assim que instaciamos uma classe, nao usando o new
        df[1] = DateFormat.getDateInstance(); //retorna a data
        df[2] = DateFormat.getDateTimeInstance(); //retorna data e hora
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT); //retorna a a data com numeos
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM); //retorna a data escrita porem mais abreviada
        df[5] = DateFormat.getDateInstance(DateFormat.LONG); //retorna a data escrita completa
        df[6] = DateFormat.getDateInstance(DateFormat.FULL); //retorna a data escrita completa com o dia da semana

        for (DateFormat date: df) {
            System.out.println(date.format(c.getTime())); //lembrar que é necessario passar uma data pra imprimir

        }
    }
}
