package Practice_Problem_02;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Even numbers: ");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Odd numbers: ");
        int i = 1;
        while (i < 20) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();

        int sumEven = 0;
        i = 2;
        do {
            sumEven += i;
            i += 2;
        } while (i <= 20);
        System.out.println("Sum of even series: " + sumEven);

        int sumOdd = 0;
        i = 1;
        do {
            sumOdd += i;
            i += 2;
        } while (i < 20);
        System.out.println("Sum of odd series: " + sumOdd);

        scanner.close();
    }
}
