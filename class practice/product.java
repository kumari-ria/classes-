import java.util.*;

public class product {
    int id;
    String productname;;
    float price;
    int cgst;
    int sgst;
    int final_total;

    void calculation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the product id");
        id = sc.nextInt();
        System.out.println("enter the product name ");
        productname = sc.nextLine();
        System.out.println("enter the price of product");
        price = sc.nextInt();
        System.out.println("product id is" + id);
        System.out.println("product name is " + productname);
        System.out.println("price is " + price);
        cgst = (int) (price * 0.9);
        System.out.println("cgst is" + cgst);
        sgst = (int) (price * 0.9);
        System.out.println("sgst is" + sgst);
        final_total = (int) (price + cgst + sgst);
        System.out.println("the final cost is " + final_total);

    }

    public static void main(String args[]) {
        product obj = new product();
        obj.calculation();
    }
}
