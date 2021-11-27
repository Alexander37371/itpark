package lesson4;

public class SquareRootCalculate {
    public static void main(String[] args) {

        int square = 80; // Ввести число для вычисления квадратного корня
        int possibleResult = -1;
        for (int a = 0; a < square; a++) {
            if (a * a == square) {
                possibleResult = a;
            }
        }
        if (possibleResult != -1) {
            System.out.println("result = " + possibleResult);
        } else {
            System.out.println("result not found");
        }
    }
}

