package week1;

/**
 * 8. Вычислить стоимост Скидка в 10% предось покупки с учетом скидки.тавляется, если сумма покупки превышает 1000 гривен.
 */
public class Task8 {
    public static void main(String[] args) {
        int purchase = Integer.parseInt(args[0]);

        if (purchase >= 1000){
            purchase = (int) (purchase * 0.9);
        }


        System.out.println(purchase);


//      Yours code...
    }
}
