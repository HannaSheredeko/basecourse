package week1;

/**
 * 11. Написать программу, которая при вводе числа в диапазоне от 1 до 99 добавляет к нему слово "копейка" в правильной форме.
 * Например, 1 копейка, 5 копеек, 42 копейки.
 */
public class Task11 {

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);


        if (number % 10 == 1 && number != 11) {
            System.out.println(number + " копейка");
        } else if (number % 10 == 2 || number % 10 == 3 || number % 10 == 4
                && number != 12 && number != 13 && number != 14) {
            System.out.println(number + " копейки");
        } else {
            System.out.println(number + " копеек");

        }
    }

    //      Yours code...

}

