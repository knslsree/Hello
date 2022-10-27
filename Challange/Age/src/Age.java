import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=0;
Scanner scan= new Scanner(System.in);
age=scan.nextInt();
if(age>18)
{
	System.out.println("The child is not a minor");
	
}
else
	{
	System.out.println("The chidl is a minor");
	}

}
}