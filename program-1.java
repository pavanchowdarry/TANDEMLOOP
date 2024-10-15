import java.util.Scanner;

class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        } else {
            return a / b;
        }
    }

    public double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "add":
                return add(a, b);
            case "subtract":
                return subtract(a, b);
            case "multiply":
                return multiply(a, b);
            case "divide":
                return divide(a, b);
            default:
                System.out.println("Invalid operation. Please choose add, subtract, multiply, or divide.");
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number (a): ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number (b): ");
        double b = sc.nextDouble();
        System.out.print("Enter the type of operation (add, subtract, multiply, divide): ");
        String operation = sc.next();

        Calculator calc = new Calculator();
        double result = calc.calculate(a, b, operation);
        System.out.println("Result: " + result);
        sc.close();
    }
}
