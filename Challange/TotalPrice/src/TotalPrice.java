import java.util.Scanner;
public class TotalPrice
{
    public static void main(String[] args) 
    {
        // create scanner class object
        Scanner sc = new Scanner(System.in);
        // prompt user to enter original price
        System.out.print("Enter original price: ");
        double originalPrice = sc.nextDouble();
        // prompt user to enter discount percentage
       double discountPercentage= 13;
        
        // calculate discounted price
        double discountedPrice = originalPrice - (originalPrice * discountPercentage / 100);
        // display discounted price
        System.out.println("Discounted price is " + discountedPrice);
    }
}
