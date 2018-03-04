package week1;

/**
 * 7. Есть число от 1 до 12 (номер месяца). По номеру месяца выдать сообщение о времени года (Winter, Spring, Summer, Autumn).
 * Если число лежит вне диапазона номеров месяца, программа должна выдать сообщение об ошибке (Wrong input!).
 */
public class Task7 {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Wrong input!");
                break;
        }




//      Yours code...
    }
}
