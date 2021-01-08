package HomeWork3.Task7;

import HomeWork3.Task4.CalculatorWithMathExtends;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calculator = new CalculatorWithMemory(new CalculatorWithMathExtends());

        //4.1 + 15 * 7 + (28 / 5) ^ 2
        calculator.saveLastValue(calculator.division(28,5));
        calculator.saveLastValue(calculator.exponentiation(calculator.getLastValue(), 2));
        calculator.saveLastValue(calculator.addition(calculator.multiplication(15,7), calculator.getLastValue()));
        calculator.saveLastValue(calculator.addition(calculator.getLastValue(), 4.1));
        System.out.println(calculator.getLastValue());
    }
}
