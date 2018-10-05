public class Calculator {

    public double addition(double a, double b) {
        return a + b;
    }
    public double subtraction(double a, double b) {
        return a - b;
    }
    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        double sum = calculator.addition(13, 18);
        double difference = calculator.subtraction(42.452, 14.543);
        System.out.println("Sum is equal: " + sum);
        System.out.println("Difference is equal: " + difference);
    }
}
