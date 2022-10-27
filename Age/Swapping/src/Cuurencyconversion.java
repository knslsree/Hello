import java.util.*;
public class Cuurencyconversion{
    
    
    public static void main(String[] args){
    	
    	double sek=0;
        
    	System.out.println("Enter the Amount in brl: ");
        Scanner sc = new Scanner(System.in);
        
        
        double brl = sc.nextDouble();
        
         sek = 2.1014 * brl;
        
        System.out.println(brl +"brl in sek is equal to  "+sek);
        
    }
    
}