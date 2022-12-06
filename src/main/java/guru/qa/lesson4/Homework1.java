package guru.qa.lesson4;

public class Homework1 {
    /*
0) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой
1) поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях,
посмотреть результаты (вывести в консоль)
2) попробовать вычисления комбинаций типов данных (int и double)
3) прочитать про приоритет операторов в java
     */
    public static void main(String[] args) {
        // 1) поупражняться с математическими и логическими операторами
        System.out.println("Task 1.1");
        int x = 2;
        int y = 3;
        int z = 4;
        if (x <= y && y<=z) {
            System.out.println("Условие выполнилось");
        } else {
            System.out.println("Условие НЕ выполнилось");
        }

        if ((x != y)&&((x+y)<z)) {
            System.out.println("Условие выполнилось");
        } else {
            System.out.println("Условие НЕ выполнилось");
        }

        System.out.println("------------------------");
        String message1 = null;
        if (message1 != null && message1.length() == 10) {
            System.out.println(message1);
        } else {
            System.out.println("Условие НЕ выполнилось");
        }
//        //Результат - org.gradle.api.tasks.TaskExecutionException: Execution failed for task ':Homework1.main()'
//        String message2 = null;
//        if (message2 != null & message2.length() == 10) {
//            System.out.println(message2);
//        } else {
//            System.out.println("uslovie NE vipolniloos");
//        }


        // 1) добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)
        // на примере byte и int
        System.out.println("------------------------");
        System.out.println("Task 1.2");
        System.out.println("Диапазон значений 'Byte': [" + Byte.MIN_VALUE + " , " + Byte.MAX_VALUE + "]");
        System.out.println("Byte.SIZE  =   " + Byte.SIZE);
        System.out.println("Диапазон значений 'Integer': [" + Integer.MIN_VALUE + " , " + Integer.MAX_VALUE + "]");
        System.out.println("Integer.SIZE  =   " + Integer.SIZE);
        System.out.println("---");

        byte b_max = Byte.MAX_VALUE;
        System.out.println("Это макс-е значение byte: " + b_max);
        int f = b_max;
        System.out.println("Это int и он равен макс-му значению byte: " + f);
        b_max = (byte) (b_max + 3);
        System.out.println("Прибавим к макс-му значению byte '+3', получим: " + b_max + ". Переполнение");
        f = f + 3;
        System.out.println("Прибавим k int, который равен макс-му значению byte, '+3', получим: " + f);

        byte b_min = Byte.MIN_VALUE;
        System.out.println("Это мин-е значение byte: " + b_min);
        int f_bMin = b_min;
        System.out.println("Это int и он равен мин-му значению byte: " + f_bMin);
        b_min = (byte) (b_min + (-2));
        System.out.println("Прибавим к мин-му значению byte '-2', получим: " + b_min + ". Переполнение");
        f_bMin = f_bMin + (-2);
        System.out.println("Прибавим k int, который равен мин-му значению byte, '-2', получим: " + f_bMin);


        // 2) попробовать вычисления комбинаций типов данных (int и double)
        System.out.println("------------------------");
        System.out.println("Task 2");
        int varInt = 10;
        double varDouble = 4.1;
        //int z = x + y; - компилятор не позволяет, просит Cast to 'int'
        int valResult = (int) (varInt + varDouble);  // компилятор попросил Cast to 'int'
        System.out.println(valResult);

    }

}
