import java.util.*;

class Prime{
	public static void main(String[] args){
			System.out.println("Enter Number:");
			Scanner scan = new Scanner(System.in);
			int number = scan.nextInt();
			int m=0;
			for(int i=2;i<number;i++){
				if(number%i==0){
					m++;
				}	
			}
			if(m==0){
				System.out.println(number+" is prime number");
			}
			else{
				System.out.println(number+" is not prime number");
			}
	}
}