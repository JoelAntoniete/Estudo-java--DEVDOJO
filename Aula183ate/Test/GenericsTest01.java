package Aula183ate.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Pedro");
        lista.add("Maria");

        for (String o: lista) {
            System.out.println(o);
        }
    }
}
