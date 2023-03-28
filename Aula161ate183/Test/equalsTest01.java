package Aula161ate183.Test;

import Aula161ate183.Dominio.Smartphone;

public class equalsTest01 {
    public static void main(String[] args) {
        String nome = "William Suane";
        String nome2 = "William Suane";
        String nome3 = new String("William Suane");

        System.out.println(nome == nome2); //compara as referencias
        System.out.println(nome == nome3);
        System.out.println(nome.equals(nome3)); //compara o  valor da String

        Smartphone s1 = new Smartphone("123456", "Samsung");
        Smartphone s2 = new Smartphone("123456", "Samsung");

        System.out.println(s1.equals(s2));
    }
}
