package HomeWork3.Task2;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        System.out.println( calculator.addition(calculator.addition(4.1, calculator.multiplication(15, 7)), calculator.exponentiation(calculator.division(28, 5), 2)) );

    }
}
