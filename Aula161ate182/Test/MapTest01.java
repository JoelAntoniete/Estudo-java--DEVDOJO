package Aula161ate182.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        //o Map precisa do equals e o hashcode implementados
        //e ele nao mantera a ordem dos itens igual ao hashset
        Map<String, String> map = new HashMap<>();
        map.put("teclado","Keyboard");
        map.put("mouse","Mouse");
        map.put("você","You");
        //map.put("você","You");
        // o map ele caso tenha a mesma chave ele sobreescreve o valor

        map.putIfAbsent("você","you"); //esse metodo so insere se nao existir a chave
        System.out.println(map);

        for (String key:map.keySet()) {
            System.out.println("Chaves: " + key); //imprimir todas as chaves
        }
        System.out.println("------------------");

        for (String values:map.values()) {
            System.out.println("Valores: " + values); //imprimir todas as chaves
        }

        System.out.println("------------------");

        for (Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue()); //uma maneira de pegar os dois valores e imprimir
        }

        //caso queiramos manter a ordem de inserção podemos usaro o LinkedHashMap
        // Map<String, String> map = new LinkedHashMap<>();

    }
}
