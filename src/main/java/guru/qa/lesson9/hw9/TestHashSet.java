package guru.qa.lesson9.hw9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {
    // на примере HashSet c циклом while
    public static void main(String[] args) {
        TestData testData = new TestData();
        Set<Integer> set = new HashSet<>();
//добавить
        set.add(44);
        set.add(52);
        set.add(-8);
        set.add(null);      // null
        set.add(-97);
        set.add(52);      //дубль st2

//вывести в консоль, используя цикл while

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("------------------");

//удалить
        set.remove(-97);
        System.out.println("Вывести в консоль коллекцию HashSet после удаления элемента -97: " + set);
        System.out.println("------------------");
//поиск по значению
        if (set.contains(-8)) {
            System.out.println("Значение " + -8 + " найдено");
        } else {
            System.out.println("Значение не найдено");
        }
    }

}