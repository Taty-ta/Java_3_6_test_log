package org.example;

import org.junit.AfterClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrTestTest {
private ArrTest arrTest;
// task 1
    @Test
    public void test1() {
        //проверяем в массиве наличие 5
        arrTest.newArr(new int[]{0, 3, 7, 5, 0, 0, 3, 2}, 5);
    }
    @Test
    public void test2() {
        //проверяем в массиве наличие 4
        arrTest.newArr(new int[]{1, 3, 4, 7, 9, 5}, 4);
    }

    @Test
    void newArr() {
        assertThrows(RuntimeException.class,
                () -> arrTest.newArr(new int[]{0, 3, 7, 5, 0, 0, 3, 2}, 1));
    }
    @Test
    void newArrAfter4() {
       int[] in = new int[] {1, 3, 4, 5, 6, 8};
       int[] out = new int[] {5,6,8};
       int n = 4;
        Assertions.assertArrayEquals(out, ArrTest.newArr(in, n));
    }

    // task 2
    // если бы возвращал булево
   /* @Test
    void test1ControlOnly4() {
        int[] in = new int[] {1, 3, 4, 5, 6, 8};

        Assertions.assertFalse(ArrTest.checkARR(in));
    }

    @Test
   public void test2ControlOnly4() {
        int[] in = new int[] {1, 3, 4, 5, 6, 8};

        Assertions.assertTrue(ArrTest.checkARR(in));
    }*/
    @Test
   public void checkARR() {
        arrTest.checkARR(new int[]{1, 4, 4, 1, 1, 4, 3});
    }
    @Test
    void check1() {
         arrTest.checkARR(new int[]{1, 1, 1, 1, 1, 1});

    }
    @AfterClass
    public static void tearDown() {
        System.out.println("Tests finished");
    }
}