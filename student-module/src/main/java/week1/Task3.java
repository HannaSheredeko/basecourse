package week1;

/**
 * 3. Есть число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.
 */
public class Task3 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        if (num % 7 == 0){
            System.out.println(num * 2);
        }

//      Yours code...
    }
}
