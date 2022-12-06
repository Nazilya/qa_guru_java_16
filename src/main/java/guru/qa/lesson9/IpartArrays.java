package guru.qa.lesson9;

import java.util.Arrays;
public class IpartArrays {
    //JavaPartII - arrays
    public static void main(String[] args) {
//массивы
        //вариант 1 присвоения значений - при инициализации
        int[] intArray1 = new int[]{1, 42, -100};
        //вариант 2 присвоения значений - по индексу
        int[] intArray2 = new int[5];
        intArray2[0] = 1;
        intArray2[1] = 42;
        intArray2[2] = -100;
        intArray2[3] = -101;
        intArray2[4] = 83;
        System.out.println("Длина массива: " + intArray1.length);       //Рез: Длина массива: 3
        System.out.println("Массив: " + Arrays.toString(intArray1));    //Рез: Массив: [1, 42, -100]

//Двумерные массивы
        System.out.println("Двумерные массивы");
        int[][] twoDimensionalArray = new int[][]{intArray1, intArray2};
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            int[] arr = twoDimensionalArray[i];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == -101) {
                    System.out.println("Нашли: " + arr[j]);
                    break;
                }
                System.out.println("След-я итерация");

            }

        }


    }
}
