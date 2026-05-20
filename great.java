import java.util.*;

class great {
    public static void main(String args[]) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        a = sc.nextInt();
        System.out.println("enter the value of b ");
        b = sc.nextInt();
        System.out.println("enter the value of c ");
        c = sc.nextInt();
        System.out.println("TEST CASE 1: ");
        if ((a >= b) && (b >= c)) {
            System.out.println("series: " + a + b + c);
        } else if ((a >= c) && (c >= b)) {
            System.out.println("series: " + a + c + b);
        } else if ((b >= a) && (c >= a)) {
            System.out.println("series: " + b + c + a);
        } else if ((b >= a) && (a >= c)) {
            System.out.println("series: " + b + a + c);
        } else if ((c >= a) && (a >= b)) {
            System.out.println("series: " + c + a + b);
        } else if ((c >= b) && (b >= a)) {
            System.out.println("series: " + c + b + a);
        }

        System.out.println("TEST CASE 2: ");
        if ((a == b) && (b == a)) {
            System.out.println("series :" + a + b + c);
        } else if ((a == c) && (c == a)) {
            System.out.println("series :" + a + c + b);
        } else if ((b == c) && (c == b)) {
            System.out.println("series :" + c + b + a);
        }
        System.out.println("TEST CASE 3:");
        if ((a == b) && (b == c)) {
            System.out.println("series: " + a + b + c);
        }

    }
}