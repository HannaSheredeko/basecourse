package week1;

/**
 * 13. Известны площади круга и квадрата. Определить:
 * а) уместится ли круг в квадрат;
 * б) уместится ли квадрат в круге.
 * <p>
 * Взависимости от результата сделать вывод "Круг уместится в квадрат" / "Квадрат уместится в круг" / "Фигуры не вмещаются друг в друга"
 */
public class Task13 {
    public static void main(String[] args) {
        int circle = Integer.parseInt(args[0]);
        int square = Integer.parseInt(args[1]);


        double RadiusCircle = Math.sqrt(circle / 3.1415);
        double DiameterOfASquare = Math.sqrt(2 * square);

        if (RadiusCircle * 2 >= DiameterOfASquare) {
            System.out.println("Квадрат уместится в круг");
        } else if (RadiusCircle * 2 <= Math.sqrt(square)) {
            System.out.println("Круг уместится в квадрат");
        } else
            System.out.println("Фигуры не вмещаются друг в друга");


        //      Yours code...

    }
}
