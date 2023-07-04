import java.util.Scanner;

class FibonacciSeries{
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the limit
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        // Print the Fibonacci series
        System.out.println("Fibonacci series up to " + limit + ":");
        int num1 = 0, num2 = 1;

        System.out.print(num1 + " " + num2 + " ");

        for (int i = 2; i <= limit; i++) {
            int nextNum = num1 + num2;
            System.out.print(nextNum + " ");
            num1 = num2;
            num2 = nextNum;
        }

        // Close the scanner
        scanner.close();
    }
}