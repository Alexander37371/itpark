package lesson2;

public class SecondProgram {

    public static void main(String[] args) {
        System.out.println("Привет, мир");

        long summa = calculate(10, 12);
        System.out.println(summa);
        long otherSumma = calculate(13, 12);
        System.out.println(otherSumma);
        long yetAnothersumma = calculate(8, 13);
        System.out.println(yetAnothersumma);

        long resultOfdivision = division(14, 2);
        System.out.println(resultOfdivision);

        long resultOfMinus = minus(8, 13);
        System.out.println(resultOfMinus);

        long result = multiplyAndSumma(4);
        System.out.println(result);

        long resultOfFormula = yetFormula(2, 25, 120);
        System.out.println(resultOfFormula);
    }

    public static long calculate(int arg1, int arg2) {
        int result = arg1 + arg2;
        return result;
    }

    public static long division(int arg1, int arg2) {
        return arg1 / arg2;
    }

    public static long minus(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public static long multiplyAndSumma(int arg1) {
        int result = 4 * arg1 + 22;
        result = result - 38;
        return result;
    }

    /**
     * Метод будет вычислять какое количество теплоты выделится , Закон Джоуля-Ленца
     * @param I сила тока, проходящего через проводник
     * @param R сопротивление проводника
     * @param t время действия тока
     * @return Q количество теплоты, выделяемое проводником с током
     */
    public static long yetFormula(int I, int R, int t ) {
        int Q = (I * I) * R * t;
        return Q;
    }
}
