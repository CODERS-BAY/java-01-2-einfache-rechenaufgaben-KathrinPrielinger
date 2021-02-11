
public class Main {
    public static void main(String[] args) {

        int number1 = 100;
        int number2 = 30;
        int resultAdd = number1 + number2;
        int resultSub = number1 - number2;
        int resultDiv = number1 / number2;
        int resultMul = number1 * number2;

        System.out.printf("%d + %d = %d \n", number1, number2, resultAdd);
        System.out.printf("%d - %d = %d \n", number1, number2, resultSub);
        System.out.printf("%d / %d = %d \n", number1, number2, resultDiv);
        System.out.printf("%d * %d = %d \n", number1, number2, resultMul);

        double number3 = 1.2;
        double number4 = 1.5;
        double result1Add = number3 + number4;
        double result1Sub = number3 - number4;
        double result1Div = number3 / number4;
        double result1Mul = number3 * number4;

        System.out.printf("%.3f \n", number3);
        System.out.println();

        System.out.printf("%.3f + %.3f = %.3f \n", number3, number4, result1Add);
        System.out.printf("%.3f - %.3f = %.3f \n", number3, number4, result1Sub);
        System.out.printf("%.3f / %.3f = %.3f \n", number3, number4, result1Div);
        System.out.printf("%.3f * %.3f = %.3f \n", number3, number4, result1Mul);
    }
}