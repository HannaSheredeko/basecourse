package week2;

/**
 * 1. Создать массив челых чисел от 1 до 10 и вывести его на экран в виде сообщения "{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}"
 */
public class Task1 {
    public static void main(String[] args) {

        int[] mass = new int[10];


        for (int i = 0; i < 10; i++) {
            mass[i] = i + 1;
        }
        System.out.print("{");
        for (int i = 0; i < mass.length - 1; i++) {
            System.out.print(mass[i] + (", "));

        }//
        System.out.print(mass[mass.length - 1] + ("}"));
//     Yours code...

    }
}
