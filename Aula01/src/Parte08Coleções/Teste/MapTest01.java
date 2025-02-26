package Parte08Coleções.Teste;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.putIfAbsent("vc2", "você");

        System.out.println(map);

        for (String key : map.keySet()) { // É mais comum pegar da chave pro valor do que o contrario.
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("--------------------------------");

        for (String value : map.values()) { // Uma forma mais generica.
            System.out.println(value);
        }

        System.out.println("--------------------------------");

        for (Map.Entry<String, String> entry : map.entrySet()) { // Forma mais eficiente.
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
