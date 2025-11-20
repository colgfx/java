import java.util.Scanner;
class product{
    String productname;
    double price;
    product (String productname, double price){
        this.productname=productname;
        this.price=price;
    }
    void applydiscount(double percentage){
        double discountamount = (percentage /100)* price;
        price = price - discountamount;
    }
    void displayproductinfo(){
        System.out.println("the product "+productname);
        System.out.println("discount"+price);
    }
}
public class main {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("name");
        String name=input.nextLine();
        System.out.println("price");
        double price=input.nextDouble();
        System.out.println("discount%");
        double discount = input.nextDouble();
        product p=new product(name, price);
        p.applydiscount(discount);
        p.displayproductinfo();
    }
}