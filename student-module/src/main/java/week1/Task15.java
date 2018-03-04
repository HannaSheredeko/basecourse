package week1;

/**
 * 15. Посчитать сколько раз встречается символ 5 в заданном числе (число трехкратное)
 *      435  -   1
 *      505  -   2
 *      555  -   3
 *      305  -   1
 */
public class Task15 {

public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        int first = number / 100;
        int second = number / 10 % 10;
        int third = number % 10;

        int counter = 0;
        //counter = counter + 1; это равносильно counter++;

        if (first == 5) { counter++;
        }
        if (second == 5){ counter = counter + 1;
        }
        if (third == 5){ counter += 1;
        }
        System.out.println(counter);


        //      Yours code..
    }
}