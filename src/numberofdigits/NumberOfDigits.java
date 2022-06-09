package numberofdigits;


import java.math.BigInteger;
import java.util.Scanner;

/**
 * Задание №4
 * Написать функцию, которая определяет количество разрядов введенного целого числа.
 **/
public class NumberOfDigits {
    public void findNumberOfDigits() {
        System.out.println("Введите число, чтоб найти колличество разрядов:");
        Scanner input = new Scanner(System.in);
        try {
            BigInteger number = input.nextBigInteger();
            System.out.println("Колличество разрядов числа " + find(number));
        } catch (Exception e){
            System.out.println("Надо ввести число");
        }
        input.close();
    }

    private int find(BigInteger number) {
        String convertingNumber = String.valueOf(number);
        return convertingNumber.length();
    }
}
