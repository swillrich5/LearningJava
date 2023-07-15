public class Main {
    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.45;
        char studentFirstInitial = 'S';
        char studentLastInitial = 'W';
        boolean hasPerfectAttendance = false;
        String studentFirstName = "Chico";
        String studentLastName = "Willrich";

        System.out.println("The student's age is " + studentAge);
        System.out.println("The student's GPA is " + studentGPA);
        System.out.println("The student's first initial is " + studentFirstInitial);
        System.out.println("The student's first initial is " + studentLastInitial);
        System.out.println("The student's name is " + studentFirstName + " " + studentLastName + ".");
        System.out.println("The Student's first initial is " + studentFirstName.charAt(0));
        System.out.println("The Student's first initial is " + studentLastName.charAt(0));
        if (hasPerfectAttendance) {
            System.out.println("The student has perfect attendance.");
        }
        else System.out.println("The student's attendance is not perfect");
    }
}
