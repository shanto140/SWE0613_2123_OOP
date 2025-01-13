package Practice_Problem_03;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int n = scanner.nextInt();

        double[] numbers = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }

        double avg = sum / n;
        System.out.println("Average: " + avg);

        scanner.close();
    }
}
