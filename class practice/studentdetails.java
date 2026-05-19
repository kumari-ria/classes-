import java.util.*;

public class studentdetails {
    void details() {
        int rollno;
        String name;
        int sub1, sub2, sub3;
        float percentage;
    }

    public static void main(String args[]) {
        studentdetails obj = new studentdetails();
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the rollno");
        int rollno = sc.nextInt();
        System.out.println("enter the name ");
        String name = sc.nextLine();
        System.out.println("enter the marks of 3 subjects");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        float percentage = (sub1 + sub2 + sub3) / 3f;
        System.out.println("rollno is " + rollno);
        System.out.println("name is " + name);
        System.out.println("percentage is " + percentage);
        obj.details();
    }
}
