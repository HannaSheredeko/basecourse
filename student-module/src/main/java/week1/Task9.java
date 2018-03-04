package week1;

import java.util.Scanner;

/**
 * 9. Написать программу вычисления идеального веса пользователя.
 * Выдать рекомендации о необходимости поправиться либо похудеть.
 */
public class Task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int growth;
        int weight;

        System.out.println("Enter yours growth: ");
        growth = scanner.nextInt();
        System.out.println("Enter yours waigth: ");
        weight = scanner.nextInt();


        if (weight >= growth -110) {
            System.out.println("Необходимо похудеть");
        } else {
            System.out.println("Необходимо поправиться");


        }

        //      Yours code...

    }
}
