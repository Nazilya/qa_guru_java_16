package guru.qa.lesson9.hw9;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    // на примере HashMap c циклом for (foreach, не классический)
    public static void main(String[] args) {
        TestData testData = new TestData();

        Map<Integer, Student> map = new HashMap<>();
//добавить
        map.put(54218, testData.st1);
        map.put(38528, testData.st2);
        map.put(52914, testData.st3);
        map.put(null, testData.st5);
        map.put(34951, testData.st4);   // value = null
//получить
        System.out.println("Студент, у которого еще нет студенческого билета: " + map.get(null));
        System.out.println("------------------");
//удалить
        map.remove(52914); //удалить студента со студ билетом N 52914
        System.out.println("Все студенты: " + map);
        System.out.println("------------------");

//Set-ы
//цикл for (foreach, не классический)
        for (Map.Entry<Integer, Student> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null)
                System.out.println("Вывести студента, у которого есть студ билеты и заполнены данные: "
                        + entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("------------------");
        System.out.println("Получить номера всех студ билетов (ключи): " + map.keySet());

        System.out.println("------------------");
        System.out.println("Вывести всех студентов (значения): " + map.values());


    }

}

