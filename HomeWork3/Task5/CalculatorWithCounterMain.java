package HomeWork3.Task5;

import HomeWork3.Task2.CalculatorWithOperator;
import HomeWork3.Task3.CalculatorWithMathCopy;
import HomeWork3.Task4.CalculatorWithMathExtends;

public class CalculatorWithCounterMain {
    public static void main(String[] args) {
        //CalculatorWithCounter calculator = new CalculatorWithCounter(new CalculatorWithOperator());
        //CalculatorWithCounter calculator = new CalculatorWithCounter(new CalculatorWithMathCopy());
        CalculatorWithCounter calculator = new CalculatorWithCounter(new CalculatorWithMathExtends());

        System.out.println( calculator.addition(calculator.addition(4.1, calculator.multiplication(15, 7)), calculator.exponentiation(calculator.division(28, 5), 2)) );
        System.out.println(calculator.getCountOperation());
    }
}
