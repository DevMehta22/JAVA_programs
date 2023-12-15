import java.util.*;

class FirstNPrime{
	public static void main(String[] args){
			System.out.println("Enter Number:");
			Scanner scan = new Scanner(System.in);
			int number = scan.nextInt();
			int n=0;
			for(int i=2;;i++){
				int m=0;
				for(int j=2;j<i;j++){
					if(i%j==0){
						m=1;
					}
				}
				if(m==0){
						System.out.print(i+" ");
						n++;
					}
				
				if(n==number){
					break;
				}
			}
				
	}
}