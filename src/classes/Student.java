package classes;

public class Student {

    String firstName;
    String lastName;
    int expectedYearToGraduate;
    double GPA;
    String declaredMajor;

    public Student(String firstName, String lastName, int expectedYearToGraduate, double GPA, String declaredMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedYearToGraduate = expectedYearToGraduate;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
    }

    public void incrementExpectedGraduationYear() {
        this.expectedYearToGraduate++;
    }

    public String toString() {
        return  "First name: " + this.firstName + "\n" +
                "Last name: " + this.lastName + "\n" +
                "Expected year to graduate: " + this.expectedYearToGraduate + "\n" +
                "GPA: " + this.GPA + "\n" +
                "Declared major: " + this.declaredMajor;
    }

}
