package challange;

import java.util.Scanner;

public class MainTriangleChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter firs side of the triangle: ");
        int sideA = scanner.nextInt();
        System.out.print("Enter second side of the triangle:");
        int sideB = scanner.nextInt();
        System.out.print("Enter third side of the triangle:");
        int sideC = scanner.nextInt();

        TriangleChallenge triangleChallenge = new TriangleChallenge(sideA, sideB, sideC);

        System.out.println("Is the triangle equilateral? " + triangleChallenge.checkIfTriangleIsEquilateral());
        System.out.println("Is the triangle isosceles? " + triangleChallenge.checkIfTriangleIsIsosceles());
        System.out.println("Is the triangle scalene? " + triangleChallenge.checkIfTriangleIsScalene());

    }
}

