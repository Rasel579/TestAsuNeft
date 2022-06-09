package summator;

import java.util.Scanner;

/**
 * Задание №5
 * Пользователь последовательно
 * вводит с клавиатуры числа в консоль.
 * Как только пользователь ввел «пустую строку»
 * вывести на экран сумму введенных чисел и завершить работу программы.
 */
public class Summator {
    public static void summa() {
        String rawNumber = "start";
        int summa = 0;
        Scanner input = new Scanner(System.in) ;
        while (!rawNumber.isBlank()) {
            System.out.println("Введите число:");
            rawNumber = input.nextLine();
            try {
                summa += Integer.parseInt(rawNumber);
            } catch (NumberFormatException e) {
                rawNumber = "";
            }
        }
        System.out.println("Сумма " + summa);
        input.close();
    }
}
