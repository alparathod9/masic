import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class AverageCalculator{
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        String input;

        System.out.println("Enter a list of numbers (type 'done' to finish):");

        do {
            input = scanner.nextLine();
            if (!input.equalsIgnoreCase("done")) {
                try {
                    int number = Integer.parseInt(input);
                    numbers.add(number);
                    sum += number;
                    count++;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number or 'done' to finish.");
                }
            }
        } while (!input.equalsIgnoreCase("done"));

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("The average is: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}