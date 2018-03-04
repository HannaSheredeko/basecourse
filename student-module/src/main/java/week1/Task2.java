package week1;

/**
 * 2. Есть три числа, нужно вывести на консоль наибольшее
 */
public class Task2 {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int max;

        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;


        }

        System.out.println(max);
//      Yours code...
    }
}
