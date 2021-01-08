package HomeWork3.Task3;

import HomeWork3.Task6.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    public double division(double a, double b) {
        return a/b;
    }

    public double multiplication (double a, double b) {
        return a*b;
    }

    public double subtraction (double a, double b)  {
        return a-b;
    }

    public double addition (double a, double b)  {
        return a+b;
    }

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
