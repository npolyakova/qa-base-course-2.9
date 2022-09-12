package Homework;

import java.util.Random;
import java.util.Scanner;

public class Homework6 {

    //Составить программу:
    //1. нахождения минимального значения среди элементов любой строки двумерного массива;
    //2. нахождения максимального значения среди элементов любого столбца двумерного массива

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[][] array2d = new int[r.nextInt(2, 7)][r.nextInt(2, 7)];

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = r.nextInt(10);
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Введите номер строки для поиска минимума");
        int rowNumber = sc.nextInt() - 1;

        int min = array2d[rowNumber][0];
        for (int j = 0; j < array2d[rowNumber].length; j++) {
            if (array2d[rowNumber][j] < min) {
                min = array2d[rowNumber][j];
            }
        }
        System.out.println(min);

        System.out.println("Введите номер столбца для поиска максимум");
        int columnNumber = sc.nextInt() - 1;

        int max = array2d[0][columnNumber];
        for (int i = 0; i < array2d.length; i++) {
            if (array2d[i][columnNumber] > max) {
                max = array2d[i][columnNumber];
            }
        }
        System.out.println(max);
    }
}
