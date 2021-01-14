package HomeWork3.Task8;

import HomeWork3.Task2.CalculatorWithOperator;
import HomeWork3.Task3.CalculatorWithMathCopy;
import HomeWork3.Task4.CalculatorWithMathExtends;
import HomeWork3.Task6.ICalculator;

public class CalculatorWithCounterDecorator implements ICalculator {
    private long countOperation = 0;
    private CalculatorWithOperator calc1;
    private CalculatorWithMathCopy calc2;

    public CalculatorWithCounterDecorator (CalculatorWithOperator calculator) {
        this.calc1 = calculator;
        this.calc2 = null;
    }

    public CalculatorWithCounterDecorator (CalculatorWithMathCopy calculator) {
        this.calc1 = null;
        this.calc2 =calculator;
    }

    public CalculatorWithCounterDecorator (CalculatorWithMathExtends calculator) {
        this.calc1 = calculator;
        this.calc2 = null;
    }

    public double division(double a, double b) {
        counter();
        if (calc2 == null) {
            return calc1.division(a, b);
        }
        return calc2.division(a, b);
    }

    public double multiplication (double a, double b) {
        counter();
        if (calc2 == null) {
            return calc1.multiplication(a, b);
        }
        return calc2.multiplication(a, b);
    }

    public double subtraction (double a, double b)  {
        counter();
        if (calc2 == null) {
            return calc1.subtraction(a, b);
        }
        return calc2.subtraction(a, b);
    }

    public double addition (double a, double b)  {
        counter();
        if (calc2 == null) {
            return calc1.addition(a, b);
        }
        return calc2.addition(a, b);
    }

    public double exponentiation (double a, int b) {
        counter();
        if (calc2 == null) {
            return calc1.exponentiation(a, b);
        }
        return calc2.exponentiation(a, b);
    }

    public double module (double a)  {
        counter();
        if (calc2 == null) {
            return calc1.module(a);
        }
        return calc2.module(a);
    }

    public double rootOfNumber (double a) {
        counter();
        if (calc2 == null) {
            return calc1.rootOfNumber(a);
        }
        return calc2.rootOfNumber(a);
    }

    private void counter() {
        ++countOperation;
    }

    public long getCountOperation(){
        return countOperation;
    }
}
