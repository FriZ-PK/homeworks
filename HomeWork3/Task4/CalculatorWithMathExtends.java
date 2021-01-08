package HomeWork3.Task4;

import HomeWork3.Task2.CalculatorWithOperator;
import HomeWork3.Task6.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    public double exponentiation (double a, int b) {
        return Math.pow(a, b);
    }

    public double module (double a)  {
        return Math.abs(a);
    }

    public double rootOfNumber (double a) {
        return Math.sqrt(a);
    }

}
