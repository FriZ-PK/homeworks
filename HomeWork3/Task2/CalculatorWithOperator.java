package HomeWork3.Task2;

import HomeWork3.Task6.ICalculator;

public class CalculatorWithOperator implements ICalculator {

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
        double result = a;
        if (a > 0) {
            for (int i = 1;i < b;i++) {
                result = result * a;
            }
            return result;
        }
        return result;
    }

    public double module (double a)  {
        if (a >= 0) {
            return a;
        }
        else {
            return a * -1;
        }
    }

    public double rootOfNumber (double a) {
        return Math.sqrt(a);
    }

}
