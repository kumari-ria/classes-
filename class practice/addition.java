import java.util.*;

class addition {
    void sum(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public static void main(String args[]) {
        addition obj = new addition();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        obj.sum(a, b);
    }
}
