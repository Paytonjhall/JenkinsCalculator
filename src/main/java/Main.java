import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        do {
            System.out.println("Type a command (add, subtract, multiply, divide, fibonacci, binary, or quit):");
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            Calculator myCalculator = new Calculator();
            int firstNumber;
            int secondNumber;
            switch (command) {
                case ("add"):
                    System.out.println("Enter two numbers to add:");
                    firstNumber = scanner.nextInt();
                    secondNumber = scanner.nextInt();
                    System.out.println("The result is: " + myCalculator.add(firstNumber, secondNumber));
                    break;
                case ("subtract"):
                    System.out.println("Enter two numbers to subtract:");
                    firstNumber = scanner.nextInt();
                    secondNumber = scanner.nextInt();
                    System.out.println("The result is: " + myCalculator.subtract(firstNumber, secondNumber));
                    break;
                case ("multiply"):
                    System.out.println("Enter two numbers to multiply:");
                    firstNumber = scanner.nextInt();
                    secondNumber = scanner.nextInt();
                    System.out.println("The result is: " + myCalculator.multiply(firstNumber, secondNumber));
                    break;
                case ("divide"):
                    System.out.println("Enter two numbers to divide:");
                    firstNumber = scanner.nextInt();
                    secondNumber = scanner.nextInt();
                    System.out.println("The result is: " + myCalculator.divide(firstNumber, secondNumber));
                    break;
                case ("fibonacci"):
                    System.out.println("Enter a number to find the fibonacci sequence:");
                    firstNumber = scanner.nextInt();
                    System.out.println("The result is: " + myCalculator.fibonacciNumberFinder(firstNumber));
                    break;
                case ("binary"):
                    System.out.println("Enter a number to find the binary sequence:");
                    firstNumber = scanner.nextInt();
                    System.out.println("The result is: " + myCalculator.intToBinaryNumber(firstNumber));
                    break;
                case ("quit"):
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        } while (true);
    }
}
