package HomeWork3.Task7;

import HomeWork3.Task6.ICalculator;

public class CalculatorWithMemory {
    private double lastValue;
    private ICalculator calculator;

    public CalculatorWithMemory (ICalculator calculator) {
        this.calculator = calculator;
    }

    public double division(double a, double b) {
        return calculator.division(a, b);
    }

    public double multiplication (double a, double b) {
        return calculator.multiplication(a, b);
    }

    public double subtraction (double a, double b)  {
        return calculator.subtraction(a, b);
    }

    public double addition (double a, double b)  {
        return calculator.addition(a, b);
    }

    public double exponentiation (double a, int b) {
        return calculator.exponentiation(a, b);
    }

    public double module (double a)  {
        return calculator.module(a);
    }

    public double rootOfNumber (double a) {
        return calculator.rootOfNumber(a);
    }

    public void saveLastValue(double a) {
        this.lastValue = a;
    }

    public double getLastValue() {
        double temporarily = this.lastValue;
        return temporarily;
    }

}
