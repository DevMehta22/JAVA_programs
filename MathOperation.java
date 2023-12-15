import java.util.*;

class MathOp{
	public static void main(String[] args){
		System.out.println("Enter Number1:");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println("Enter Number2:");
		int num2 = scan.nextInt();
		System.out.println("Addition is:" + (num1+num2));
		System.out.println("Subtraction is:" + (num1-num2));
		System.out.println("Multiplication is:" + (num1*num2));
		System.out.println("Division is:" + (num1/num2));
		
	}
}