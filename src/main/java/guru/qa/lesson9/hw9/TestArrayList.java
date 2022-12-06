package guru.qa.lesson9.hw9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayList {
    // на примере ArrayList c циклом for (классический)
    public static void main(String[] args) {
        TestData testData = new TestData();
//преобразовать массив в список
        String[] list0 = new String[]{"Ivan", "Ann", "Petr", "Ann", "Kate"};
        List<String> list1 = Arrays.asList(list0);
        System.out.println("Студенты потока 1: " + list1);
//добавить в новый список
        List<String> list2 = new ArrayList<>();
        list2.add("Vazya");
        list2.add("Olga");
        list2.add("Bob");
        System.out.println("Студенты потока 2: " + list2);
//получить по индексу
        System.out.println("------------------");
        System.out.println("Студент c индексом 0: " + list1.get(0));
//удалить
        // System.out.println(list1.remove(4));
//добавить эл-ты list1 в list2
        System.out.println("-------------------------");
        list2.addAll(list1);
        System.out.println("Студенты всех потоков: " + list2);

//цикл for (классический) - выводим на экран всех студентов, кроме Ann
        System.out.println("-------------------------");
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) == "Ann") {
                continue;
            }
            System.out.println("Выводим в консоль студента, есди это не Ann: " + list2.get(i));
        }
        System.out.println("-------------------------");
//цикл for (классический) - выводим на экран студентов до 1-го появления Ann
        for (String string : list2) {
            if (string == "Petr") {
                break;
            }
            System.out.println("Выводим в консоль всех студентов до Petr: " + string);
        }

    }

}
