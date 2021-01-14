package HomeWork3.Task6;

import HomeWork3.Task4.CalculatorWithMathExtends;

public class CalculatorWithCounterInterfaceMain {
    public static void main(String[] args) {
        //CalculatorWithCounterInterface calculator = new CalculatorWithCounterInterface(new CalculatorWithOperator());
        //CalculatorWithCounterInterface calculator = new CalculatorWithCounterInterface(new CalculatorWithMathCopy());
        CalculatorWithCounterInterface calculator = new CalculatorWithCounterInterface(new CalculatorWithMathExtends());

        System.out.println( calculator.addition(calculator.addition(4.1, calculator.multiplication(15, 7)), calculator.exponentiation(calculator.division(28, 5), 2)) );
        System.out.println(calculator.getCountOperation());
    }
}
