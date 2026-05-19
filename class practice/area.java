import java.util.*;

public class area {
    void a(int r) {
        float ar = (3.14f * r * r);
        System.out.println("Area of circle is " + ar);
    }

    public static void main(String args[]) {
        area obj = new area();
        System.out.println("enter radius of circle :");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        obj.a(r);
    }
}
