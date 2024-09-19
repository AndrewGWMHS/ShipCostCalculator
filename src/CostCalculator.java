import java.util.Scanner;
public class CostCalculator {
    public static void main(String[] args) {
        //variables
        Scanner scan = new Scanner(System.in);
        double itemPrice;
        double SHIPPING_TAX = 0.02;
        double shippingCost;
        double totalPrice;

        System.out.println("Enter the price of the item.");
        if (scan.hasNextDouble()) { //detecting if the input is a double
            itemPrice = scan.nextDouble();
            if (itemPrice > -1) { //detecting if the price is a valid price range (bigger than a negative)
                if (itemPrice >= 100) { //checking if the price of the item is bigger or less than 100
                    System.out.println("The total cost of your purchase is $" + itemPrice); //if the price is more or equal to 100
                }
                else  //if the price is less than 100
                {
                    shippingCost = itemPrice * SHIPPING_TAX;
                    totalPrice = itemPrice + shippingCost;
                    System.out.println("The shipping cost of your item is $" + itemPrice + " The total cost of your purchase with tax is $" + totalPrice + ".");
                }
            }
            else //ends program if the price is invalid
            {
                System.out.println("Entered invalid price");
                System.exit(0);
            }
        }
        else //ends program if the data type is invalid
        {
            System.out.println("Invalid data type entered");
            System.exit(0);
        }
    }
}


