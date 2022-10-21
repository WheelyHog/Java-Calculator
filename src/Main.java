import Calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.doCalculation(Calculator.getNum(), calculator.getNum(), calculator.getOperation());
    }
}