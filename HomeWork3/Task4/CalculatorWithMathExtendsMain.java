package HomeWork3.Task4;

import HomeWork3.Task3.CalculatorWithMathCopy;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();
        System.out.println( calculator.addition(calculator.addition(4.1, calculator.multiplication(15, 7)), calculator.exponentiation(calculator.division(28, 5), 2)) );
    }
}
