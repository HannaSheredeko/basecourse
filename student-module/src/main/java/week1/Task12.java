package week1;

/**
 * 12. Определить, является ли шестизначное число "счастливым" (сумма первых трех цифр равна сумме последних трех цифр).
 * Ответ вывести в виде сообщения true/false.
 */
public class Task12 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        int a = number / 100000;
        int b = number / 10000 % 10;
        int c = number / 1000 % 10;
        int d = number / 100 % 10;
        int e = number / 10 % 10;
        int f = number % 10;


        System.out.println(a + b + c == d + e +f);

        /* if (a + b + c == d + e +f){
            System.out.println(true);
        } else {
            System.out.println(false);

        }*/



        //      Yours code...

    }
}
