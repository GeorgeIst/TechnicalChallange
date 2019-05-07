import challange.TriangleChallenge;
import java.util.Scanner;

//The TriangleChallengeTest class contains a main method that will have a triangle object.
//The user will enter the dimensions for the three sides of the triangle,
//to determine what type of triangle will generate.
public class TriangleChallengeTest {
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









