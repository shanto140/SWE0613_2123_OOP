package Practice_Problem_03;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("percentage of target sales: ");
        double sales = scanner.nextDouble();

        System.out.print("attendance percentage: ");
        double attendance = scanner.nextDouble();

        double bonus;

        if (sales >= 95 && attendance == 100) {
            bonus = 60;
        }
        else if (sales >= 95 && attendance == 90) {
            bonus = 40;
        }
        else if (sales >= 80 && attendance == 100) {
            bonus = 40;
        }
        else if (sales >= 80 && attendance == 90) {
            bonus = 20;
        }

        else {
            bonus = 5;
        }

        System.out.println("Bonus percentage: " + bonus + "%");

        scanner.close();
    }
}

