package Practice_Problem_03;

import java.util.Scanner;

public class award {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter letter grade: ");
        double grade = scanner.nextDouble();

        System.out.print("completed the semester?(1/0) : ");
        int yes = scanner.nextInt();

        if (yes==1) {

            if (grade >= 3.5) {
                System.out.println("Medal awarded");
            } else {
                System.out.println("No medal awarded");
            }

        } else {
            System.out.println("Incomplete semester");
        }

        scanner.close();
    }
}

