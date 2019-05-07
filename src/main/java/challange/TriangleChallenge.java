package challange;

//I created a TriangleChallenge class that will have a TriangleChallenge object.
//The class contains three methods, one for each type of triangle so it can be
// shared among all Objects created from the same class.
//The class has three private variables, visible only to the TriangleChallenge class,
// that will store the length of each side of the triangle.
public class TriangleChallenge {


    private int sideA;
    private int sideB;
    private int sideC;

//The constructor is created to initialize the sides of the triangle
    public TriangleChallenge(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public boolean checkIfTriangleIsEquilateral() {
        if (sideA == sideB && sideA == sideC && sideB == sideC) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkIfTriangleIsIsosceles() {
        if (((sideA == sideB) && (sideA != sideC)) ||
                ((sideA == sideC) && (sideA != sideB)) ||
                ((sideB == sideC) && (sideB != sideC))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkIfTriangleIsScalene() {
        if ((sideA != sideB) && (sideA != sideC)) {
            return true;
        } else {
            return false;
        }
    }

}

