import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // initialising
		        double celsius , fahrenheit ;
		        System.out.println("Enter the temperature in celsius");
		        Scanner scan= new Scanner(System.in);
		        celsius=scan.nextDouble();
		       
		        // formula for conversion
		        fahrenheit = (celsius * 1.8) + 32;
		        System.out.println(
		            " value of temperature in fahrenheit:"
		            + fahrenheit);
		    }
		

	}


