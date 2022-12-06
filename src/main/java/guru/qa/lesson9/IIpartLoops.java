package guru.qa.lesson9;
public class IIpartLoops {
//JavaPartII - Loops
    public static void main(String[] args) {

        int[] intArray1 = new int[]{1, 42, -100};
        //вариант 2 присвоения значений - по индексу
        int[] intArray2 = new int[5];
        intArray2[0] = 1;
        intArray2[1] = 42;
        intArray2[2] = -100;
        intArray2[3] = -101;
        intArray2[4] = 83;

//1. Цикл for
        //вывести в консоль эл-ты массива
        for (int i = 0; i < intArray1.length; i++) {
            System.out.println(i + "-й элемент массива: " + intArray1[i]);
        }
        //вывести в консоль эл-ты массива в обратном порядке
        for (int i = intArray1.length - 1; i >= 0; i--) {
            System.out.println(i + "-й элемент массива: " + intArray1[i]);
        }

        //Выход из цикла - break
        // найти 1-е число -100 и выйти из цикла
        int[] intArray3 = new int[]{1, 42, -100, 105, -83};
        for (int i = 0; i < intArray3.length; i++) {
            if (intArray3[i] == -100) {
                System.out.println("Нашли: " + intArray3[i]);
                break;
            }
            System.out.println("Next iteration");
        }
        //Выход из цикла - continue c break
        int[] intArray4 = new int[]{1, 42, -100, 105, -83};
        for (int i = 0; i < intArray4.length; i++) {
            if (intArray4[i] != -100) {
                continue;
            }
            System.out.println("Нашли: " + intArray4[i]);
            break;
        }

        //Выход из цикла - return
        int[] intArray5 = new int[]{1, 42, -100, 105, -83};
        for (int i = 0; i < intArray5.length; i++) {
            if (intArray5[i] == -100) {
                System.out.println("Нашли: " + intArray5[i]);
                return;
            }
            System.out.println("Next iteration");
        }
//2. Цикл foreach
        int[] intArray6 = new int[]{1, 42, -100, 105, -83};
        for (int element : intArray6) {
            if (element == -100) {
                System.out.println("Нашли: " + element);
                break;
            }
            System.out.println("N it");
//3. Цикл while
//        while (человек не на пенсии) {
//            человек.возраст++;
//        }

            boolean founded = true;
            while (!founded) {
                //search process
                founded = true;
            }
//4. Цикл do-while
            do {

            } while (founded);
        }
    }
}
