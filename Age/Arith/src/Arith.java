
		import java.util.Scanner;
        
		public class Arith
		{
		    public static void main(String args[])
		  {
		    int first, second, add, subtract, multiply;
		    float divide=0;
		    Scanner scanner = new Scanner(System.in);

		    System.out.print("Enter Two Numbers : ");
		    first = scanner.nextInt();
		    second = scanner.nextInt();

		    add = first + second;
		    subtract = first - second;
		    multiply = first * second;
		    if(second>0)
		    {
		    divide = (float) (first / second);
		    }
		    else
		    {
		    	System.out.println("Denominator is less than 0 and division not posible");
		    }

		    System.out.println("Sum = " + add);
		    System.out.println("Difference = " + subtract);
		    System.out.println("Multiplication = " + multiply);
		    System.out.println("Division = " + divide);
		  }
	}


