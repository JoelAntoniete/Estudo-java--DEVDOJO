package Aula112ate115.Dates;


import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        //Calendar é a segunda classe que foi criada pa solucionar os prblemas da classe Date
        Calendar c  = Calendar.getInstance();//como calendar é uma classe abstrata nao podemos instanciar da maneira comum
        System.out.println(c);// ela mostra muita informação

        //professor mostrou esse hack pra classe calendar
        Date date = c.getTime();//se olharmos no print do calendar, o time, é em milisegundos igual ao date
        System.out.println(date);

        //Aguns metodos da classe Calendar
        System.out.println(c.getFirstDayOfWeek());//retorna um int
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(c.get(Calendar.DATE));

        //lembrando que o metodo add irá virar o mes, dia ou ano caso o numero seja maior que o padrao
        c.add(Calendar.DAY_OF_MONTH, 2); //adicionar 2 dias
        c.add(Calendar.HOUR, 5);
        Date date1 = c.getTime();
        System.out.println(date1);

        //com o metodo roll caso passe da hora ele continua no mesmo dia e recomeça a contagem
        c.roll(Calendar.HOUR, 12);
        c.roll(Calendar.DAY_OF_YEAR, 12);
        c.roll(Calendar.DAY_OF_WEEK, 12);

    }
}
