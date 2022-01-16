package HomeWork;

import java.util.Arrays;
import static java.lang.Math.*;

public class HomeWorkLesson_3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        //invertArray();
        //printArray();
        //changeArray();
        //drawDiagonals();
        //System.out.println(Arrays.toString(oneDimensionalArray(7, 10)));
        //minAndMaxElementsArray();
        shiftingArrayValues(array, 2);
    }

    public static void invertArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j <= 100; j++) {
                array[i] = j;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static void changeArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void drawDiagonals() {
        int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = 0;
                int g = array.length - 1;
                for (int k = 0; k < array.length; k++) {
                    array[g][k] = 1;
                    g--;
                }
                if (i == j) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int[] oneDimensionalArray(int len, int initialValue) {
        int[] arrey = new int[len];
        for (int i = 0; i < len; i++) {
            arrey[i] = initialValue;
        }
        return arrey;
    }

    public static void minAndMaxElementsArray() {
        int[] array = {45, 22, 90, 31, 54};
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    public static void shiftingArrayValues(int[] arrey, int n) {

        if (n >= 0) {
            for (int i = 0; i < arrey.length; i++) {
                if (i + n > arrey.length - 1) {
                    i = abs(arrey.length - (i + n));
                }
                arrey[i] = ;
                System.out.println(arrey);
            }
        }
    }
}
