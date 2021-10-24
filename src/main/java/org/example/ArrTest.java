package org.example;

import java.util.Arrays;

public class ArrTest {
    public static int[] newArr (int[] array, int n) throws RuntimeException{

        int l = 0; //номер позиции  в масс
        boolean isFor = false;
        for (int i = 0; i < array.length; i++) {
            l++;
            if (array[i] == n) {
                isFor = true;
                break;
            }
        }
        if (isFor == true) {
            int[] numbersCopy = Arrays.copyOfRange(array, l, array.length);
            System.out.println(Arrays.toString(numbersCopy));
            return numbersCopy;
        } else {
            throw new RuntimeException("Нет цифры " + n);
        }
    }

    public static void checkARR(int[] array) {
        Arrays.sort(array, 0, array.length); //сортируем весь массив от нулевого до последнего символа
        //System.out.println(Arrays.toString(array));//выводим отсортированный массив на экран
        int key1 = Arrays.binarySearch(array, 1); // ищем key - число 1 в отсортированном массиве.;
        int key2 = Arrays.binarySearch(array, 4);
        boolean x = false;
        if (key1 > 0 && key2 > 0) {
            x = true;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1 || array[i] == 4) {
            }else {
                x = false;
            }
        }
        System.out.println(Arrays.toString(array)+ " "+ x);
    }
}
