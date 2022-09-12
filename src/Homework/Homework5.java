package Homework;

import java.util.Random;

public class Homework5 {

    //Дан массив. Определить:
    //1. количество максимальных элементов в массиве;
    //2. количество минимальных элементов в массиве

    public static void main(String[] args) {
        Random r = new Random();
        int[] newArray = new int[r.nextInt(30)];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = r.nextInt(-20, 20);
            System.out.print(newArray[i] + " ");
        }

        System.out.println();

        int max = newArray[0];
        int min = newArray[0];

        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] > max) {
                max = newArray[i];
            }
            if (newArray[i] < min) {
                min = newArray[i];
            }
        }

        int maxCount = 0;
        int minCount = 0;

        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == max) {
                maxCount++;
            }
            if (newArray[i] == min) {
                minCount++;
            }
        }

        System.out.println("Max " + maxCount);
        System.out.println("Min " + minCount);
    }
}
