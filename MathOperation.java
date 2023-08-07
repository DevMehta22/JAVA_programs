import java.util.*;

class MathOp{
	public static void main(String[] args){
		System.out.println("Enter Number1:");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println("Enter Number2:");
		int num2 = scan.nextInt();
		System.out.println("Enter the operation(+,-,/,*): ");
		String operation = scan.nextLine();
		System.out.println(operation);		
	}
}