package ascII;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Задание №1
 * Вводится целое число,
 * обозначающее код символа по таблице ASCII.
 * Определить, это код английской буквы или какой-либо иной символ.
 **/
public class CheckoutASCII {
    public synchronized static void checkCharIsUSASCII() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите код символа:");
        try {
            int inCode = input.nextInt();
            boolean isASCIIChar = StandardCharsets
                    .US_ASCII
                    .newEncoder()
                    .canEncode((char) inCode);
            System.out.println(isASCIIChar);
        } catch (Exception e) {
            System.out.println("Надо ввести число");
        }

        input.close();
    }
}
