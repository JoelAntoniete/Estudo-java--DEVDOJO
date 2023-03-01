package Aula112ate115.Dates;

import java.util.Date;

public class DatesTest01 {
    public static void main(String[] args) {
        //apesar estar depreciada, iremos aprender caso tenhamos que mexer com sistemas legados
        Date date = new Date(1677528224759L);//Date trabalha com milisegundos des de 01/01/1970, e ele é long
        System.out.println(date.getTime());//pega os milisegundos da data atual
        System.out.println(date); //se colocarmos o milissegundos no construtor, ele retorna a data

    }
}
