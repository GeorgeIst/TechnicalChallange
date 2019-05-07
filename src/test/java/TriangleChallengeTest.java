import challange.TriangleChallenge;
import org.junit.Test;

//I created another test class.
//This test class contains one test for each of the three types of triangle.
// I made this class because it is easy to read and can be .
public class TriangleChallengeTest {


    @Test
    public void testCheckIfTriangleIsEquilateral() {
        TriangleChallenge triangleChallenge = new TriangleChallenge(20, 20, 20);

        System.out.println(triangleChallenge.checkIfTriangleIsEquilateral());
    }

    @Test
    public void testCheckIfTriangleIsNotEquilateral() {
        TriangleChallenge triangleChallenge = new TriangleChallenge(50, 20, 20);

        System.out.println(triangleChallenge.checkIfTriangleIsEquilateral());
    }


    @Test
    public void testCheckIfTriangleIsIsosceles() {
        TriangleChallenge triangleChallenge = new TriangleChallenge(10, 10, 20);

        System.out.println(triangleChallenge.checkIfTriangleIsIsosceles());

    }

    @Test
    public void testCheckIfTriangleIsNotIsosceles() {
        TriangleChallenge triangleChallenge = new TriangleChallenge(10, 30, 20);

        System.out.println(triangleChallenge.checkIfTriangleIsIsosceles());
    }


    @Test
    public void testCheckIfTriangleIsScalene() {
        TriangleChallenge triangleChallenge = new TriangleChallenge(10, 20, 30);

        System.out.println(triangleChallenge.checkIfTriangleIsScalene());
    }

    @Test
    public void testCheckIfTriangleIsNotScalene() {
        TriangleChallenge triangleChallenge = new TriangleChallenge(10, 10, 30);

        System.out.println(triangleChallenge.checkIfTriangleIsScalene());
    }
}
