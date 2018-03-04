package week2;

/**
 * 2. Создать массив целых парных чисел от 20 до 2 и вывести его на экран в виде сообщения "{20, 18, 16, 14, 12, 10, 8, 6, 4, 2}"
 */
public class Task2 {
    public static void main(String[] args) {

        int[] par = new int[10];

        for (int i = par.length; i > 0; i--) {
            par[par.length - i] = i * 2;
        }
        System.out.print("{");
        for (int i = 0; i < par.length - 1; i++) {
            System.out.print(par[i] + (", "));

        }//
        System.out.print(par[par.length - 1] + ("}"));

        //        Yours code...

    }
}
