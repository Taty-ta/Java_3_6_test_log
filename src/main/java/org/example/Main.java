package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 4, 1, 7};
        int num = 4;
       ArrTest.newArr(arr, num);
        int[] arrN = { 1 ,1, 1, 4, 4, 1, 4, 4};
        //int[] arrN = {1, 1, 1, 1, 1, 1} ;
       // int[] arrN = { 1, 4, 4, 1, 1, 4, 3} ;
        ArrTest.checkARR(arrN);
    }


}
