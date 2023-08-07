import java.util.*;

class MarksToGrade{
	public static void main(String[] args){
			System.out.println("Enter Marks:");
			Scanner scan = new Scanner(System.in);
			float Marks = scan.nextFloat();
			
			if(Marks>=90){
				System.out.println("Grade:O");
			}
			else if(Marks>=80 && Marks<90){
				System.out.println("Grade:A+");
			}
			else if(Marks>=70 && Marks<80){
				System.out.println("Grade:A");
			}
			else if(Marks>=60 && Marks<70){
				System.out.println("Grade:B+");
			}
			else if(Marks>=50 && Marks<60){
				System.out.println("Grade:B");
			}
			else if(Marks>=40 && Marks<50){
				System.out.println("Grade:C");
			}
			else{
				System.out.println("Fail!!");
			}
			
			
			
	}
}