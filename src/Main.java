
public class Main {
    public static void main(String[] args) {

        int number1 = 100;
        int number2 = 30;

        System.out.println(number1 + "+" + number2 + "=" + (number1 + number2));
        System.out.println(number1 + "-" + number2 + "=" + (number1 - number2));
        System.out.println(number1 + "/" + number2 + "=" + (number1 / number2));
        System.out.println(number1 + "*" + number2 + "=" + (number1 * number2));

        double number3 = 1.2;
        double number4 = 1.5;
        double resultAdd = number3 + number4;
        double resultSub = number3 - number4;
        double resultDiv = number3 / number4;
        double resultMul = number3 * number4;

        System.out.printf("%.3f \n", number3);
        System.out.println();

        System.out.printf("%.3f" + " + " + "%.3f" + " = " + "%.3f \n", number3, number4, resultAdd);
        System.out.printf("%.3f" + " - " + "%.3f" + " = " + "%.3f \n", number3, number4, resultSub);
        System.out.printf("%.3f" + " / " + "%.3f" + " = " + "%.3f \n", number3, number4, resultDiv);
        System.out.printf("%.3f" + " * " + "%.3f" + " = " + "%.3f \n", number3, number4, resultMul);
    }
}