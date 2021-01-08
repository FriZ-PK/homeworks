package HomeWork3.Task6;

public class CalculatorWithCounterInterface implements ICalculator {
    private long countOperation = 0;
    private ICalculator calculator;

    public CalculatorWithCounterInterface (ICalculator calculator) {
        this.calculator = calculator;
    }

    public double division(double a, double b) {
        counter();
        return calculator.division(a, b);
    }

    public double multiplication (double a, double b) {
        counter();
        return calculator.multiplication(a, b);
    }

    public double subtraction (double a, double b)  {
        counter();
        return calculator.subtraction(a, b);
    }

    public double addition (double a, double b)  {
        counter();
        return calculator.addition(a, b);
    }

    public double exponentiation (double a, int b) {
        counter();
        return calculator.exponentiation(a, b);
    }

    public double module (double a)  {
        counter();
        return calculator.module(a);
    }

    public double rootOfNumber (double a) {
        counter();
        return calculator.rootOfNumber(a);
    }

    private void counter() {
        ++countOperation;
    }

    public long getCountOperation(){
        return countOperation;
    }
}
