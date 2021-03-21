package classes;

public class Main {

    public static void main(String[] args) {
        // Creating instances
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);

        // Instance methods
        double areaTriangleA = triangleA.findArea();
        System.out.println(areaTriangleA);

        double areaTriangleB = triangleB.findArea();
        System.out.println(areaTriangleB);

        // Instance variables
        System.out.println(triangleA.height);
        System.out.println(triangleA.side3);

        // Class variables
        System.out.println(Triangle.numOfSides);

        // Challenge (student profile)
        Student studentA = new Student("Stiven", "Ramírez", 2022, 4.28, "Systems Engineering");
        Student studentB = new Student("Julián", "Ramírez", 2022, 4.41, "Business Administration");

        System.out.println(studentA.toString());
        System.out.println(studentB.toString());

        studentA.incrementExpectedGraduationYear();
        System.out.println(studentA.expectedYearToGraduate);
    }

}
