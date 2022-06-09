package maxinteger;

import java.util.Scanner;


/**Задание №2
 С клавиатуры вводится натуральное число. Найти его наибольшую цифру.
 Например, введено число 764580. Наибольшая цифра в нем 8.
 **/
public  class FindMaxDigit {
    public  static void  findMaxDigitInNumber(){
        System.out.println("Введите число, чтоб найти максимальную цифру:");
        Scanner input = new Scanner(System.in);
        String number = input.next();
        int max = 0;
        for (int i = 0; i < number.length(); i++) {
            int digit =  Integer.parseInt(String.valueOf(number.charAt(i)));
            if (digit > max) {
                max = digit;
            }
        }
        System.out.println("Максимальная цифра " + max);
        input.close();
    }
}
