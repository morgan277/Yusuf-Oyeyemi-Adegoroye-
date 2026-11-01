import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Average Calculator ===");
        System.out.print("How many numbers do you want to average? ");
        int count = input.nextInt();

        if (count <= 0) {
            System.out.println("Please enter a number greater than zero.");
            input.close();
            return;
        }

        double total = 0;

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            total += input.nextDouble();
        }

        double average = total / count;
        System.out.println("Average: " + average);

        input.close();
    }
}
