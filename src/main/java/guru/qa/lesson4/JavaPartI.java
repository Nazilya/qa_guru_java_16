package guru.qa.lesson4;

public class JavaPartI {
    public static void main(String[] args) {
        /*целые числа
        1. Для каждого из этих типов есть свой выделяемый рамер памяти
        2. В них м/хранить разный диапазон числе (8, 16, 32, 64 бит)
        */
        byte varByte = 1;       // 8 бит (-2 в 7 степени до 2 в 7 степени-1 - это числа от -128  до 127). Значение по умолчанию - 0
        short varShort = 1;     // 16 бит (-2 в 15 степени до 2 в 15 степени-1. Диапазон от -32768 до 32767). Значение по умолчанию - 0
        int varInt = 1;         // (-2 в 32 степени - до 2 в 32 степени-1). Значение по умолчанию - 0
        long varLong = 1L;       // (-2 в 64 степени - до 2 в 64 степени-1). Значение по умолчанию - 0L

        // числа с плав-й точкой. Значение по умолчанию - 0.0f и 0.0d
        float varFloat = 0.0f;
        double varDouble = 0.0d;

        //логический. Значение по умолчанию - false
        boolean varBool = true;

        //символьный - выделяется 2 байта. Значение по умолчанию - 0
        char varChar = 'c';

        String valStr = "Hello!";
        // У всех ссылочных типов д-х значение по умолчанию - NULL

/*        Операторы
        1. = оператор присвоения
        varInt = 0;

        2. математические
        varInt = 4 + 7;
        varInt = 4 - 7;
        varInt = 4 * 7;
        varInt = 7 / 4; целочисленное деление. Результат 1
        varInt = 7 % 4; остаток от деления. Результат 3
        varInt = varInt0++;     Прибавит 1 и вернет рез-тат
        varInt = ++varInt0;     Вернет рез-тат, потом +1
        varInt = varInt0--;
        varInt = varInt0++;

        3. Операторы сравнения
        >, <, >=, <=, !=, ==

        4. Логические операторы - позв-ют работать с типом boolean
            && - и, || - или, ! - не
            if(age >= 30 && sex.equals("femail"))

         5. Ветвления логики. Конструкция if
         if (varStr !=null && varStr.length() == 10) {
                System.out.println(varStr);
         } else if (varStr !=null && varStr.length() == 9) {
                 System.out.println("Извините, ровно из 9 символов");
         } else {
                 System.out.println("Извините, не из 9 или 10 символов");
         }
*/

        System.out.println("Hello world!");
    }
}