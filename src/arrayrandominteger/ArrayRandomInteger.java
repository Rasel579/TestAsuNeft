package arrayrandominteger;


import java.util.ArrayList;

/**
 * Задание №3
 * Создать массив из 20 элементов в диапазоне (случайным образом)
 * значений от -15 до 14 включительно.
 * Определить количество элементов по модулю больших, чем максимальный.
 **/
public class ArrayRandomInteger {
    public static void initArray() {
        int leftLimit = -16;
        int rightLimit = 15;
        int countItemsOfArray = 21;
        int max = 0;
        int count = 0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < countItemsOfArray; i++) {
            int item = (int) (Math.random() * leftLimit + Math.random() * rightLimit);
            arrayList.add(item);
            if (item > max) {
                max = item;
            }
        }

        for (Integer integer : arrayList) {
            if (Math.abs(integer) > max) {
                count++;
            }
        }

        System.out.println("Массив случайных чисел от -15 до 14: " + arrayList);
        System.out.println("Максимальное число: " + max);
        System.out.println("Количество элементов по модулю больших, чем максимальный: " + count);
    }

}
