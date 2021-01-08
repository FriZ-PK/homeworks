package HomeWork3.Task3;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
        System.out.println( calculator.addition(calculator.addition(4.1, calculator.multiplication(15, 7)), calculator.exponentiation(calculator.division(28, 5), 2)) );
    }
}
