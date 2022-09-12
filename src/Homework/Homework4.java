package Homework;

import java.util.Random;

public class Homework4 {
    //Дан массив. Вывести на экран сначала его неотрицательные элементы, затем отрицательные.

    public static void main(String[] args) {
        Random r = new Random();
        int[] newArray = new int[r.nextInt()];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = r.nextInt(-20, 20);
            System.out.print(newArray[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] >= 0) {
                System.out.print(newArray[i] + " ");
            }
        }

        System.out.println();

        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < 0) {
                System.out.print(newArray[i] + " ");
            }
        }
    }
}
