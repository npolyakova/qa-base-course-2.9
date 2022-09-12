package Homework;

public class Homework123 {

    public static void main(String[] args) {
        int[] array = new int[12];

        //1. Заполнить массив из двенадцати элементов 1, 2, ... 12.
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
            System.out.print(array[i] + " ");
        }

        System.out.println();

        //2. Вывести элементы массива на экран в обратном порядке.
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        //3. Определить:
        //  - сумму всех элементов массива;
        //  - произведение всех элементов массива;
        //  - сумму квадратов всех элементов массива;
        //  - сумму шести первых элементов массива

        int sum = 0;
        int product = 1;
        int sumSq = 0;
        int sumFirst6 = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            product *= array[i];
            sumSq += Math.pow(array[i], 2);

            if (i < 6) {
                sumFirst6 += array[i];
            }
        }

        System.out.println("\nСумма всех элементов массива " + sum);
        System.out.println("Произведение всех элементов массива " + product);
        System.out.println("Сумма квадратов всех элементов массива " + sumSq);
        System.out.println("Сумма 6 первых элементов массива " + sumFirst6);
    }

}
