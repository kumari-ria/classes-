import java.util.*;

public class triangle {
    void areaoftriangle(int b, int h) {
        float area = (1 / 2f * b * h);
        System.out.println("Area of triangle is " + area);
    }

    public static void main(String args[]) {
        triangle obj = new triangle();
        System.out.println("enter base and height of triangle :");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();

        obj.areaoftriangle(b, h);
    }
}
