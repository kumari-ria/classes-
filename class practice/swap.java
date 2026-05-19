public class swap {
    int a = 10;
    int b = 20;

    void swap() {
        int temp = a;
        a = b;
        b = temp;
        System.out.print("after swapping a is " + a + "and" + b);
    }

    public static void main(String args[]) {
        swap obj = new swap();
        obj.swap();
    }
}
