package Aula161ate.Test;

import Aula161ate.Dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("123456", "Samsung");
        Smartphone s2 = new Smartphone("56789", "Iphone");
        Smartphone s3 = new Smartphone("45678", "Pixel");
        
        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        for (Smartphone smartphone: smartphones) {
            System.out.println(smartphone);
        }
        Smartphone s4 = new Smartphone("22222", "Pixel");
        System.out.println(s4.equals(s2));
        System.out.println(smartphones.contains(s4)); //verifica se tem o objeto na lista

        System.out.println(smartphones.indexOf(s2)); //mostra o indice que se encontra o objeto
        smartphones.add(0, s4);
    }
}
