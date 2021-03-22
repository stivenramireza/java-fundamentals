package foundations;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int studentAge = 22;
        double studentGPA = 4.28;
        boolean hasPerfectAttendance = true;

        String studentFirstName = "Stiven";
        String studentLastName = "Ramírez";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(hasPerfectAttendance);

        System.out.println(studentFirstName);
        System.out.println(studentLastName);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
        System.out.println("What do you want to update it to?");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA);
    }

}
