package numberofdigits;


import java.util.Scanner;

/**
 *  Задание №4
 * 	Написать функцию, которая определяет количество разрядов введенного целого числа.
 **/
public class NumberOfDigits {
    public  void findNumberOfDigits()  {
        System.out.println("Введите число, чтоб найти колличество разрядов:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Колличество разрядов числа " + find(number));
        input.close();
    }
    private int find(int number) {
        String convertingNumber = String.valueOf(number);
        return convertingNumber.length();
    }
}
