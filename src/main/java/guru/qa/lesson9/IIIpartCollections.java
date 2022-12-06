package guru.qa.lesson9;

import java.util.*;

public class IIIpartCollections {
    public static void main(String[] args) {

//JavaPartII - Collections
//List
        List<Integer> intList1 = List.of(1, 42, -100);
        intList1.remove(1);         // удалить элемент с индексом 1 - число 42
        intList1.remove((Integer) 1);   //удалить объект - число 1

        List<Integer> intList2 = new ArrayList<>();
        intList2.add(1);

//Set
        Set<String> stringSet = Set.of("Dima", "Vasya");   //только уникал-е значения

// Map
        Map<String, People> aMap = Map.of(
                "1234", new People(),
                "5234", new People()
        );
        Set<String> keySet = aMap.keySet();                         //чтобы перебрать только ключи
        Collection<People> values = aMap.values();                  //чтобы перебрать только значения
        Set<Map.Entry<String, People>> entries = aMap.entrySet();   //перебрать и ключи, и значения
        for(Map.Entry<String, People> entry : entries) {
            if (entry.getKey().equals("5234")) {
                entry.getValue().sayRespect();
            }
        }
        aMap.put("123456", new People());
    }
}


