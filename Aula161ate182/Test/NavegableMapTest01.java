package Aula161ate182.Test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavegableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("H", "Letra H");
        map.put("I", "Letra I");
        map.put("C", "Letra C");

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(map.headMap("C")); //ele ira retornar todos que estao abaixo da letra C
        System.out.println(map.headMap("C", true)); //ele ira retornar todos que estao abaixo da letra C incluindo o C

        //lower  (ele traz o que é imediatamente menor (<))
        //floor (ele traz o que é imediatamente menor ou igual(<=))
        //higher (ele traz o que é imediatamente maior (>))
        //ceiling (ele traz o que é imediatamente maior ou igual(=>))
        System.out.println(map.ceilingKey("C"));


    }
}
