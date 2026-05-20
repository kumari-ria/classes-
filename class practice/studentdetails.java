import java.util.*;

public class studentdetails {

    // Method to display student details
    void details(int rollno, String name, int sub1, int sub2, int sub3) {
        float percentage = (sub1 + sub2 + sub3) / 3.0f;

        System.out.println("\n----- Student Details -----");
        System.out.println("Roll No      : " + rollno);
        System.out.println("Name         : " + name);
        System.out.println("Subject 1    : " + sub1);
        System.out.println("Subject 2    : " + sub2);
        System.out.println("Subject 3    : " + sub3);
        System.out.println("Percentage   : " + percentage + "%");
        if (percentage >= 0) {
            System.out.println("the student is pass");
        } else if (percentage == 0) {
            System.out.println("the student is failed");
        }
        if (percentage > 75) {
            System.out.println("u scored A grade");
        } else if ((percentage > 75) && (percentage < 60)) {
            System.out.println("u scored B grade");
        } else {
            System.out.println("u got c grade");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        studentdetails obj = new studentdetails();

        // Input Roll Number
        System.out.print("Enter the Roll No: ");
        int rollno = sc.nextInt();

        // Clear the newline left by nextInt()
        sc.nextLine();

        // Input Name
        System.out.print("Enter the Name: ");
        String name = sc.nextLine();

        // Input Subject Marks
        System.out.println("Enter marks of 3 subjects:");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();

        // Call method to display details
        obj.details(rollno, name, sub1, sub2, sub3);

    }
}