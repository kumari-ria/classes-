import java.util.*;

public class calcuate {
    public static void main(String[] args) {
        String name;
        char gender;
        int height;
        float weight;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name ");
        name = sc.nextLine();
        System.out.println("enter the gender 'M' or 'F'");
        gender = sc.next().charAt(0);
        System.out.println("enter the height");
        height = sc.nextInt();
        System.out.println("enter the weight ");
        weight = sc.nextInt();

        if (gender == 'M') {
            if ((height >= 175) && (weight >= 65)) {
                System.out.println("u are eligible for nda");
            } else {
                System.out.println("u are not eligible for nda");
            }
        }
        if (gender == 'F') {
            if ((height >= 155) && (weight >= 55)) {
                System.out.println("u are eligible for nda");
            } else {
                System.out.println("u are not eligible for nda");
            }

        }
    }

}
