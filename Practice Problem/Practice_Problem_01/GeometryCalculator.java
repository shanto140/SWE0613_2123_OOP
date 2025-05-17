package Practice_Problem_01;


   import java.util.Scanner;

    public class GeometryCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base, height, radius, side, a, b, c, celsius, fahrenheit;

        System.out.print("Enter base and height: ");
        base = scanner.nextDouble();
        height = scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of triangle: " + area);

        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of ball: " + volume);

        System.out.print("Enter circle radius : ");


        radius = scanner.nextDouble();
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of circle: " + circleArea);




        System.out.print("Enter temperature in Celsius: ");
          celsius = scanner.nextDouble();
         fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);




        System.out.print("Enter side of the equilateral triangle: ");
        side = scanner.nextDouble();
        double equilateralTriangleArea = (Math.sqrt(3) / 4) * Math.pow(side, 2);
        System.out.println("Area of equilateral triangle: " + equilateralTriangleArea);




        System.out.print("Enter sides a, b, and c of the triangle: ");
        a = scanner.nextDouble();
          b = scanner.nextDouble();
         c = scanner.nextDouble();
        double s = (a + b + c) / 2;
        double triangleArea = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of triangle : " + triangleArea);

        scanner.close();
    }
}