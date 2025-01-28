import java.util.Scanner;

public class shopping_cart {
    public static void main(String[] args) {

        //shopping cart program (considering you can only order one type of item once)

        Scanner sc = new Scanner(System.in);

        String item1 = "Cheese Burger";
        String item2 = "Fries";
        String item3 = "Coke";
        String bill_item = null;
        Double bill = null;
        Double item1_price = 3.99;
        Double item2_price = 2.99;
        Double item3_price = 1.99;
        char currency;
        currency = '$';


        System.out.println("choose the items you want (1- Cheese Burger, 2- Fries, 3- Coke): ");
        int order = sc.nextInt();

        if (order == 1){
            bill_item = item1;
            bill = item1_price;
        }
        else if (order == 2){
            bill_item = item2;
            bill = item2_price;
        }
        else if (order == 3) {
            bill_item = item3;
            bill = item3_price;
        }
        else if (order == 12 || order== 21 ) {
            bill_item = item1 +" "+ item2;
            bill = item1_price+item2_price;
        }
        else if (order == 13 || order== 31 ) {
            bill_item = item1 +" "+ item3;
            bill = item2_price+item3_price;
        }
        else if (order == 23 || order== 32 ) {
            bill_item = item2 +" "+ item3;
            bill = item2_price+item3_price;
        }
        else if (order == 123 || order== 213 || order == 132 || order == 312 || order ==321 || order == 231) {
            bill_item = item1 +" "+ item2 +" "+ item3;
            bill = item1_price+item2_price+item3_price;
        }


        System.out.println("You have order " + bill_item + " and your total is " + currency + bill);
        System.out.println("Have a nice day!");



    }
}
